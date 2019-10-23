package emplo;

class Temporary_employee extends Employee{
	
	int no_of_days_worked;
	
	Temporary_employee(String name, String surname, String address, float basic_salary ,int no_of_days_worked){
		super(name, surname, address, basic_salary);
		this.no_of_days_worked=no_of_days_worked;
		
	}
	public float net_salary() {
		
		float ns=no_of_days_worked * basic_salary/31;
		System.out.println();
		System.out.print("Net Sal of "+name+"is"+ns);
		return ns;
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
			System.out.println();
			System.out.println("Net Sal of full time emp  "+name+" is"+ns);
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
		
		protected float getbasic_salary() {
			return basic_salary;	
		}
		
	
		
public static void main(String arg[]) {
	
	/*1*/
	Temporary_employee temp =new Temporary_employee("Sai", "Thota", "nizambad",100,10);
	temp.net_salary();
	/*2*/
	Temporary_employee temp1 =new Temporary_employee("Sairam", "Thota", "nizambad",100,10);
	temp1.net_salary();
	/*3*/
	Temporary_employee temp2 =new Temporary_employee("Sai bharath", "Thota", "nizambad",100,10);
	temp2.net_salary();
	
	
	/*1*/
	Full_time_employee full=new Full_time_employee("mru", "thota","vinayanagar",10 ,10);
	full.net_salary();
	/*2*/
	Full_time_employee full1=new Full_time_employee("viki", "G","kondapur",10 ,10);
	full1.net_salary();
	/*3*/
	Full_time_employee full2=new Full_time_employee("bharadwaj", "A","nizampet",10 ,10);
	full2.net_salary();
	}
}










