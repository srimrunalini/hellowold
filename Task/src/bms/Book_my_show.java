package bms;
import java.util.*;


public class Book_my_show {
	String movies;
	int seats;
	String place;
	double time;
	Date dt;
	
	public Book_my_show(String movies, int seats, String place, double time, Date dt) {
		
		this.movies= movies;
		this.seats=seats;
		this.place=place;
		this.time=time;
		this.dt=dt;
	}

	public String getMovies() {
		return movies;
	}

	public void setMovies(String movies) {
		this.movies = movies;
	}

	public int getSeats() {
		return seats;
	}

	public void setSeates(int seats) {
		this.seats = seats;
	}

	public String getPlace() {
		return place;
	}

	public void setPlace(String place) {
		this.place = place;
	}

	public double getTime() {
		return time;
	}

	public void setTime(double time) {
		this.time = time;
	}

	public Date getDt() {
		return dt;
	}

	public void setDt(Date dt) {
		this.dt = dt;
	}
	
	public String toString() {
		String mb="{ movies="+movies+",seats="+seats+",place="+place+",time="+time+",dt="+dt+" }";
		return mb;
		
	}
	

}
