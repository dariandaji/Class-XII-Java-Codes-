package FileOperations;
import java.io.*;
public class WRbytes
{
    public static void main(String args[])throws IOException
    {
        byte currency[]={'Y','E','N',' ','D','O','L','L','A','R',' ','R','U','P','E','E'};
        FileOutputStream fou=new FileOutputStream("Currency.txt");
        fou.write(currency);
        
        FileInputStream fin=new FileInputStream("Currency.txt");
        int p;
        while((p=fin.read())!=-1)
        {
            System.out.println((char)p);
        }
        fou.close();
    }
}