package dsm2;
import java.util.Arrays;

public class P1 {
	public static void main(String args[]) {
		String ar[]= {"e","a","s" ,"y","q","u","e","s","t","i","o","n"};
		for (int i = 0; i<ar.length-1; i++)
		   {
		      int min = i;
		      for (int j = i+1; j<ar.length; j++)
		            if (ar[j].compareTo(ar[min])<0)
		            	min = j;
		      String temp = ar[i];
		      ar[i] = ar[min];
		      ar[min] = temp;
		   }
		System.out.println(Arrays.toString(ar)); 
		}	
	}
