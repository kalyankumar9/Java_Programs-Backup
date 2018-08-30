
public class Nashville {
	
	private String streetName;
	private int population;
	
	public String getStreetName() {
		return streetName;
	}

	public void setStreetName(String streetName) {
		this.streetName = streetName;
	}

	public int getPopulation() {
		return population;
	}

	public void setPopulation(int population) {
		this.population = population;
	}

	public static void main(String[] args) {
		Nashville n1 = new Nashville();
		Nashville n2 = new Nashville();
		n1.streetName= "Charlotte";
		n1.population= 25000;
		n2.streetName= "steerling";
		n2.population= 12000;
		
	//	System.out.println("Name of Street-"+n1.streetName()+" , "+"Population of Street-"+ n1.population);
		System.out.println("Name of Street-"+n1.getStreetName()+" , "+"Population of Street-"+ n1.getPopulation());
	}

	}
