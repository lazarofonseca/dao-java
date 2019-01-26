import java.util.Date;

import model.entity.Department;
import model.entity.Seller;

public class Application {

	public static void main(String[] args) {
		
		Department obj = new Department(2, "Coputadores");
		System.out.println(obj);
		
		Seller obj2 = new Seller(2, "Lázaro", "lazaro@gmail.com", new Date(), 3000.0 , obj);
		
		
		
		System.out.println(obj2);
		
	}

}
