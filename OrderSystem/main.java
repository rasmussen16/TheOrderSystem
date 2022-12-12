import java.util.logging.*;
import java.util.logging.Logger;
import java.io.IOException;
import java.util.Scanner;

public class Main {
	private final static Logger logr = Logger.getLogger(Logger.GLOBAL_LOGGER_NAME); 
	
	public static void main (String[] args) throws SecurityException, IOException { 
		LogManager.getLogManager().reset();
		logr.setLevel(Level.ALL);
		logr.log(Level.FINE, "My first log");
		
		ConsoleHandler ch = new ConsoleHandler(); 
		ch.setLevel(Level.SEVERE);
		logr.addHandler(ch); 
		
		FileHandler fh = new FileHandler("myLogger.log");
		fh.setLevel(Level.FINE);
		logr.addHandler(fh);
		
		/* 
		 SEVERE 
		 WARNING 
		 INFO 
		 CONFIG 
		 FINE 
		 FINER 
		 FINEST
		 */
	System.out.println("Welcome to the shoe store");
	
	char input = 0; 
	ProductDAL dal = new ProductDAL();
	
	do { 
		System.out.println("________________");
		System.out.println( "Select a shoe");
		System.out.println("Press g to see all of our products");
		System.out.println("Press a to add product to cart");
		System.out.println("Press u to update your cart"); 
		System.out.println("Press s to search for a product");
		System.out.println("Press e to exit");
		System.out.println("________________");
		
		//obtain the users selection 
		Scanner kb = new Scanner(System.in);
		input = kb.next().charAt(0); //get char from input 
		System.out.println("You have selected: " + input + "\n" );
		
		if (input == 'a' || input == 'A') { 
			
		}else if (input == 'g' || input == 'G')	{
			System.out.println("Retrieving all products"); 
			dal.getAll(); 
		}else if (input == 'u' || input == 'U') {
			
		}else if (input == 's' || input == 'S') { 
			
		}else if (input == 'e' || input == 'E') {
			System.out.println("Thank you for visiting the shoe store\n");
		}
		
				
		
	}while (input != 'e');
}
}

