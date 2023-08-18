/*

This program calculates the area of a trapezoid V2 cause I felt like it since
I already made it during class and wanna try it again but with almost no help this time

*/

public class Trapezoid{

	float baseA;
	float baseB;
	float height;
	float area;

	public Trapezoid(){

		this.baseA = 0;
		this.baseB = 0;
		this.height = 0;
		this.area = 0;

	}
	public Trapezoid(float ba, float bb, float hi){

		this.baseA = ba;
		this.baseB = bb;
		this.height = hi;
		this.area = ((ba+bb)/2)*hi;

	}
	public void printArea(){

		System.out.println("The Area of this Trapezoid is: " + this.area + " Units.");

	}
}
