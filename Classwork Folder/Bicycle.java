/*

This is a multiline comment... :P

*/

public class Bicycle{

// Put member variables here
		int wheels;
        int seats;
        boolean hasGears;
        int gearNumber;
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
		this.hasGears = false;
		this.gearNumber = 0;
		this.brake = true;
		this.speed = 0;

	}
//							(v This below are Parameters v)
	public Bicycle(boolean hGear, int gNum, boolean haveBrakes){
        this.wheels = 2;
    	this.seats = 1;
	    this.hasGears = hGear;
        this.gearNumber = gNum;
        this.brake = haveBrakes;                
		this.speed = 0;

	}

// void in the following line is the return variable after calling the method
// void means nothing returns when method is called
	public void Pedal(){

		this.speed = this.speed + 5;
		System.out.println("Bicycle is moving at " + this.speed + " Units per minute.");

	}

// Boolean is the return method and when called returns boolean value
	public boolean Brake(){
		
		if(this.brake== false){
			System.out.println("Bicycle has no Brakes! Slow Down!");
			return false;
		}
        this.speed = 0;
        System.out.println("Bicycle has stopped.");
        return true;

	}

// Returns current speed of the bicycle
	public int getSpeed(){
            return this.speed;
    }

    public boolean haveBrakes(){
            return this.brake;
    }

    public boolean haveGears(){
            return this.hasGears;
    }

}
