// Computes an approximation of PI.
public class CalcPi {
	public static void main(String [] args) { 
	    // Replace this comment with your code
		int number = Integer.parseInt(args[0]);
		double piApproximated = 0.0;

		for (int i = 0; i < number; i++){
			double term = 1 / (i * 2 + 1.0);
			if (i % 2 == 0) {
				piApproximated += term;
			} else {
				piApproximated -= term;
			}
		}
		System.out.println("pi according to java: " + Math.PI);
		System.out.println("pi, approximated: " + piApproximated*4);
	}
}
