package ct07_47;

public class Animal {
	
	private String species;
	
	private int age;
	
	private String healthStatus;
	

	
	public Animal(String species,int age,String healthStatus) {
		this.species = species;
		this.healthStatus = healthStatus;
		this.age = age;
	}

	public String getSpecies() {
		return species;
	}

	public void setSpecies(String species) {
		this.species = species;
	}
	
	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getHealthStatus() {
		return healthStatus;
	}

	public void setHealthStatus(String healthStatus) {
		this.healthStatus = healthStatus;
	}


	
	
	
	
	

}
