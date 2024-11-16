// Demonstrates the Collatz conjecture.
public class Collatz {
	public static void main(String args[]) {
	    // Replace this comment with your code
		int N = Integer.parseInt(args[0]);
		String mode = args[1];

		if (mode.equals("v")) {
			for (int i = 1; i <= N; i++) {
				int steps = 1;
				System.out.print(i + " ");

				if (i == 1) {
					System.out.println("4 2 1 (4)");
					continue;
				}
				int num = i;
	
				while (num != 1) {
					if (num % 2 == 0) {
						num = num / 2;
					} else {
						num = num * 3 + 1;
					}
					System.out.print(num + " ");
					steps++;
				}
				System.out.println("(" + steps + ")");
			}
			System.out.println("Every one of the first " + N + " hailstone sequences reached 1.");

		} else if (mode.equals("c")) {
			for (int i = 1; i <= N; i++) {
				int steps = 1;
	
				int num = i;
	
				while (num != 1) {
					if (num % 2 == 0) {
						num = num / 2;
					} else {
						num = num * 3 + 1;
					}
					steps++;
				}
			}
			System.out.println("Every one of the first " + N + " hailstone sequences reached 1.");

		} else {
			System.out.println("Invalid mode");
		}
	}
}
