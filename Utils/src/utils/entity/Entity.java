package utils.entity;

public abstract class Entity {
	String name;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	public abstract Entity getNewInstance();
}
