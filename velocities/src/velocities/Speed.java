/**
 * Kenneth Tran
 * 8/19/19
 * CPSC 39
 */


package velocities;

public class Speed {

	//data variables or instance variables
	private double initialVelocity;
	private double finalVelocity;
	

	//constructor
	public Speed() {
		//initialize your data variables
		initialVelocity = 0;
		finalVelocity = 50;
	}//end of constructor

	//constructor
	public Speed(double initialV, double finalV) {
		//initialize your data variables
		initialVelocity = initialV;
		finalVelocity = finalV;
	}//end of constructor

	//For Initial Velocity
	//get Method or getter, or accessor
	public double getInitialVelocity() {
		return initialVelocity; 
	}//end of accessor
	
	//set method, or setter or mutator
	public void setInitialVelocity(double newVelocity){
		initialVelocity =newVelocity;
	}//end of mutator

	//For Final Velocity 
	//get Method or getter, or accessor
	public double getFinalVelocity() {
		return finalVelocity; 
	}//end of accessor

	//set method, or setter or mutator
	public void setfinalVelocity(double newVelocity){
		finalVelocity =newVelocity;
	}//end of mutator

	//String method
	public String toString() {
		return  initialVelocity + "\t\t" + finalVelocity;
	}//end of String

}//end of class 
