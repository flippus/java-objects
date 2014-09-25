package it.unibz;

/**
 *
 * @author Philipp Neugebauer
 *
 */
public class Animal {

	void voice() {
		System.out.println("??");
	}

	void voice(int i) {
		for (int j = 0; j < i; j++) {
			voice();
		}
	}

	void greet(Animal animal) {
		System.out.println("Hi animal");
		animal.voice();
	}

	void greet(Cat cat) {
		System.out.println("Hi cat");
		cat.voice();
	}

}
