package interview.question;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class GetTextFromFile {

	public static void main(String[] args) {
		File f = new File("C:\\Users\\HP\\Desktop\\readme.txt");
		try {
			Scanner sc = new Scanner(f);
			while (sc.hasNext()) {
				String st = sc.next();
				if (st.charAt(0) == 'i') {
					System.out.println(st);
				}
			}
			sc.close();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
