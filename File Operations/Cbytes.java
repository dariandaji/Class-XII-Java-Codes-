package FileOperations;

import java.io.*;
public class Cbytes
{
    public static void main(String args[])throws IOException
    {
        FileInputStream fin=null;
        FileOutputStream fout=null;
        int b;
        fin=new FileInputStream("Capital.txt");
        fout=new FileOutputStream("Book.txt");
        do
        {
            b=fin.read();
            fout.write((char)b);
        }
        while(b!=-1);
    }
}