package entyti;

public class StudentGeneric<T> {
	private T id;
	private String name;

	public T getId() {
		return id;
	}

	public void setId(T id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public StudentGeneric(T id, String name) {
		super();
		this.id = id;
		this.name = name;
	}

	public StudentGeneric() {
		super();
	}

	@Override
	public String toString() {
		return "StudentGeneric [id=" + id + ", name=" + name + "]";
	}

	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
