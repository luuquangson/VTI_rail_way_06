package backend;

import entyti.MyMath;
import entyti.MyNumber;
import entyti.Salary;

public class exe4 {
	// question1:
	public void question1() {
		Salary<Integer> salary = new Salary<Integer>(999);
		System.out.println(salary);
	}

	// question2:
	public void question2() {
		MyNumber<Double> number = new MyNumber<Double>(999.99);
		System.out.println(number);
	}

	// question3:
	public void question3() {

		MyMath<Integer> math = new MyMath<>();
		int maxInt = math.maximum(1, 10, 8);
		System.out.println(maxInt);
		float maxFloat = math.maximum(1.5f, 10.3f, 10.2f);
		System.out.println(maxFloat);
	}
	// question4:
	public void question4() {
		MyMath<Integer> mathInt = new MyMath<>();

		Integer sumInt1 = mathInt.add(2 ,4);
		System.out.println(sumInt1);

		int sumInt2 = mathInt.add(5, 3, 12);
		System.out.println(sumInt2);

		int sumInt3 = mathInt.add(2 , 3 ,4 , 5);
		System.out.println(sumInt3);

		
		int subInt1 = mathInt.subtract(10, 1);
		System.out.println(subInt1);

		int subInt4 = mathInt.subtract(10, 5);
		System.out.println(subInt4);
	}
		
		
		
		
		
		
		
		
		

}