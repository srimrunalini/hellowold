package emp;
import java.util.*;
public class Employee {
	String name;
	String surname;
	String address;
	float basic_salary;
	
    Employee(String name, String surname, String address, float basic_salary){
		
		this.name= name;
		this.surname= surname;
		this.address= address;
		this.basic_salary= basic_salary;
	}
	
	
	public void display() {
		System.out.println(name);
		System.out.println(surname);
		System.out.println(address);
		System.out.println(basic_salary);
		
	}
	
	protected float getbasic_salary() {
		return basic_salary;	
	}
	
}

 class Temporary_employee extends Employee{
	
	int no_of_days_worked;
	
	Temporary_employee(int no_of_days_worked){
		super(name, surname, address, basic_salary);
		
	}
	public void net_salary() {
		
		float ns=no_of_days_worked * basic_salary/31;
		
		System.out.print(ns);
	}
			
}

class full_time_employee extends Employee{
	float provident_fund;
	
	
	( basic_salary +(basic_salary * provident_fund/100));
	


public static void main(String arg[]) {
	System.out.println("Enter number of emplotees you want to enter\n");
	Scanner s= new Scanner(System.in);
	
	
}

}








