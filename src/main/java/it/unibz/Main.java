package it.unibz;

/**
 *
 * @author Philipp Neugebauer
 *
 */
public class Main {

	public static void main(String[] args) {
		Animal animal = new Animal();
		Animal catAnimal = new Cat();
		Cat cat = new Cat();
		animal.greet(catAnimal);
		animal.greet(cat);
		catAnimal.greet(animal);
		catAnimal.greet(cat);
		cat.greet(animal);
		cat.greet(catAnimal);
	}
}
