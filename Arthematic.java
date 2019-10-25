package interface1;

public class Arthematic{
	public static void main(String args[]) {
		Add a= new Add();
		System.out.println(a.performOperation(65,73));
		Sub b= new Sub();
		System.out.println(b.performOperation(6,7));
		mul c= new mul();
		System.out.println(c.performOperation(54,9));
		div d=new div();
		System.out.println(d.performOperation(94,29));
	}
}

interface Operator{
	int performOperation(int num1, int num2);
}

  class Add implements Operator 
{
	 private String opString;
     public Add() {
          opString = "+";
     }
 public int performOperation(int num1, int num2) {
     return num1 + num2;
 }
  public String getOperation() {
  return opString;
 }
}
  
   class Sub implements Operator{
	   private String opString;
	     public Sub() {
	          opString = "-";
	     }
	@Override
	public int performOperation(int num1, int num2) {
		// TODO Auto-generated method stub
		return num1-num2;
	}
	public String getOperation() {
		  return opString;
		 }
  }
   
   class mul implements Operator{
	   private String opString;
	     public mul() {
	          opString = "*";
	     }
	@Override
	public int performOperation(int num1, int num2) {
		// TODO Auto-generated method stub
		return num1*num2;
	}
	public String getOperation() {
		  return opString;
		 } 
   }

   class div implements Operator{
	   private String opString;
	     public div() {
	          opString = "/";
	     }

	@Override
	public int performOperation(int num1, int num2) {
		// TODO Auto-generated method stub
		return num1/num2;
	}
	public String getOperation() {
		  return opString;
		 } 
   }
   
   