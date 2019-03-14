package AutomationBasic;

public class Class {
//declare static variables
	static int a=10, b=20;
//declare non-static variables
	int c=30, d=40;
//create static a methods with returning a value
	public static int add() {
	int result =a+b;
	return result;
	}
//create static a methods without returning any value
	public void multiply() {
	System.out.println(a*b);
	}
//create non static methods with returning a value
	public int add2() {
		int res = c+d;
		return res;
	}
//create a non static method without returning any value
	public void multiply2() {
}
