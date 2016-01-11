public abstract class Animal{
	private String color;
	private String name;


	public Animal(String color,String name){
		this.color = color;
		this.name = name;
	}


	public String getColor(){
		return(color);
	}

	public String getName(){
		return(name);
	}

	//public abstract void toDisplay();

	
}