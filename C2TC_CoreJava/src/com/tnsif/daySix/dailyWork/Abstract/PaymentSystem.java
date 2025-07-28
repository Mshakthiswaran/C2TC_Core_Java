package com.tnsif.daySix.dailyWork.Abstract;
abstract class PaymentGateway{
		public abstract void paymentProcess(double amt);
		public void connectToPayment() {
			System.out.println("Conneting to the Payment ..");
		}	
}
class CreditPayment extends PaymentGateway{

	@Override
	public void paymentProcess(double amt) {
		// TODO Auto-generated method stub
		System.out.println("Processing the amount Rs."+amt);
	}
	
}
public class PaymentSystem {
	 	public static void main(String[]args) {
	 		PaymentGateway payment = new CreditPayment();
	 		
	 		payment.connectToPayment();
	 		payment.paymentProcess(2000.0);
	 	}
}
