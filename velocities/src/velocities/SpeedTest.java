/**
 * Kenneth Tran
 * 8/19/19
 * CPSC 39
 */

package velocities;

public class SpeedTest {

	public static void main(String[] args) {
		//construct an object of type Velocities
		Speed myVelocity = new Speed(); 
		Speed myVelocity2 = new Speed(); 
		Speed myVelocity3 = new Speed(30, 120);
		
		//output our object by using syso
		//it calls the to string automatically
		System.out.println(myVelocity);
		System.out.println(myVelocity2);
		System.out.println(myVelocity3);
		
		//myVelocity.finalVelocity =700;
		myVelocity3.setInitialVelocity(700);
		
		System.out.println(myVelocity3.getInitialVelocity());
	}//end of main


}//end of class
