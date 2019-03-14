package AutomationBasic;

public class Sample1 {
public static void main (String[] args) {
	String str1 = "selenium";
	String str2 = "SELENIUM";
	String str3 = "seliniuma";
	String str4 = "selenium";
	System.out.println(str1.compareTo(str2));
	System.out.println(str1.compareTo(str3));
	System.out.println(str1.compareTo(str4));
}
}
