/* 
 * Class circle which will extend figure class and implements the methods
 * 
 */

package com.acadglid.session;

public class Circle extends Figure{


	private double PI = 3.14 ;  

	void findArea() {

		//constant the value of PI 

		System.out.println(" The Area of the circle π*r*r-->"+PI*(this.dim*this.dim));  //area of circle = πr*r

	}


	void findPerimeter() {


		System.out.println(" The Perimeter of the circle 2*π*r-->"+(2*PI*(this.dim))); //perimeter of circle = 2πr

	}

}
