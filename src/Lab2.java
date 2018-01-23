import java.util.InputMismatchException;
import java.util.Scanner;

public class Lab2 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		// set up giant loop
		boolean loop = true;
		while (loop == true) {

			// get input from user
			System.out.println("Please enter an integer between 1 and 100: ");
			int userIn = scan.nextInt();
			
			// determine whether the integer is even or odd, and change outcome based on
			// that
			if (userIn % 2 != 0) {
				if (userIn > 60) {
					System.out.println(userIn + ", Odd and over 60");
				} else {
					System.out.println(userIn + ", Odd");
				}
			} else {
				if (userIn >= 2 && userIn <= 25) {
					System.out.println("Even and less than 25");
				} else if (userIn >= 26 && userIn <= 60) {
					System.out.println("Even.");
				} else if (userIn > 60) {
					System.out.println(userIn + ", Even");
				}
			}
			boolean goodInput = false;
			while (goodInput == false) {
				System.out.println("Continue? (y / n)");
				String isDone = scan.next();
				char isDoneChar = isDone.charAt(0);
				if (isDoneChar == 'y') {
					goodInput = true;
				}
				else if (isDoneChar == 'n') {
					goodInput = true;
					loop = false;
					System.out.println("See ya!");
				}
				else {
					System.out.println("Sorry, I don't understand that, please try again.");
				}
			}
		}

	}

}
