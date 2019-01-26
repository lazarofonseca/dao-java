import model.entity.Department;
import model.entity.Seller;

public class Application {

	public static void main(String[] args) {
		
		Department obj = new Department(2, "Coputadores");
		System.out.println(obj);
		
		Seller obj2 = new Seller();
		
		obj2.setId(1);
		obj2.setName("Lázaro Fonseca");
		obj2.setEmail("lazaronobreg3@gmail.com");
		obj2.setBaseSalary(3000.00);
		
		System.out.println(obj2);
		
	}

}
