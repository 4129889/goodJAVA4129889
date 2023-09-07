package xxx;

import java.io.Serial;
import java.io.Serializable;

public abstract class Pet implements Serializable{
	@Serial
	private static final long serialVersionUID = 1L;
	protected String name;
	    public Pet(String name) {
	        this.name = name;
	    }
	
	public abstract void speak();
}

