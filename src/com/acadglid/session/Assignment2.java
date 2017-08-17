/*
 * Problem Statement
Create an abstract class Figure with following properties and functions:
Properties:
double dim1;
Methods: abstract void
findArea(); abstract void
findPerimeter();
Create three subclasses Circle, Rectangle and Triangle that extends Figure class and define both
the methods. Write a program that will find the area and perimeter of 3 Figures and print the
details for all.
 */

package com.acadglid.session;

public class Assignment2 {



	public static void main(String[] args) {

		// Circle details.	
		Circle objCircle = new Circle();  

		objCircle.dim = 34 ; 

		objCircle.findArea();
		objCircle.findPerimeter();

		//Rectangle details 

		Rectangle objRect = new Rectangle();

		objRect.height =2.0;
		objRect.width = 3.0;

		objRect.findArea();
		objRect.findPerimeter();


		//Triangle details 

		Triangle objTri = new Triangle();

		objTri.a =2 ; //side A
		objTri.b = 3; //Side B
		objTri.c = 4; //Side C

		objTri.base = 2.0 ;
		objTri.height =6.0;

		objTri.findArea();
		objTri.findPerimeter();





	}

















}
