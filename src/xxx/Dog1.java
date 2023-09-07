package xxx;

import java.io.Serializable;

public class Dog1 extends Pet {
	
	public Dog1(String name) {
		super(name);
	}

	public void speak() {
		System.out.println("This is Dog1 " + this.name + " speaking.");
	}
}

