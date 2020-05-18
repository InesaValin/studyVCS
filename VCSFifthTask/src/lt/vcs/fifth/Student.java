package lt.vcs.fifth;

public class Student {

	public String name;
	public int chemistry;
	public int math;
	public int physics;

	public Student(String name, int chemistry, int math, int physics) {
		this.name = name;
		this.chemistry = chemistry;
		this.math = math;
		this.physics = physics;
	}

	public int getChemistry() {
		return chemistry;
	}	
	
	public int getMath() {
		return math;
	}	
	
	public int getPhysics() {
		return physics;
	}	
	
	public double getAverage() {
		double average = (chemistry + math + physics)/3;
		return average;
	}
	
	

}