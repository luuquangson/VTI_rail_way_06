package entyti;

public class shape {
	String name;
	public Coordinate coordinate;

	public shape(String name) {
		super();
		this.name = name;
	}

	static public  class Coordinate {
		float x;
		float y;

		public Coordinate(float x, float y) {
			super();
			this.x = x;
			this.y = y;
		}

		@Override
		public String toString() {
			return "Coordinate [x=" + x + ", y=" + y + "]";
		}

	}

}
