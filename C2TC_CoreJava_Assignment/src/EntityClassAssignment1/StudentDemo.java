package EntityClassAssignment1;

public class StudentDemo {
public static void main(String[]args) {

	Student hello1 = new Student();
	Student hello2 = new Student();
	Student hello3 = new Student();
	
	hello1.setId(1);
	hello2.setId(2);
	hello3.setId(3);
	hello1.setName("Shakthi");
	hello2.setName("Shiva");
	hello3.setName("Gwen");
	hello1.setDept("ECE");
	hello2.setDept("ECE");
	hello3.setDept("ECE");
	
	System.out.println(hello1);
	System.out.println(hello2);
	System.out.println(hello3);
}
}
