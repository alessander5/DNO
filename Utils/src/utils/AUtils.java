package utils;

import java.util.List;
import utils.dealer.Dealer;
import utils.entity.Entity;
import utils.provider.Provider;

public abstract class AUtils {

	public abstract List<Entity> getEntities();
	
	public abstract void setEntities(List<Entity> entities);
	
	public abstract List<Provider> getProviders();
	
	public abstract void setProviders(List<Provider> providers);
	
	public abstract List<Dealer> getDealers();
	
	public abstract void setDealers(List<Dealer> dealers);	
	
}
