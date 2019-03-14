package AutomationBasic;

public class JavaMethods {
//User defined Method
	public int multiply (int a,int b, int c) {
		int result = a*b*c;
		return result;
	}
	public static void main (String[] args){
		//create Object
		JavaMethods abc = new JavaMethods();
		//Call Method
		int x = abc.multiply(10, 25, 35);
		System.out.println(x);
	}
}
