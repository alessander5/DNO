package utils.factory;

import java.util.ArrayList;
import java.util.List;

import utils.AUtils;
import utils.entity.Entity;

public class Factory extends AUtils{

	@Override
	public List<Entity> getEntities(List<Entity> objects) {
		List<Entity> returnList = new ArrayList<Entity>();
		for (Entity entity : returnList) 
			returnList.add(entity.getNewInstance());
		
		return returnList;
	}

}
