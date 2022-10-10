/*
*  ID  : 21CE027
 * Name: Fachara Raj
 * Aim : WAP to show how to create a file with different mode and methods of File class to find 
 *       path, directory etc.
 */
import java.io.File;

public class Prac1 {
    public static void main(String[] args) {
        String filePath = "C:\\Users\\Aryan\\OneDrive\\Desktop\\#Assginment _5\\5_1.txt";
        File myFile = new File(filePath);
        System.out.println("Name of file : " + myFile.getName()); 
        System.out.println("Path of file : " + myFile.getPath()); 
        System.out.println("Absolute path : " + myFile.getAbsolutePath()); 
        System.out.println("Parent Directory : " + myFile.getParent());
        System.out.println("File exsist : " + myFile.exists()); 
        System.out.println("Write permission : " + myFile.canWrite());
        System.out.println("Read permission : " + myFile.canRead());
        System.out.println("Folder  : " + myFile.isDirectory());
        System.out.println("File Size : " + myFile.length()+" bytes");
    }
}