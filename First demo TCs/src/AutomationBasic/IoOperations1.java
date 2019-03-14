package AutomationBasic;

import java.io.File;
import java.io.IOException;

public class IoOperations1 {
	public static void main (String[] args) throws IOException {
		//File fileObject = new File("C:\\Users\\ts\\Desktop\\Avatar");
		//fileObject.mkdir();//create folder
		//fileObject.delete();//delete folder
		//boolean a = fileObject.exists();
		//if (a==true) {
		//System.out.println("folder exists");
		//}
		//else {
		//	System.out.println("Folder not exists");
		//}\
		File fileObject = new File ("C:/Users/ts/Desktop/UFT.txt");
		fileObject.createNewFile();
	}
}