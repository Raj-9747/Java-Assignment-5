/*
*  ID  : 21CE027
 * Name: Fachara Raj
 * Aim : WAP to show use of character and byte stream.
 */
import java.io.FileInputStream;
import java.io.FileOutputStream;

public class Prac4_Byte {
	public static void main(String[] args) {
		try {
			FileInputStream fr = new FileInputStream("C:\\Users\\Aryan\\OneDrive\\Desktop\\#Assginment _5\\download.png");
			FileOutputStream fw = new FileOutputStream(
					"C:\\Users\\Aryan\\OneDrive\\Desktop\\#Assginment _5\\copy_download.png");

			int i = 0;
			while ((i = fr.read()) != -1) {
				fw.write(i);
			}
			System.out.println("File Copied.");
		} catch (Exception e) {
			System.out.println(e);
		}
	}
}