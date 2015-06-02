package utils.provider;

import java.util.List;

public interface IProvider {
	Object getEntity();
	List<Object> getEntities();
}
