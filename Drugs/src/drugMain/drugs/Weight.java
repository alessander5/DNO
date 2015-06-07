package drugMain.drugs;

public enum Weight {
	TEST("test",1), // porba
	OUNCE("ounce",28), //28 grams
	MATCHBOX("matchbox",63), //63 grams
	POUND("pound",453), //453 grams
	KILOGRAM("kg",1000); //1000 grams
	
	private int weight;
	private String name;
	
	
	private Weight(String name, int weight) {
		this.name = name;
		this.weight = weight;
	}
	
	public int getWeight(){
		return weight; 
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
}
