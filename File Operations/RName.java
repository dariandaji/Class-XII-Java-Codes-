package FileOperations;
import java.io.*;
public class RName
{
    public static void main(String args[])throws IOException
    {
        FileInputStream fin=null;
        int p;
        fin=new FileInputStream("MyName.txt");
        while((p=fin.read())!=-1)
        {
            System.out.println((char)p);
        }
        fin.close();
    }
}