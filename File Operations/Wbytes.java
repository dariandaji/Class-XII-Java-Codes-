package FileOperations;
import java.io.*;
public class Wbytes
{
    public static void main(String args[])throws IOException
    {
        byte capital[]={'R','A','N','C','H','I',' ','N','E','W','D','E','L','H','I',' ','P','A','T','N','A'};
        FileOutputStream fout=null;
        fout=new FileOutputStream("Capital.txt");
        fout.write(capital);
        fout.close();
    }
}