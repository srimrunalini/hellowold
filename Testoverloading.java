package overload;

public class Testoverloading {
	public void printData(int a)
	{
		System.out.println(a);

	}
	public void printData(double a)
	{
		System.out.println(a);

	}
	public void printData(float a)
	{
		System.out.println(a);

	}
	public void printData(char a)
	{
		System.out.println(a);

	}
	public void printData(boolean a)
	{
		System.out.println(a);

	}
	public void printData(String a)
	{
		System.out.println(a);

	}
	public void printData(long a)
	{
		System.out.println(a);

	}
	
	public static void main(String arg[]) {
		Testoverloading tol= new Testoverloading();
		tol.printData(3);
		tol.printData(3479066);
		tol.printData(3.44);
		tol.printData("roja");
		tol.printData(true);
		tol.printData('r');
		tol.printData(27.98654);	
		
	}
}
