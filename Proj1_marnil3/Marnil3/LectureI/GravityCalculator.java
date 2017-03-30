package LectureI;

public class GravityCalculator {
//https://www.kth.se/social/course/EH2745/subgroup/vt-2017-652/event/59727/	
	//https://www.kth.se/social/course/EH2745/subgroup/vt-2017-652/event/59735/
	//https://www.kth.se/social/course/EH2745/subgroup/vt-2017-652/event/61635/
	public static double multi(double x, double y){
		return x*y;
		// method for multiplication
		}
	public static double square(double x){
		return x*x;
		// method for multiplication
		}
	public static double sum(double x, double y){
		return x+y;
		// method for multiplication
		}
		// add 2 more methods for powering to square and summation (similar to multiplication)
	public static void outline(double x,double y,double z){
			System.out.println("The object's position after " + x + " seconds is "
					+ y + " m and the final velocity is " + z + "m/s");
		// method for printing out a result
		}

	public static void main(String[] arguments){
		double gravity =-9.81; // Earth's gravity in m/s^2
		double fallingTime = 10;
		//String fallingTimeString = Double.toString (fallingTime);
		double initialVelocity = 0.0;
		double finalVelocity = sum(multi(gravity, fallingTime),initialVelocity);
		double initialPosition = 0.0;
		double finalPosition = sum(sum(0.5*gravity*square(fallingTime),multi(initialVelocity,fallingTime)),initialPosition); //Math.pow(fallingTime, 2)
		//String finalPositionString = Double.toString (finalPosition);
		// Add the formulas for position and velocity
		outline(fallingTime,finalPosition,finalVelocity);
		//System.out.println("The object's position after " + fallingTime + " seconds is "
		//+ finalPosition + " m and the final velocity is " + finalVelocity + "m/s");
		// Add output line for velocity (similar to position)
		}
}