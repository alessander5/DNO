package drugMain.drugs.drugVarieties;

import utils.entity.Entity;
import drugMain.drugs.Drug;

public class Cocain extends Drug {
	
	public static double PRICE = 115.00;
	
	public Cocain() {
		setName("Cocain");
		setCost(Cocain.PRICE);
	}
	
	@Override
	public Entity getNewInstance() {
		return new Cocain();
	}
}
