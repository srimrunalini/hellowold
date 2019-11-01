package exceptionh;
import java.util.*;

class Queue {
	public int count=0;
	public int element;
	Scanner sc=new Scanner(System.in);
	int n =sc.nextInt();
	int a[]=new int[n];
	
	void add() {
		try {
			System.out.println("enter the elemrnt:");
			a[count++]= sc.nextInt();
		}
		catch(Exception e) {
			System.out.println("queue is full"+e);
		}
	}
	void delete() {
		try {
			System.out.println("the deleted elemrnt is "+a[0]);
			for(int i=0; i<count-1; i++)
	         {
	             a[i] = a[i+1];
	         }
	         a[count-1] =0;
	         count -= 1;
		}
		catch(Exception e) {
			System.out.println("queue is empty"+e);
			
		}
	}
	void display() {
		try {
			for(int i=0;i<count;++i) 
			{
				System.out.println("elements in the queue are"+a[i]);
			}
				
		}
		catch (Exception e) {
			System.out.println(e);
		}
	}
}
  class queuearray {
	  
	  public static void main(String args[]) {
		  int mb,k;
		  Scanner sc=new Scanner(System.in);
		  System.out.println("enter the size of queue");
		  Queue q= new 	Queue();
		  System.out.println("\nqueue\n1.add\n2.delete\n3.display");
		  do {
			  System.out.println("enter your choice");
			   mb= sc.nextInt();
			   switch(mb)
			   {
			   case 1:
				   q.add();
				   break;
			   case 2:
				   q.delete();
				   break;
			   case 3:
				   q.display();
				   break;
				   default:
					   System.out.println("invalid");
					   break;
			   }
			   
			   System.out.println("do you want to continue (1/0)?");
			   k= sc.nextInt();
		  }
		  while (k==1);
	  }
  }
