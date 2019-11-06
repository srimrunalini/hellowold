package dsm2;
import java.util.Arrays;
public class P2 {
	public static void main(String args[]) {
	
		String ar1[]= {"e","a","s","y","q","u","e","s","t","i","o","n"};
	   for (int i=1; i<ar1.length; i++)
	   {
	      String index = ar1[i]; 
	      int j = i;
	      while (j > 0 && ar1[j-1].compareTo(index)>0)
	      {
	           ar1[j] = ar1[j-1];
	           j--;
	      }
	      ar1[j] = index;
	       
	   }
	   System.out.println(Arrays.toString(ar1));  
	}

}