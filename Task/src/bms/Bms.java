package bms;
import java.util.*;
import java.text.*;


public class Bms {
	public static void main(String args[]) throws ParseException {
		Scanner in = new Scanner(System.in);
        Book_ms card = new Book_ms();//creating an object
        int arr[][]=new int [10][10];//array is a static method
        for(int i=0;i<10;i++){
            for(int j=0;j<10;j++){
                arr[i][j]=0;
                //System.out.print(arr[i][j]);
            }
            //System.out.println("\n");
        }
        while (true) {
            System.out.println("Enter your choice\n0 Add list\n 1 View movies\n 2 view movies in place \n 3 search movie\n 4 seats\n 5 timing \n 6 exit\n 7 select seats");
            int choice = in.nextInt();
            switch (choice) {
            case 0:
                System.out.println("Enter Movie name");
                String movies = in.next();
                System.out.println("Enter place");
                String task_des = in.next();
                System.out.println("enter date");
                String d1 = in.next();
                Date dd = new SimpleDateFormat("dd/MM/yyyy").parse(d1);
                System.out.println("Enter Seats available");
                int stat = in.nextInt();
                System.out.println("Enter time");
                double tm = in.nextDouble();
                Book_my_show t = new Book_my_show(movies,stat,task_des,tm,dd);
                card.bms(t);
                break;
            case 1:
                System.out.println("Movies are");
                card.movies();
                break;
        case 2:
            System.out.println("Movies are");
            card.place();
            break;
        case 3:
            System.out.println("Enter movie to be searched");
            movies=in.next();
            card.sm(movies);
            break;
        case 4:
            System.out.println("Enter movie to check seat availability");
            movies=in.next();
            card.sa(movies);
            break;
       
        case 5:
            System.exit(0);
            break;
        case 6:
            card.mbk(arr);
            break;
        default:
            System.out.println("You have choosen wrong choice");

	
        
        
            }
         }
	}
}
