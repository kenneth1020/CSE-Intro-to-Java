import java.util.Scanner;

public class test {
	double golden_ratio = 1.6;
	/*A+B = C
A/B = D
(A+B)/A = D
PHI = 1.618
1. Your flexed arms should be 150% larger than the circumference of your 
non-dominant wrist (wrist circumference x 2.5).

2.Your flexed calves should match your flexed arms.

3. Your shoulder circumference should measure 1.618 times
 larger than your waist (waist circumference x 1.618).

  4. Your chest circumference should be 550% larger than the 
 circumference of your non-dominant wrist (wrist circumference x 6.5).

5. Your upper leg circumference should be 75% larger than your knee 
circumference (knee circumference x 1.75).


Record the following measurements:

Arm circumference (at the peak of your bicep)
Circumference of your non dominant wrist
Circumference of your shoulders
Circumference of your waist
Circumference of your upper thigh
Circumference of your knee
Circumference of your calves
Now, here’s the formula you’re going to apply your measurements to:

Your Ideal Arm Size
Your arms when flexed should be 150% bigger than your non dominant wrist circumference.

This is the equivalent to your wrist measurement x 2.5

 Your Ideal Calves Size
Your flexed calves should match the size of your flexed arms.

Calves measurement = arm measurement

 Your Ideal Shoulder Size
Your shoulder circumference should measure 1.618 times larger than your waist.

This is the equivalent to your waist x 1.618.

  Your Ideal Chest Size
Your chest circumference should be 550% larger than the circumference of your non-dominant wrist

This is the equivalent to your wrist measurement x 6.5.

 Your Ideal Leg Size
The circumference of your upper thigh should be 75% bigger than the circumference of your knee.

This is the equivalent to your knee measurement x 1.75.
	 */
	public static void Interface()
	{
		
		//asking if the user like to search again
		System.out.println("Character wrist size?");
		Scanner inputs1 = new Scanner(System.in);
		Double wrist = Double.parseDouble(inputs1.nextLine());
		System.out.println("Character knee size?");
		Scanner inputs2 = new Scanner(System.in);
		Double knee = Double.parseDouble(inputs2.nextLine());
		System.out.println("Character waist size?");
		Scanner inputs3 = new Scanner(System.in);
		Double waist = Double.parseDouble(inputs3.nextLine());
		System.out.println("Character height size in cm?");
		Scanner inputs4 = new Scanner(System.in);
		Double height = Double.parseDouble(inputs4.nextLine());
		double weight_propotion =160/165.09999999999997;
		double weight = height* weight_propotion;
		double biceps = wrist * 2.52; 
		double error_biceps = biceps + 4; 
		double calves = biceps;
		double chest = wrist * 6.5;
		double upperleg = knee * 1.75;
		double shoulder = waist *1.618;
		/*
		 *Height	Weight
165cm	73kg
168cm	75kg
170cm	77kg
173cm	79kg
175cm	79kg
178cm	81kg
180cm	83kg
183cm	85kg
185cm	88kg
188cm	90kg
191cm	92kg
193cm	94kg
196cm	96kg
		 */
		
	}

}
