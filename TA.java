package interface1;
import java.util.*;

public class TA implements MSITmentors,MSITstudents {
	
	String studentname;
	int studentid;
	int semister;
	
	public static void main(String args[]) {
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter name");
		String r=sc.next();
		System.out.println("Enter Number");
		int i=sc.nextInt();
		System.out.println("Enter semister");
		int m=sc.nextInt();
		MSITstudents stu=new TA();
		boolean d= MSITstudents.iselgibility();
		    if(d==true) {
		    	stu.getgpa();
		    	System.out.println("studentname:"+r);
		    	System.out.println("studentid:"+i);
		    	System.out.println("studentgpa:"+m);}
		    	else {
		    		System.out.println("Do you want to give salary for Mentor Y?N");
					String c=sc.next();
					if(c.equals("Y")) {
						System.out.println("Entered");	
						 ((TA) stu).getsalary();
					}
		    	}
	}

	@Override
	public void getgpa() {
		// TODO Auto-generated method stub
		System.out.println("Enter marks ");
 		Scanner sc= new Scanner(System.in);
 		long k=sc.nextLong();
 		System.out.println("gpa is"+k);
	}

	@Override
	public void getsalary() {
		// TODO Auto-generated method stub
		System.out.println("Enter Salary ");
 		Scanner s= new Scanner(System.in);
 		long g=s.nextLong();
 		System.out.println("Salary is"+g);
	}
	

}

 interface MSITmentors{
	  void getsalary();
 }

 interface MSITstudents{
	 void getgpa();

	static boolean iselgibility() {
		boolean iseligible;
		Random rand=new Random();
		iseligible=rand.nextBoolean();
		return iseligible;
		
	}
 }