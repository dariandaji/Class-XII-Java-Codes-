package FileOperations;
import java.io.*;
public class Subjects
{
    public static void main(String args[])throws IOException
    {
        byte currency[]={'P','H','Y','S','I','C','S',' ','C','H','E','M','I','S','T','R','Y'};
        FileOutputStream fou=new FileOutputStream("Subjects.txt");
        fou.write(currency);
        
        FileInputStream fin=new FileInputStream("Subjects.txt");
        int p;
        while((p=fin.read())!=-1)
        {
            System.out.println((char)p);
        }
        fou.close();
    }
}