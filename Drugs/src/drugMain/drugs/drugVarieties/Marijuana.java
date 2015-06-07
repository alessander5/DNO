package drugMain.drugs.drugVarieties;

import utils.entity.Entity;
import drugMain.drugs.Drug;

public class Marijuana extends Drug{
	
	public static double PRICE = 60.00;
	
	public Marijuana() {
		setName("Marijuana");
		setCost(Marijuana.PRICE);
	}
	
	@Override
	public Entity getNewInstance() {
		return new Marijuana();
	}
}
