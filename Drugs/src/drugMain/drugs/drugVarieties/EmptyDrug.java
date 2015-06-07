package drugMain.drugs.drugVarieties;

import utils.entity.Entity;
import drugMain.drugs.Drug;
import drugMain.drugs.Weight;

public class EmptyDrug extends Drug {

	
	public EmptyDrug() {
		setName("No such drug");
	}
	
	@Override
	public boolean isAvailableWeight(Weight weight) {
		return false;
	}
	
	@Override
	public Entity getNewInstance() {
		return new EmptyDrug();
	}

}
