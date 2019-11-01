package jfiles;
import java.io.*;
import java.util.*;


public class Numbers {
	public static void main (String args[]) {
		String stfile = "C://Users//thota//eclipse-workspace//files/sample1.txt";
		try {
			FileOutputStream fos = new FileOutputStream(stfile);
		     
		       DataOutputStream dos = new DataOutputStream(fos);
		       boolean isPrime= true;
				int count=0;
				System.out.println("enter the size you want to enter:");
				Scanner sc=new Scanner(System.in);
				int k= sc.nextInt();
				 for (int j = 1; j <= k; j++) {
			    	   int arr[]=new int[k];
			    	   int l=0;
			    	   int remainder=0;
			    	   isPrime = CheckPrime(j);
			    	   if (!isPrime) {
			    		   System.out.print(j+"-  ");
			    		   count++;
			    	for (int i = 1; i <= j ; i++) {
			          remainder = j % i;
			          if (remainder == 0) {
			        	  arr[l]=i;
			        	  l++;
			          }
			    		   }
			    	for(int n=0;n<l;n++) {
			    		System.out.print(arr[n]+" ");
			    		   dos.writeInt(arr[n]);
			    	        }
			    	System.out.println();
			       }
			       }
			       System.out.println("The number of non primes are:"+count);
			       System.out.println("The number of primes are:"+(k-count));
			        dos.close();
		}
	
		catch(Exception e) {
			System.out.println(e);
		}
		}

	public static boolean CheckPrime(int numberToCheck) {
	      int remainder;
	      for (int i = 2; i <= numberToCheck / 2; i++) {
	          remainder = numberToCheck % i;
	          if (remainder == 0) {
	              return false;
	          }
	      }
	      return true;
}
}
