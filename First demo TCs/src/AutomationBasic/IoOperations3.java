package AutomationBasic;

public class IoOperations3 {
public static void main (String[] args) {
	int a =10;
	int b =2;
	int abc [] = new int[4];
	try
	{
		int result = a/b;
		System.out.println(result);
	}
	catch (ArithmeticException e){
	System.out.println("Divided by Zero error");	
	}
	System.out.println("Hello Java");
	try
	{
		abc[3]=200;
		System.out.println(abc[3]);	
	}
	catch (ArrayIndexOutOfBoundsException e2) {
		System.out.println("Array index out of bound error ");
	}
	
	System.out.println("Hello Selenium");
}
}
