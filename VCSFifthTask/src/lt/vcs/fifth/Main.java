package lt.vcs.fifth;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.Scanner;

public class Main {

	static ArrayList<Student> grades = new ArrayList<>();

	public static void main(String[] args) {

		grades.add(new Student("Tomas", 7, 6, 4));
		grades.add(new Student("Romas", 9, 5, 8));
		grades.add(new Student("Rimas", 6, 9, 8));
		grades.add(new Student("Simas", 10, 8, 5));
		grades.add(new Student("Tadas", 10, 9, 8));

		list();
		fill();
		list();
		max();

	}
	
	public static void max() {
		

	Comparator<Student> comparator = Comparator.comparing(Student::getChemistry);
	Comparator<Student> comparatorMa = Comparator.comparing(Student::getMath);
	Comparator<Student> comparatorPh = Comparator.comparing(Student::getPhysics);
	Comparator<Student> comparatorAv = Comparator.comparing(Student::getAverage);
	
	Student maxCh = grades.stream().max(comparator).get();
	Student maxMa = grades.stream().max(comparatorMa).get();
	Student maxPh = grades.stream().max(comparatorPh).get();
	Student maxAv = grades.stream().max(comparatorAv).get();

	System.out.println("Biggest grade in chemistry has: ");
	for (int i = 0; i < grades.size(); i++) {
		if (grades.get(i).chemistry == maxCh.chemistry) {
			System.out.println(grades.get(i).name + " - grade " + grades.get(i).chemistry);
		}
	}
	System.out.println();

	System.out.println("Biggest grade in math has: ");
	for (int i = 0; i < grades.size(); i++) {
		if (grades.get(i).math == maxMa.math) {
			System.out.println(grades.get(i).name + " - grade " + grades.get(i).math);
		}
	}
	System.out.println();

	System.out.println("Biggest grade in physics has: ");
	for (int i = 0; i < grades.size(); i++) {
		if (grades.get(i).physics == maxPh.physics) {
			System.out.println(grades.get(i).name + " - grade " + grades.get(i).physics);
		}
	}
	System.out.println();

	System.out.println("Biggest average of grades has: ");
	for (int i = 0; i < grades.size(); i++) {
		if (grades.get(i).getAverage() == maxAv.getAverage()) {
			System.out.println(grades.get(i).name + " - average grade " + grades.get(i).getAverage());
		}
	}
	System.out.println();
		
	}

	public static void list() {

		System.out.println("\t" + "Chemija \t" + "Matematika \t" + "Fizika");

		for (int i = 0; i < grades.size(); i++) {

			System.out.println(grades.get(i).name + "\t " + grades.get(i).chemistry + "\t \t" + grades.get(i).math
					+ "\t \t" + grades.get(i).physics);
		}

		System.out.println();
	}

	public static void fill() {
		System.out.println("Do you want to add someone in the list?");
		Scanner s = new Scanner(System.in);
		String ats = s.nextLine();

		while (!(ats.equalsIgnoreCase("yes"))) {

			if (ats.equalsIgnoreCase("no")) {
				System.out.println("Please enter student name");
				String name = s.nextLine();
				System.out.println("Please entenr students chemistry grade");
				int chemistry = s.nextInt();
				System.out.println("Please entenr students math grade");
				int math = s.nextInt();
				System.out.println("Please entenr students physics grade");
				int physics = s.nextInt();

				grades.add(new Student(name, chemistry, math, physics));
				System.out.println("Do you want to add someone more in the list?");

			} else {
				System.out.println("Please enter yes or no");
			}

			ats = s.nextLine();
		}

		s.close();
	}
}
