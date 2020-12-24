package frontend;

public class generic {
	public static void main(String[] args) {
		printf(1, 2);
		printf2(1, "abd");
	}

	public static void printf(int a, int b) {
		System.out.println(a);
		System.out.println(b);
	}

	// T để người dùng có thể nhập kiểu String hay int tùy ý.
	static <T> void printf2(T a, T b) {
		System.out.println(a);
		System.out.println(b);
	}
}
