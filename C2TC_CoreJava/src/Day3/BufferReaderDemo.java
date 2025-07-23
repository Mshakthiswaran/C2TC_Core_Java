package Day3;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
public class BufferReaderDemo {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String name;
		
		System.out.println("Enter the name: ");
		name = br.readLine();
		//waper class  type casting
		
		int id;
		System.out.println("Enter your id");
		id = Integer.parseInt(br.readLine());
		

		int age;
		System.out.println("Enter your age");
		age = Integer.parseInt(br.readLine());
		
		float marks;
		System.out.println("Enter marks : ");
		marks = Float.parseFloat(br.readLine());
		
		System.out.println("Name: "+name+" Id : "+id+" age: "+age+" marks: "+marks);
		
		

	}

}
