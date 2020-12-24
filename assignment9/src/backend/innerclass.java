package backend;

import java.awt.Shape;

import entyti.shape;

public class innerclass {
	public static void main(String[] args) {
		shape shape1 = new shape("hinh chu nhat");
		shape.Coordinate coordinate = shape1.new Coordinate(3.0f,3.0f);		
		shape1.coordinate = coordinate;
		System.out.println(shape1.coordinate.toString());
		
	}
	
	
	
}
