package jfiles;
import java.io.*;

public class Readcontents {

	public static void main(String[] args) { 
		// TODO Auto-generated method stub
		String stFile= "C://Users//thota//eclipse-workspace//files//sample1.txt";
		try{  
    	    FileInputStream fin=new FileInputStream("sample1.txt");  
    	    int i=0;  
    	    FileWriter myWriter = new FileWriter("sample1.txt");
    	      String s="";
    	      String arr[]=new String[100];
    	      int l=0;
    	      int co=0;
    	    while((i=fin.read())!=-1){  
    	    	s=s+(char)i;
    	    	if((char)i==' ') {
    	    		arr[l]=s;
	    	    	l=l+1;
	    	    	 s="";
	    	    	 co=co+1;
    	    	}  
    	    }
    	    int t=0;
    	    String arr1[]=new String [100];
    	    for(int z=0;z<l;z++) {
    	    	 int count=0;
    	    	System.out.println(arr[z]);
    	    	for(int y=z;y<l;y++) {
    	    		String q=arr[z];
    	    		String f=arr[y];
    	    		if(q.equals(f)) {
    	    			count=count+1;
    	    			if(count>=2) {
    	    				arr[y]=" ";
	}
    	    		}
    	    		}
    	    	if(count<2) {
    	    		arr1[t]=arr[z];
    	    		t=t+1;
    	    	}
    	    }
    	    for(int w=0;w<t;w++) {
    	    	System.out.println(arr1[w]);
    	    	if(arr1[w]!=" ") {
    	    	 myWriter.write(arr1[w]);
    	    	}
    		}
    	    System.out.println("Number of words are:"+co);
    	    myWriter.close();
    	    	  fin.close();
		}
		
		catch(Exception e) {
			System.out.println(e);
			e.printStackTrace();
		}
		}
}
