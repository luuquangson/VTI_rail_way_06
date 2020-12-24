package entyti;

public class Car {
	String name;
	String type;
	Enginee enginee;
	public Car(String name, String type) {
		super();
		this.name = name;
		this.type = type;

	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public class Enginee {
		String engineeType;

		public Enginee(String engineeType) {
			super();
			this.engineeType = engineeType;
		}

		public String getEngineeType() {
			return engineeType;
		}

		public void setEngineeType(String engineeType) {
			this.engineeType = engineeType;
			
		}

	}

	@Override
	public String toString() {
		return "Car [name=" + name + ", type=" + type + "]";
	}

}
