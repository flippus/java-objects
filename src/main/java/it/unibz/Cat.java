package it.unibz;
public class Cat extends Animal {

	@Override
	void voice() {
		System.out.println("miau");
	}

	@Override
	void voice(int i) {
		for (int j = 0; j < i; j++) {
			voice();
		}
	}

}
