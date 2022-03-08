package de.telekom.sea7;

public class MyRunnable {
public static void main(String[] args) {	
	// Test ob die Klasse IbanDepot läuft
	Runnable myRunnableLigther =
			() -> System.out.println("IbanDepot is running");
			myRunnableLigther.run();
			System.out.println(myRunnableLigther.getClass().getName());
			
			Runnable runnable = () -> System.out.println("thats it");
			runnable.run();
			MyAssertThrows myAssertThrows = new MyAssertThrows();
			boolean result;
}

}
