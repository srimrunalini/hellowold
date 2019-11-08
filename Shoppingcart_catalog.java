package shopping;
import java.text.*;
import java.util.*;


public class Shoppingcart_catalog extends Product {
	static int count=0;
	
	public Shoppingcart_catalog(double Productid, String ProductName, int Quantity, float Price) {
		super(Productid, ProductName, Quantity, Price);
		// TODO Auto-generated constructor stub
	}
	
	public static void main(String args[]) {
		String[] username=new String[60];
		int[] coupon=new int[] {10,20,30,40,50};
		User_catalog uc=new User_catalog();
		Productcart_catalog pc=new Productcart_catalog();
		System.out.println("Enter the name:");
		Scanner s= new Scanner(System.in);
		username[count]=s.next();
		String rj;
		
		do {
			System.out.println("1 addtocart\n 2 removefromcart\n 3 showcart\n 4 search\n 5 final payment\n 6 exit");
			int os=s.nextInt();
			switch(os) {
			case 1:
				System.out.println("enter productid");
				double a= s.nextDouble();
				System.out.println("enter product name");
				String b= s.next();
				System.out.println("enter product quantity");
				int c= s.nextInt();
				System.out.println("enter product price");
				float d= s.nextFloat();
				Product pt= new Product(a,b,c,d);
				pc.acart(pt);
				System.out.println("Do you want this to the cart Y/N?");
		        String chc=s.next();
		        if(chc.equals("y")) {
		        	User u=new User(pt.productid,pt.productname,pt.quantity,pt.price);
		        	uc.acart(pt);
		        	 }
		        break;
			case 2:
				System.out.println("Enter product name:\n");
				String s3=s.next();
				pc.removefromcart(s3);
				System.out.println("Do you want delete any product from the cart Y/N?");
				String c2=s.next();
		        if(c2.equals("Y")||c2.equals("y")) {
		        	System.out.println("Enter product name:\n");
		    		String s5=s.next();
		        uc.removefromcart(s5);
		        }
				break;
			case 4:
				try {
					pc.search();
					System.out.println("Do you want search any item from the cart Y/N?");
			        String y=s.next();
			        if(y.equals("Y")||y.equals("y")) {
			        uc.search();
			        }
				} catch (ParseException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				break;
			case 3:
				uc.showcart();
				System.out.println("Do you want View the cart Y/N?");
		        String y=s.next();
		        if(y.equals("Y")||y.equals("y")) {
		        pc.showcart();
		        }
				break;
			case 5:
				System.out.println("Do you have any coupon Y/N?:");
				String cou=s.next();
				if(cou.equals("Y")||cou.equals("y")||cou.equals("Yes")) {
					System.out.println("Enter the coupon :");
					int coup=s.nextInt();
					for(int r=0;r<coupon.length;r++) {
						if(coupon[r]==coup) {
							uc.coupon(coup);
						}
					}
						
					}
					break;
			case 6:
				System.exit(0);
				default:
					System.out.println("You have choosen wrong option");
					
			}
			System.out.println("Do YOu want continue Y/N?");
			rj=s.next();
		}while(rj.equals("Y")||rj.equals("y"));
			
			System.out.println("Shopping Done");
		}
		
			
}
		
   