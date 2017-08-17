package com.acadglid.session;

public class Rectangle extends Figure {
	
	 double width ;
	 double height;
	
	
	
	void findArea() {
		
		
		System.out.println("Area of the Rectangle is width * height  -->"+(width*height));
	
		
	}

	
	void findPerimeter() {
		
		//2(w+H)
		System.out.println("Perimeter of the Rectangle is 2(width + height)  -->"+2*(width+height));
	}

}
