package learning;

public class PaymentSystemMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CreditCard cc = new CreditCard();
		DebitCard dc = new DebitCard();
		DigitalWallet dw = new DigitalWallet();
		
		cc.validatePaymentDetails();
		cc.processPaymentOf();
		cc.generateRecieptOf();
		dc.validatePaymentDetails();
		dc.processPaymentOf();
		dc.generateRecieptOf();
		dw.validatePaymentDetails();
		dw.processPaymentOf();
		dw.generateRecieptOf();
	}

}
