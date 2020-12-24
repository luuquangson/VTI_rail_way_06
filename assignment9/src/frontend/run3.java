package frontend;
import entyti.Car;

public class run3 {

	public static void main(String[] args) {
		Car car = new Car("Mazda", "8WD");
		Car.Enginee enginee = car.new Enginee("Cryler");
		System.out.println(enginee.getEngineeType());
	}

}
