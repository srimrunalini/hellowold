package ds_ass1;
import java.io.*;
public class Number_pairs {
	public static void main(String args[]) {
		try {
			File f= new File("pairs.txt");
			int k=0;
			int[] ar=new int[10];
			int[] ar1=new int[10];
			int count=0;
			String m="";
			BufferedReader b = new BufferedReader(new FileReader(f));
			   while ((m = b.readLine()) != null) {
			               k=Integer.parseInt(m);
			               ar[count]=k;
			               System.out.println(ar[count]);
			               count++;
			           }
			   int l=0;
			   for(int j=0;j<count;j++) {
			    for(int b1=j+1;b1<count;b1++) {
			    int z=ar[b1];
			    int x=ar[j];
			    if(z==x) {
			    ar1[l]=ar[b1];
			    System.out.println(ar1[l]+" is repeating");
			    l++;
			    break;
			    }
			    }
			    }
			System.out.println("Number of pairs are"+(l));
			System.out.println("method");
	}
		catch(Exception e) {
			System.out.println(e);
		}
	}

}
