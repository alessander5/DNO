package utils.factory;

import java.util.ArrayList;
import java.util.List;

import utils.AUtils;
import utils.dealer.Dealer;
import utils.entity.Entity;
import utils.provider.Provider;

public class Factory extends AUtils{

	@Override
	public List<Entity> getEntities(List<Entity> objects) {
		List<Entity> returnList = new ArrayList<Entity>();
		for (Entity entity : returnList) 
			returnList.add(entity.getNewInstance());
		
		return returnList;
	}

	@Override
	public List<Entity> getEntities() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void setEntities(List<Entity> entities) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public List<Provider> getProviders() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void setProviders(List<Provider> providers) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public List<Dealer> getDealers() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void setDealers(List<Dealer> dealers) {
		// TODO Auto-generated method stub
		
	}

}
