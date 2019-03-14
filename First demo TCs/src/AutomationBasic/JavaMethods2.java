package AutomationBasic;

public class JavaMethods2 {
//Create Method
	public void studentRank (int marks) {
		if (marks >= 600) {
			System.out.println("Rank A");
		}
		else if (marks >=500) {
			System.out.println("Rank B");
		}
		else
			System.out.println("Rank C");
	}
	public static void main (String[] args) {
		JavaMethods2 obj = new JavaMethods2();
		obj.studentRank (600);
	}
}
