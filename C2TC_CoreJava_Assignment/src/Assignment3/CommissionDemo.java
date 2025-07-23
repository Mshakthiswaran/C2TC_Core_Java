package Assignment3;

public class CommissionDemo {
public static void main(String[]args) {

    Commission emp = new Commission();
    emp.setName("Rahul");
    emp.setAddress("123, Main Street");
    emp.setPhone("9876543210");
    emp.setSalesAmount(72000);

    emp.calculateCommission();
}
}