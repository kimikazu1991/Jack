package AutomationBasic;
import java.io.Console;
import java.lang.*;

public class Sample {
	//Create a method (user defined)
	public int multiply (int a, int b, int c) {
	int result = a * b * c;
	return result;
	}
public static void main (String[] args) {
	int a = 10, b, c;//variable declaration
	b = 20; c = 30;//initialization
	final int money  = 100; //constant declaration
	System.out.println("Addition of a,b is " + (a+b));
	System.out.println(money);
	System.out.println(c);

	//condition block
	if (a > b) {
	System.out.println("A is a big number");
	}
	else
	{
		System.out.println("B is a big number");
	}
	//Loop Block
	for (int d=1; d<10 ; d++) {
		System.out.println(d);
	}
		
		//Create Object and access methods
		Sample obj = new Sample();
		int x = obj.multiply(10, 25, 50);
		System.out.println(x);
		
}
}