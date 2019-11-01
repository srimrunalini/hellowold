package exceptionh;
import java.io.*;

public class Stream_reader {
	public static void main(String args[]) {
		first f=new first();
		f.reader();
		second s=new second();
		s.reader();
		third t=new third();
		t.reader();
		fourth fo=new fourth();
		fo.reader();
	}
}
 class first{
	 void reader() {
		try {
			int num=6;
			int  denom;
			denom=num/0;
		}
		catch(Exception e){
			System.out.println(e);			
		}
		finally {
			System.out.println("class first finally");
		}
	 }
 } 
	 class second{
		 void reader() {
			 try {
				 BufferedReader buf = new BufferedReader(new InputStreamReader(System.in));
				 int x = Integer.parseInt(buf.readLine());
			 }
			 catch(Exception e){
				 System.out.println(e);
			 }
			 finally {
				 System.out.println("class second finally");
			 }
		 }
	 }
	 class third{
		 void reader() {
			 try {
				 int c[] = { 1 };
				    c[42] = 99;
			 }
			 catch(Exception e) {
				 System.out.println(e);
			 }
			 finally {
				 System.out.println("class third finally");
			 }
		 }
	 }
	 class fourth{
		 void reader() {
			 try {
				 String st="mb";
					System.out.println(st);
			 }
			 catch(Exception e) {
				 System.out.println(e);
			 }
			 finally {
				 System.out.println("class fourth finally");
			 }
		 }
	 }
 
 