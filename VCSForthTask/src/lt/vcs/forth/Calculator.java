package lt.vcs.forth;

public class Calculator {
	
	public void sum() {
		float sum;
		
		sum = Data.x + Data.y;
		System.out.println(" x + y = " + sum);
	}

	public void sum2() {
		double sum2;
		
		sum2 = Data.x + Data.z;
		sum2 = Math.round(sum2 * 10000.0) / 10000.0;
		System.out.println(" x + z = " + sum2);
	}
}
