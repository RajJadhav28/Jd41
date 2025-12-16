package Java8Lambda;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

class Product{  
    int id;  
    String name;  
    float price;  
    public Product(int id, String name, float price) {  
        this.id = id;  
        this.name = name;  
        this.price = price;  
    }  
}  
public class Pro2 {
	public static void main(String[] args) {
		List<Product> productList=new ArrayList<Product>();
		Product p1=new Product(1,"HP Laptop",25000f);
		Product p2=new Product(2,"Dell Laptop",30000f);
		Product p3=new Product(3,"Lenevo Laptop",28000f);
		productList.add(p1);
		productList.add(p2);
		productList.add(p3);
		
		List<Float> productPriceList2=productList.stream()
				.filter(p->p.price>3000)
				.map(p->p.price)
				.collect(Collectors.toList());
		System.out.println(productPriceList2);
		
	}
}
