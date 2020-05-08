package lt.vcs.forth;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
	
		System.out.println("Please enter number x (int):");
		int x = s.nextInt();
		Data.x = x;
		
		System.out.println("Please enter number y (float):");
		float y = s.nextFloat();
		Data.y = y;
		
		System.out.println("Please enter number z (double):");
		double z = s.nextDouble();
		Data.z = z;
	
		Calculator b = new Calculator();
		ImproveCalculator a = new ImproveCalculator();
		
		b.sum();
		a.multiply();
		b.sum2();
		a.multiply2();
		
		s.close();
		
	}

}
