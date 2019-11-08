package shopping;

public class User {
	double productid;
	String productname;
	int quantity;
	float price;
	public User(double Productid, String ProductName, int Quantity, float Price) {
		productid=Productid;
		productname=ProductName;
		quantity= Quantity;
		price= Price;
	}
	public double getProductid() {
		return productid;
	}
	public void setProductid(double productid) {
		this.productid = productid;
	}
	public String getProductName() {
		return productname;
	}
	public void setName(String productname) {
		this.productname = productname;
	}
	public int getQuantity() {
		return quantity;
	}
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
	public float getPrice() {
		return price;
	}
	public void setPrice(float price) {
		this.price = price;
	}

	public String toString() {
    	String k= "{Productid="+productid+", ProductName= "+productname+", Quantity="+quantity+",Price="+price+"}";
    	return k;
    }

}
