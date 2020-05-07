package lt.vcs.third;

import java.util.Scanner;

public class Page {

	String text;
	String color;
	double lenght;
	double width;

	Scanner s = new Scanner(System.in);

	// Metodai

	protected void howManyWords() {
		if (this.text == null || this.text.isEmpty()) {
			System.out.println("No text");
			System.out.println();
		}
		String[] zodziai = this.text.split("\\s+");
		System.out.println("Text has " + zodziai.length + " words");
		System.out.println();
	}

	protected void deleteText() {
		this.text = null;
		System.out.println("Text is deleted");
		System.out.println();
	}

	protected void findWord() {
		if (this.text == null || this.text.isEmpty()) {
			System.out.println("No text");
		} else {
			System.out.println("Please enter word you want to find");
			String word = s.nextLine();
			int i = 0;

			String[] words = this.text.split(" ");

			for (String z : words) {
				if (z.equalsIgnoreCase(word)) {
					i = i + 1;
				} else {
				}
			}

			if (i == 0) {
				System.out.println("Word ,," + word + "'' is not in this text.");
			} else {
				System.out.println("Word  ,," + word + " ''in this text is found " + i + " time(-s).");
			}
		}
		System.out.println();
	}

	protected void deleteWord() {

		if (this.text == null || this.text.isEmpty()) {
			System.out.println("No Text");
		} else {
			System.out.println("Enter word you want to delete");
			String word = s.nextLine();
			int i = 0;

			String[] words = this.text.split(" ");

			for (String z : words) {
				if (z.equalsIgnoreCase(word)) {
					z = null;
					i = i + 1;
				} else {
					System.out.print(z + " ");
				}
			}
			System.out.println();
			if (i == 0) {
				System.out.println("Word ,," + word + "'' is not in this text.");
			} else {
				System.out.println("Word ,," + word
						+ "'' is in this text, and program deleted it (text without this word is at the top)");
			}

		}
		System.out.println();
	}

	protected void changeColor() {

		System.out.println("In which color page do you want?");
		String newColor = s.nextLine();

		if (this.color.equalsIgnoreCase(newColor)) {
			System.out.println("Now page is in " + this.color + " color");
		} else {
			color = newColor;
			System.out.println("New page color is  " + color);
		}
		System.out.println();
	}

	// Konstruktoriai
	protected Page() {
	}

	protected Page(String color) {
		this.color = color;
	}

	protected Page(String color, String text) {
		this.color = color;
		this.text = text;
	}

}
