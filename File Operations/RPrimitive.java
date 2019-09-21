package FileOperations;

import java.io.*;
public class RPrimitive
{
    public static void main(String args[])throws IOException
    {
        File intFile=new File("Number.dat");
        FileInputStream fin=new FileInputStream(intFile);
        DataInputStream ffin=new DataInputStream(fin);
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        int i,n;
        System.out.println("Display Values");
        for(i=0;i<5;i++)
        {
            n=ffin.readInt();
            System.out.println(n);
        }
        ffin.close();
    }
}