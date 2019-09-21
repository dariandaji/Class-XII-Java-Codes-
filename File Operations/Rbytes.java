package FileOperations;
import java.io.*;
public class Rbytes
{
    public static void main(String args[])throws IOException
    {
        FileInputStream fin=null;
        int p;
        fin=new FileInputStream("Capital.txt");
        while((p=fin.read())!=-1)
        {
            System.out.println((char)p);
        }
        fin.close();
    }
}