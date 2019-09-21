package FileOperations;

import java.io.*;
public class WPrimitive
{
    public static void main(String args[])throws IOException
    {
        File intFile=new File("Number.dat");
        FileOutputStream fout=new FileOutputStream(intFile);
        DataOutputStream ffout=new DataOutputStream(fout);
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        int i,n;
        System.out.println("Enter 5 integer values");
        for(i=0;i<5;i++)
        {
            n=Integer.parseInt(br.readLine());
            ffout.writeInt(n);
        }
        fout.close();
    }
}