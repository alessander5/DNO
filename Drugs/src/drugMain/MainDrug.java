package drugMain;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.ObjectInputStream.GetField;
import java.nio.Buffer;
import java.util.ArrayList;
import java.util.List;

import drugMain.drugs.Drug;
import drugMain.drugs.Drugs;
import drugMain.drugs.IDrugs;
import drugMain.drugs.Weight;
import drugMain.drugs.drugVarieties.Cannabis;
import utils.Utils;
import utils.entity.Entity;
import utils.factory.Factory;
import utils.io.In;
import utils.plugin.Plugin;
import utils.provider.IProvider;

public class MainDrug extends Plugin{

	private static int getWeight(Drug drug, String userInput) {
		int inputGramms = 0;
		if(userInput.equalsIgnoreCase(Weight.KILOGRAM.getName()))       inputGramms = Weight.KILOGRAM.getWeight();
		else if(userInput.equalsIgnoreCase(Weight.POUND.getName()))		inputGramms = Weight.POUND.getWeight();
		else if(userInput.equalsIgnoreCase(Weight.MATCHBOX.getName()))	inputGramms = Weight.MATCHBOX.getWeight();
		else if(userInput.equalsIgnoreCase(Weight.OUNCE.getName()))     inputGramms = Weight.OUNCE.getWeight();
		else if(userInput.equalsIgnoreCase(Weight.TEST.getName()))      inputGramms = Weight.TEST.getWeight();
		else
			try{
				inputGramms = Integer.parseInt(userInput);
			}catch(NumberFormatException nfe){
				System.out.println("Error weight");
				inputGramms = 0;
			}
		return inputGramms;
	}

	private static void buy(Drug drug, int weight) {
		double price = 0;
		if(!(weight==0)){
			if (drug.isAvailableWeight(weight)){
				price = drug.buy(weight);
				System.out.println("That's your " + drug.getName() + ", weight = " + weight +". It costs " +
						price + "$" );
			}else
				System.out.println("We have not that weight.");
		}
	}
	
	@Override
	public void go() {
		
		Utils util = new Factory();
		
		IDrugs drugs = new Drugs();
		
		if(In.getUserInput("What do you want?").equalsIgnoreCase("list")) 		
			System.out.println(drugs.getDrugsList());
		
		Drug purchase = drugs.getDrugByName(In.getUserInput("Need something?"));
		System.out.println(purchase.getName());
			
		if(!purchase.isEmpty())
			buy(purchase,getWeight(purchase,In.getUserInput("How much?")));	
		
		List<Entity> list = new ArrayList<Entity>();
		list.add(new Cannabis());
		util.getEntities(list);
		
	}
	
}
