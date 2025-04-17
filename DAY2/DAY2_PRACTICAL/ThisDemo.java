package OOPS;
class Product
{
	public String pid;
	public String pname;
	public int pqty;
	public double price;
	public String sdt;
	public Product(String pid,String pname,int pqty,double price)
	{
		this.pid=pid;
		this.pname=pname;
		this.pqty=pqty;
		this.price=price;
		
	}
	public void viewProduct()
	{
		System.out.println("PRODUCT ID:"+this.pid);
		System.out.println("PRODUCT NAME:"+this.pname);
		System.out.println("QUANTITY SOLD:"+this.pqty);
		System.out.println("PRICE:"+this.price);
	}
	public void salesOrder()
	{
		double total=0.0;
		total=this.pqty*this.price;
		this.sdt="17/04/2025";
		this.viewProduct();
		System.out.println("SALES DATE:"+this.sdt);
		System.out.println("TOTAL SALES:"+total);
	}
}

public class ThisDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
  Product p=new Product("P1","TV",5,25000.00);
 // p.viewProduct();
  p.salesOrder();
	}

}
