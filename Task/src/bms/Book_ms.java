package bms;

import java.util.*;

public class Book_ms {
	String movies[];
	int seats[];
	String place[];
	double time[];
	Date dt[];
	int count=0;
	Book_my_show k[];
	
	public Book_ms() {
		this.movies=new String[17];
		this.seats=new int[17];
		this.place=new String[17];
		this.time=new double[17];
		this.dt=new Date[17];
		this.k= new Book_my_show[17];
	}
	public void bms(Book_my_show m) {
		movies[count] = m.movies;
        place[count] = m.place;
        dt[count] = m.dt;
        seats[count] =m.seats;
        time[count] = m.time;
        k[count]=m;
        count++;
	}
	public void movies(){
        for(int i=0;i<count;i++){
            System.out.println(k[i].place);
        }
	}
	public void place(){
        for(int i=0;i<count;i++){
            System.out.println(k[i].movies);
        }
	}
	public void sm(String movie){
        for(int i=0;i<count;i++){
            if(k[i].getPlace().equals(movie))
                System.out.println(k[i]);
        }
    }
	public void tm(double movie){
        for(int i=0;i<count;i++){
            if(k[i].getTime()==movie)
                System.out.println(k[i]);
        }
    }
	public void sa(String movie){//methods called for seat availability
        for(int i=0;i<count;i++){
            if(k[i].getPlace().equals(movie))
                System.out.println(k[i]);
        }
    }
	public int[][] mbk(int[][] arr) {//methods called for seats
        System.out.println("Enter row you want to book seats");
        Scanner s = new Scanner(System.in);
        int t = s.nextInt();
        System.out.println("Enter Number of tickets you want to book");
        int l = s.nextInt();
        System.out.println("The seats with 1 are booked and 0 are empty");
        while (t==t) {
            for (int i = 0; i < l; i++){
                arr[t][i]=1;
            }
            break;
        }
        System.out.println(Arrays.deepToString(arr));
        return arr;
	
	}
}
