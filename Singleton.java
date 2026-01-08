/* The Bill Pugh Singleton pattern, also known as the Initialization-on-Demand Holder Idiom, 
  is a widely used method for implementing thread-safe, lazy-loaded singletons in Java.
  It leverages the Java Virtual Machine's (JVM) class-loading mechanics to ensure an instance is created only when needed, 
  without requiring explicit synchronization like synchronized blocks or volatile variables.
  */

/*
This is about singleton design pattern
*/

class Singleton{
	private Singleton(){}
	
	private static class HelperClass{
		private static final Singleton singleton=new Singleton();
	}
	
	public static Singleton getObject(){
		return HelperClass.singleton;
	}
}
public class Main {
	public static void main(String[] args) {
		System.out.println("Welcome to Singleton design pattern");
		Singleton obj1=Singleton.getObject();
		Singleton obj2=Singleton.getObject();
		
		if(obj2==obj1){
			System.out.println("both objects are equals");
		}
	}
}
