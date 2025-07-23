package Day1;
import java.util.Scanner;
public class AdditionWithScanner {
	public static void main(String[]args) {
		Scanner sc = new Scanner(System.in);
		int a;
		int b;
		int c;
		System.out.println("Enter the values: ");
		a = sc.nextInt();
		System.out.println("Enter the values: ");
		b = sc.nextInt();
		System.out.println("Enter the values: ");
		c = sc.nextInt();
		
		System.out.println("Addition of A="+a+", B= "+b+",C="+c+"is : "+(a+b+c));
	}
}
