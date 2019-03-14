package AutomationBasic;

import java.util.Scanner;

public class IoOperations {
public static void main (String[] args) { 
	Scanner scan = new Scanner(System.in);
	System.out.println("Enter you name");
	String name = scan.nextLine();
	System.out.println("Your Name is " +name);
	
	System.out.println("Enter your city");
	String city = scan.next();
	System.out.println("Your City "+city);
	
	System.out.println("Enter a Number");
	int num = scan.nextInt();
	System.out.println("Your Number is " +num);
	
	System.out.println("Enter a Mobile Number");
	long num2 = scan.nextLong();
	System.out.println("Your mobile number is "+num2);
	
	System.out.println("Enter a value");
	double num3 = scan.nextDouble();
	System.out.println("Your value is "+num3);
	
	System.out.println("Enter a character");
	char a = scan.next().charAt(0);
	System.out.println("Your char is "+a);
	
	System.out.println("Enter a value");
	boolean val = scan.hasNextBoolean();
	System.out.println("Your value is "+val);
	gggsadassdsd
}

}


