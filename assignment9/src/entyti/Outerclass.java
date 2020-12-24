package entyti;

public class Outerclass {
	public  void show() {
		InnerClass innerClass = new InnerClass();
		innerClass.show();
	}
	public class InnerClass {
		public void show() {
			System.out.println(" day chinh la innerclass");
		}
	}
}
