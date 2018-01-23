import java.util.Scanner;

public class Lab2 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		//ask for the user's name and use that to make the program friendlier throughout
		System.out.println("What's your name?");
		String userName = scan.nextLine();
		
		//set up giant loop
		boolean loop = true;
		while (loop == true) {
			
			// get input from user
			System.out.println(userName + ", please enter an integer between 1 and 100: ");
			int userIn = scan.nextInt();
			
			// determine whether the integer is even or odd, and change outcome based on
			// that
			System.out.println(userName + ", here's the information you asked for:");
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
			//continue asking the user for input until they give you a yes or no answer
			boolean goodInput = false;
			while (goodInput == false) {
				System.out.println("Continue? (y / n)");
				String isDone = scan.next();
				char isDoneChar = isDone.charAt(0);
				if (isDoneChar == 'y') {
					//if the user says yes, break the y/n loop but go back to the beginning of the main loop
					goodInput = true;
				}
				else if (isDoneChar == 'n') {
					//if the user says no, break the y/n loop and the main loop and exit the program
					goodInput = true;
					loop = false;
					System.out.println("Have a good day, " + userName + "!");
				}
				else {
					System.out.println("Sorry, I don't understand that " + userName +  ", please try again.");
				}
			}
		}
	scan.close();
	}

}
