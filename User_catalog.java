package shopping;

import java.text.ParseException;
import java.util.Scanner;

public class User_catalog {
	double productid[];
	String productname[];
	int quantity[];
	float price[];
	static int count=0;
	Product cart[];
	
	User_catalog(){
		this.productid= new double[15];
		this.productname= new String[15];
		this.quantity= new int[15];
		this.price= new float[15];
		this.cart = new Product[15];
	}
	
	public void acart(Product carts) {
		productid[count]= carts.productid;
		productname[count]= carts.productname;
		quantity[count]= carts.quantity;
		price[count]= carts.price;
		cart[count]=carts;
		count++;
		System.out.println(count);
	}
	
		public void removefromcart(String productname){
	        for (int i = 0; i < count; i++) {
	            if (cart[i].getProductName().equals(productname) || cart[i].equals(null)) {
	                cart[i]=null;
	                count=count-1;
	            } else
	                System.out.println(cart[i]);
	        }
	    }
		public void showcart(){
	        System.out.println(count);
	        for (int i=0;i<count;i++){
	            if(!(cart[i].equals(null)))
	                System.out.println(cart[i]);
	        }
	    }
		public void search() throws ParseException {
			System.out.println("1 product name\n 2 price\n");
	        System.out.println("choose by name or price:");
	        Scanner s = new Scanner(System.in);
	        int mb = s.nextInt();
	        switch (mb) {
	        case 1:
	        	System.out.println("Enter productname");
                String s1 = s.next();
                for (int i = 0; i < count; i++) {
                    if (cart[i].getProductName().equals(s1)) {
                    	System.out.println(cart[i]);
                    }
                }
                break;
	        case 2:
	        	System.out.println("Enter price");
                float s2 = s.nextFloat();
                for (int i = 0; i < count; i++) {
                    if (cart[i].getPrice()==(s2)) {
                    	System.out.println(cart[i]);
                    }
                }
                break;
                default:
	                System.out.println("choose correct option");	
	        }   
		}
		public void coupon(int coupon) {
			System.out.println("Enter product name to apply coupen");
	    	 Scanner s = new Scanner(System.in);
            String s3 = s.next();
            for (int i = 0; i < count; i++) {
                if (cart[i].getProductName().equals(s3)) {
           float cp=cart[i].getPrice();
           float cp1=(cp/100)*coupon;
           float cp2=cp-cp1;
           cart[i].setPrice(cp2);
	    }
            }
		}
}
