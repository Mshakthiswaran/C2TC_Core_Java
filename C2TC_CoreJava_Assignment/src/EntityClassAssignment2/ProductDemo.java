package EntityClassAssignment2;
import java.util.Scanner;

public class ProductDemo {

	public static void main(String[] args) {
		 Scanner sc = new Scanner(System.in);
	        Product[] products = new Product[4];

	        for (int i = 0; i < 4; i++) {
	            products[i] = new Product();

	            System.out.println("Enter details for Product " + (i + 1));

	            System.out.println("The Brand of the Watch is : ");
	            products[i].setWatch(sc.nextLine());

	            System.out.println("The Brand of the Laptop is : ");
	            products[i].setLaptop(sc.nextLine());

	            System.out.println("The Brand of the CellPhone is : ");
	            products[i].setCellphone(sc.nextLine());

	            System.out.println("The Brand of the Earpods is : ");
	            products[i].setEarPods(sc.nextLine());

	            System.out.println();
	        }

	        for (Product product : products) {
	            System.out.println(product);
	        }

	        sc.close();
	    	


	}

}
