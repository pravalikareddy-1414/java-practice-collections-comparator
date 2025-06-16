import java.util.ArrayList;

import java.util.Comparator;
import java.util.List;
import java.util.Collections;

class Product{
	int prodcutId;
	String Name;
	int price;
	
	public Product(int productId, String Name,int price) {
		this.prodcutId = productId;
		this.Name = Name;
		this.price = price;
	}
		
	@Override	
	public String toString() {
		return   Name + "- "+ price;
	}
		
	
	
	
}
 
 
 
 public class Products{
	 
	 
	 public static void main(String[] args)
	 {
	 
	   List<Product> pd = new ArrayList<>();
	   pd.add(new Product(10,"hari",12));
	   pd.add(new Product(11,"hai",22));
	   pd.add(new Product(12,"sai",40));
	   pd.add(new Product(16,"neon",60));
	   pd.add(new Product(17,"lilly",2));
	   
	   
	   Comparator<Product>  byPriceDes = new Comparator<Product>() {
		   
		   public int compare(Product p1,Product p2) {
			   return p1.price-p2.price;
		   }
	   };
	   
	   Collections.sort(pd,byPriceDes);
	   
	   for(Product p : pd) {
		   System.out.println(p);
	   }
	   
	   

	 }
	 
	 
	
	 
 }