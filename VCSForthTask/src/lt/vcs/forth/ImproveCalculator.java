package lt.vcs.forth;

public class ImproveCalculator extends Calculator {
	
	public void multiply() {
		float mul;
		
		mul = Data.x * Data.y;
		System.out.println(" x * y = " + mul);
	}

	public void multiply2() {
		double mul2;
		
		mul2 = Data.y * Data.z;
		mul2 = Math.round(mul2 * 10000.0) / 10000.0;
		System.out.println(" y * z = " + mul2);
	}
}
