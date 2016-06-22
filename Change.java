 import java.util.Scanner;
 import java.text.NumberFormat;
public class Change {
    
    public static void main(String[] args) {
    	
    	// TODO, add your application code
    	int change;
    	int qrt;
    	int dimes;
    	int nic;
    	int pen;
    	Scanner input = new Scanner(System.in);
    	NumberFormat money = NumberFormat.getCurrencyInstance();
    	
    	System.out.println("Enter the change in cents: ");
    	change = input.nextInt();
    	
    	qrt = change/25;
    	change %= 25;
    	dimes = change/10;
    	change %= 10;
    	nic = change/5;
    	change %= 5;
    	pen = change/1;
    	
    	System.out.println("The minimum number of coins is: ");
    	System.out.println("Quarters: " + qrt);
    	System.out.println("Dimes: " + dimes);
    	System.out.println("Nickels: " + nic);
    	System.out.println("Pennies: " + pen);
    }
}
