package frontend;
import entyti.Outerclass;
import entyti.Outerclass.InnerClass;
public class mainclass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Outerclass outerclass = new Outerclass();
		outerclass.show();
		
		InnerClass innerClass = outerclass.new InnerClass();
		innerClass.show();
	}

}
