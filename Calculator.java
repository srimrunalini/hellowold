package overload;

public class Calculator {
	
	public int add(int a, int b) {
		
		int sum=a+b;
		return sum;
	}

	public float add(float a, float b) {
		
		float sum=a+b;
		return sum;

	}
	
	public double add(double a ,double b) {
		
		double sum=a+b;
		return sum;
	}
	public String add(String a ,String b) {
		
		String sum=a+b;
		return sum;
	}
	
	public long add(long a ,long b) {
		
		long sum=a+b;
		return sum;
	}


public static void main(String args[]) {
	Calculator cal= new Calculator();
	System.out.println(cal.add(45, 76));
	System.out.println(cal.add(2.34,8.97));
	System.out.println(cal.add(87653, 987632));
	System.out.println(cal.add("ro", "ja"));
	System.out.println(cal.add(234.65, 9876.542));
	
	
}
}