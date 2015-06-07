package drugMain.drugs;

import utils.entity.Entity;


public abstract class Drug extends Entity{
	private double cost; // per gramm
	private int efficiency;
	private int availableWeight;
	
	public double getCost() {
		return cost;
	}
	public void setCost(double cost) {
		this.cost = cost;
	}
	public int getEfficiency() {
		return efficiency;
	}
	public void setEfficiency(int efficiency) {
		this.efficiency = efficiency;
	}
	
	public String toString(){
		return getName();
	}
	public int getAvailableWeight() {
		return availableWeight;
	}
	public boolean setAvailableWeight(int availableWeight) {
		if(availableWeight<=0)
			return false;
		this.availableWeight = availableWeight;
		return true;
	}
	
	public boolean isAvailableWeight(Weight weight) {
		return isAvailableWeight(weight.getWeight());
	}
	
	public boolean isAvailableWeight(int weight) {
		return getAvailableWeight()>=weight;
	}
	// 
	//public abstract IDealer getDealer();
	// 
	//public abstract IDealer getWholesaler();
	
	public double buy(Weight weight) {
		return buy(weight.getWeight());
	}
	
	public double buy(int weight) {
		setAvailableWeight(getAvailableWeight()-weight);
		return getPrice(weight);
	}
	
	private double getPrice(int weight) {
		return weight*getCost();
	}
	
	public boolean isEmpty() {
		boolean isEmpty;
		try{
			isEmpty = this.getClass().getName().toString().equalsIgnoreCase("main.drugs.drugVarieties.EmptyDrug");
		}catch(Exception e){
			isEmpty = true;
		}
		return isEmpty;
	}
	
}
