/*

This is a multiline comment... :P

*/

public class Bicycle{

// Put member variables here
	int wheels;
	int seats;
	int gears;
	boolean brake;
	int speed;

/*
Methods that only have () are said not to have any parameters
If you want to throw some info/data to the methods you must
Allow Methods to accept parameters
*/

	public Bicycle(){
		this.wheels = 2;
		this.seats = 1;
		this.gears = 2;
		this.brake = true;
		this.speed = 0;

	}
//			(v This below are Parameters v)
	public Bicycle(int a, int b, int c, boolean haveBrakes){
		this.wheels = a;
		this.seats = b;
		this.gears = c;
		this.brake = haveBrakes;
		this.speed = 0;

	}

// void in the following line is the return variable after calling the method
// void means nothing returns when method is called
	public void Move(){

		this.speed = 5;
		System.out.println("It works");

	}

// Boolean is the return method and when called returns boolean value
	public boolean Brake(){

		this.speed = 0;
		return true;

	}

}
