package com.acadglid.session;

public class Triangle extends Figure {

	double a,b,c , base, height;


	void findArea() {

		System.out.println("Area of the Triagle is 1/2(base*height) -->"+(base*height)/2); //area half base*hieight
	}

	void findPerimeter() {

		System.out.println("Perimeter of the Triagle is A+B+C where A B C are sides of triange -->"+(a+b+c)); 

	}

}
