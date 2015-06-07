package drugMain.drugs.drugVarieties;

import utils.entity.Entity;
import drugMain.drugs.Drug;

public class Cannabis extends Drug{

	public static double PRICE = 15.00;
	public Cannabis() {
		setName("Cannabis");
		setCost(Cannabis.PRICE);
	}
	
	@Override
	public Entity getNewInstance() {
		return new Cannabis();
	}
	
}
