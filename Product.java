package day2;
public class Product {
	String ProductName;
	int Price;
	int GST;
	double discount;
	float Quantity;
	public static void main(String args[]) {
	Product P1=new Product();
	P1.ProductName="Rice";
	P1.Price=1000;
	P1.GST=10;
	P1.discount=30;
	P1.Quantity=10.5f;
	System.out.println("Product Name :"+P1.ProductName);
	System.out.println("Price :"+P1.Price);
	System.out.println("GST :"+P1.Price);
	System.out.println("Discount :"+P1.discount);
	System.out.println("Quantity :"+P1.Quantity);
	Product P2=new Product();
	P2.ProductName="Oil";
	P2.Price=100;
	P2.GST=5;
	P2.discount=40;
	P2.Quantity=1f;
	System.out.println("Product Name :"+P2.ProductName);
	System.out.println("Price :"+P2.Price);
	System.out.println("GST :"+P2.Price);
	System.out.println("Discount :"+P2.discount);
	System.out.println("Quantity :"+P2.Quantity);
	}
}
