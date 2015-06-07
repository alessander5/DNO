package drugMain.drugs;

import java.util.ArrayList;
import java.util.Collection;

import drugMain.drugs.drugVarieties.Cannabis;
import drugMain.drugs.drugVarieties.Cocain;
import drugMain.drugs.drugVarieties.EmptyDrug;
import drugMain.drugs.drugVarieties.LSD;
import drugMain.drugs.drugVarieties.Marijuana;

public class Drugs implements IDrugs{
	private Collection<Drug> drugs = new ArrayList<Drug>();
	private Drug emptyDrug;
	
	public Drugs() {
		addDrug(new Cocain(), 20_000);
		addDrug(new Cannabis(), 20);
		addDrug(new Marijuana());
		addDrug(new LSD());
	}
	
	private void addDrug(Drug newDrug){
		newDrug.setAvailableWeight(1000); //default
		drugs.add(newDrug);
	}
	
	private void addDrug(Drug newDrug, int weight){
		newDrug.setAvailableWeight(weight);
		drugs.add(newDrug);
	}
	
	@Override
	public String getDrugsList() {
		StringBuilder sb = new StringBuilder();
		for (Drug drug : drugs) 
			sb.append(drug.getName() + " ");
		return sb.toString();
	}

	@Override
	public Drug getDrugByName(String drugName) {
		for (Drug drug : drugs) 
			if (drug.getName().equalsIgnoreCase(drugName)) 
				return drug;
		return getEmptyDrug();
	}

	private Drug getEmptyDrug() {
		if (emptyDrug==null) 
			emptyDrug = new EmptyDrug();
		return emptyDrug;
	}

}
