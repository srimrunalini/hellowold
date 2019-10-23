package emplo;

import java.util.*;


class Temporary_employee extends Employee{
	
	int no_of_days_worked;
	
	Temporary_employee(String name, String surname, String address, float basic_salary ,int no_of_days_worked){
		super(name, surname, address, basic_salary);
		this.no_of_days_worked=no_of_days_worked;
		
	}
	public float net_salary() {
		
		float ns=no_of_days_worked * basic_salary/31;
		
		System.out.print(name+ns);
		return ns;
	}
	public String toString()
	{
		return "Employee:"+name+"surname:"+surname+"address:"+address;
		
	}
			
}

class Full_time_employee extends Employee
{
	float provident_fund;
	 Full_time_employee(String name, String surname, String address, float basic_salary ,float provident_fund ) 
	 {
		 super(name,surname,address,provident_fund);
		 this.provident_fund=provident_fund;
	 }
	 public void net_salary() {
			
			float ns=( basic_salary +(basic_salary * provident_fund/100));
			
			System.out.println("sdfghj"+ns+"dfhj");
		}
	 public float NetSalary()
	 {
		 float netsal;
		 netsal=( basic_salary +(basic_salary * provident_fund/100));
		 return netsal;
	 }
	 
}
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
	
	
	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public String getSurname() {
		return surname;
	}


	public void setSurname(String surname) {
		this.surname = surname;
	}


	public String getAddress() {
		return address;
	}


	public void setAddress(String address) {
		this.address = address;
	}


	public float getBasic_salary() {
		return basic_salary;
	}


	public void setBasic_salary(float basic_salary) {
		this.basic_salary = basic_salary;
	}
		
public static void main(String arg[]) {
	System.out.println("Enter number of employees you want to enter\n");
	Scanner s= new Scanner(System.in);
	int num=s.nextInt();
	Temporary_employee temp =new Temporary_employee("Sai", "Thota", "nizambad",100,10);
	System.out.println(temp);
	temp.net_salary();
	Full_time_employee full=new Full_time_employee("sri", "fab","hyd",10 ,10);
	full.net_salary();
	full.NetSalary();
}
}


