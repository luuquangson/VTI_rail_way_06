package entity;
import java.util.Scanner;
public class scannerUtils {
	private static Scanner scanner = new Scanner(System.in);

	public static int inputInt(String errorMessage) {
		while (true) {
			try {
				return Integer.parseInt(scanner.nextLine());
			} catch (Exception e) {
				System.err.println(errorMessage);
			}
		}

	}

	public static float inputfloat(String errorMessage) {
		while (true) {
			try {
				return Float.parseFloat(scanner.nextLine());
			} catch (Exception e) {
				System.err.println(errorMessage);
			}
		}
	}
	public static double inputdouble(String errorMessasge) {
		while (true) {
			try {
				return Double.parseDouble(scanner.nextLine());
			} catch (Exception e) {
				System.err.println(errorMessasge);
			}
		}
	}
	public static String inputString(String errorMessage) {
		while (true) {
			String input = scanner.nextLine() ;
			if (!input.isEmpty()) {
				return input ;
			} else {
			System.err.println(errorMessage);
			}
		}
	}
}



























