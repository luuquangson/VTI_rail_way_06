package entyti;

public class MyMath<N extends Number> {

	public N add(N... numbers) {

		Double sum = 0d;

		for (N number : numbers) {
			sum += number.doubleValue();
		}

		return (N) sum;
	}

	public <T extends Comparable<T>> T maximum(T x, T y, T z) {

		T max = x;

		if (y.compareTo(max) > 0) {
			max = y;
		}

		if (z.compareTo(max) > 0) {
			max = z;
		}

		return max;
	}

	
	public N subtract(N x, N y) {
		Double subtract = x.doubleValue() - y.doubleValue();

		return (N) subtract;
	}

}
