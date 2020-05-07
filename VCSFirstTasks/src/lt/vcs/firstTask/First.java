package lt.vcs.firstTask;

import java.util.Scanner;

public class First {

	public static void main(String[] args) {

		Scanner s = new Scanner(System.in);

		System.out.println("Do you have a job? ");
		String job = s.nextLine();

		if (!(job.equalsIgnoreCase("Yes") || job.equalsIgnoreCase("No"))) { 
			System.out.println("Please enter yes or no");
			System.out.println("Do you have a job?");
			job = s.nextLine(); 
		}

		System.out.println("How much savings do you have? ");
		int savings = s.nextInt();

		if (savings < 0 || savings > 10000) {
			System.out.println(" Please enter savings from 0 to 10000");
			System.out.println("How much savings do you have? ");
			savings = s.nextInt();
		}

		System.out.println("What size loan do you want to get?");
		int loan = s.nextInt();

		if (loan < 0 || loan > 20000) {
			System.out.println(" Please enter loan size from 0 to 20000");
			System.out.println("What size loan do you want to get? ");
			loan = s.nextInt();

		}

		s.close();

		if ((job.equalsIgnoreCase("yes") & loan < 5000) || savings > (loan / 2)) {
			System.out.println("You can get the loan");
		} else {
			System.out.println("We are not able to give you this size loan, please try to enter smaller amount.");
		}

	}

}
