// Prints a crowd cheering output.
public class Cheers {
        public static void main(String[] args) {
	    // Replace this comment with your code
            String name = args[0].toUpperCase();
            int number = Integer.parseInt(args[1]);

            for (int i = 0; i < name.length(); i++) {
                char currentChar = name.charAt(i);
                String anChar = "AEFHILMNORSX";

                if (anChar.indexOf(currentChar) != -1) {
                        System.out.println("Give me an " + currentChar + ": " + currentChar + "!");    
                } else {
                        System.out.println("Give me a " + currentChar + ": " + currentChar + "!");
                }
            }
            System.out.println("What does that spell?");

            for (int i = 0; i < number; i++) {
                System.out.println(name + "!!!");
            }
        }
}
