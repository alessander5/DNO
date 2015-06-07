package drugMain.drugs.drugVarieties;

import utils.entity.Entity;
import drugMain.drugs.Drug;

public class LSD extends Drug{

	public static double PRICE = 100.00;
	
	public LSD() {
		setName("LSD");
		setCost(LSD.PRICE);
	}
	
	@Override
	public Entity getNewInstance() {
		return new LSD();
	}
}
