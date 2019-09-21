package FileOperations;

import java.io.*;
public class RCbytes
{
    public static void main(String args[])throws IOException
    {
        FileInputStream fin=null;
        int p;
        fin=new FileInputStream("Book.txt");
        while((p=fin.read())!=-1)
        {
            System.out.println((char)p);
        }
        FileOutputStream fout=null;
        int b;
        fin=new FileInputStream("Book.txt");
        fout=new FileOutputStream("Word.txt");
        do
        {
            b=fin.read();
            fout.write((char)b);
        }
        while(b!=-1);
        fin.close();
        fout.close();
    }
}