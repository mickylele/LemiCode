package ct07_47;

public class Zoo {

	public void addAnimal(Animal animal) {

		if (animal != null) {
			System.out.println(animal.getSpecies() + " (年齢: " + animal.getAge() + " 健康状態: " + animal.getHealthStatus()+")");
		}
	}
}
