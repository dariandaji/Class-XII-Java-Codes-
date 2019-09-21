package FileOperations;

import java.io.*;
public class MarksRWPrimitive
{
    public static void main(String args[])throws IOException
    {
        File intFile=new File("Marks.dat");
        FileOutputStream fout=new FileOutputStream(intFile);
        DataOutputStream ffout=new DataOutputStream(fout);
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter the marks of 5 subjects");
        for(int i=0;i<5;i++)
        {
            int n=Integer.parseInt(br.readLine());
            ffout.writeInt(n);
        }
        fout.close();
        
        FileInputStream fin=new FileInputStream(intFile);
        DataInputStream ffin=new DataInputStream(fin);
        System.out.println("Display Values");
        for(int i=0;i<5;i++)
        {
            int n=ffin.readInt();
            System.out.println(n);
        }
        ffin.close();
    }
}