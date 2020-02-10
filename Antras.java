package antras;

import java.util.Scanner;

public class Antras {

	public static void main(String[] args) {
		
		// dideli pakeitimai

		Scanner s = new Scanner(System.in);
		System.out.println(" PraÅ¡ome Ä¯vesti teigiamÄ… sveikÄ…jÄ¯ skaiÄ�iÅ³");
		int num = s.nextInt();
		s.close();

		int sum = 0;

		for (int i = 1; i < num; i++) {
			sum = sum + i;
			System.out.print(i);
			System.out.print(" + ");
		}

		sum = sum + num;
		System.out.print(num + " = " + sum);

	}

}
