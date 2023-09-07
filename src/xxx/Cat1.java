package xxx;

import java.io.Serializable;

public class Cat1 extends Pet {
	

	public Cat1(String name) {
		super(name);
	}

	public void speak() {
		System.out.println("This is Cat1 " + name + " speaking!");
	}

}
