import java.util.*;

/*
Strategy Interface: A common interface that defines the behavior.
Concrete Strategies: Classes that implement the interface with specific algorithms.
Context: A class that maintains a reference to a strategy object and delegates the task to it.
Client: The code that creates and injects a specific strategy into the context
*/

interface PaymentStrategy {
	public void pay(int amount);
}

class CreditCardPayment implements PaymentStrategy{
	@Override
	public void pay(int amount){
		System.out.println("Credit card payment done "+amount);
	}
}

class UpiPayment implements PaymentStrategy{
	@Override
	public void pay(int payment){
		System.out.println("Upi payment received "+payment);
	}
}

class ShoppingCart{
	private PaymentStrategy paymentStrategy;
	
	public void setPaymentStrategy(PaymentStrategy paymentStrategy){
		this.paymentStrategy=paymentStrategy;
	}
	
	public void checkout(int amount){
		paymentStrategy.pay(amount);
	}
}

public class Main {
	public static void main(String[] args) {
		System.out.println("Hello, this strategy design pattern");
		
		PaymentStrategy upi=new UpiPayment();
		PaymentStrategy card=new CreditCardPayment();
		
		ShoppingCart cart=new ShoppingCart();
		cart.setPaymentStrategy(upi);
		cart.checkout(100);
		
		cart.setPaymentStrategy(card);
		cart.checkout(200);
		
	}
}



//real example
//will update in future
