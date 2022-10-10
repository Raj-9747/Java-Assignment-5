/*
*  ID  : 21CE027
 * Name: Fachara Raj
 * Aim : When to use Character Stream over Byte Stream? When to use Byte Stream over CharacterStream? Give example.
 */

import java.io.FileReader;
import java.io.IOException;
public class Prac2 {
    public static void main(String[] args) throws IOException {
        FileReader fr = null;
        try {
            fr = new FileReader("C:\\Users\\Aryan\\OneDrive\\Desktop\\#Assginment _5\\Demo.txt");

            int temp;
            while ((temp = fr.read()) != -1){
                System.out.print((char)temp);
            }
            System.out.println("\nProgram successfully executed");
        } finally {
            if (fr != null)
                fr.close();
        }
    }
}