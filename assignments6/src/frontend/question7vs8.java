package frontend;

import java.util.Scanner;

import entity.scannerUtils;

public class question7vs8 {

	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
		System.out.println("nhap id");
		int id = scannerUtils.inputInt("id phải nhập là 1 số, hãy nhập lại :");
		System.out.println("id của bạn là " + id);		
		
		System.out.println("nhap 1 so bat ki");
		float floats = scannerUtils.inputfloat("bạn phải nhập 1 float :");
		System.out.println("float cua ban la" + floats);
				
		System.out.println("nhap 1 so bat ki ");
		double doubles = scannerUtils.inputdouble("bạn phải nhập 1 số :");
		System.out.println("so cua ban la" + doubles);
	}
}
