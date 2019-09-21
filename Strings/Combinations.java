package Strings;
import java.io.*;
public class Combinations
{
    public static void main(String args[])throws IOException
    {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        System.out.println(" Enter three letter word!");
        String str=br.readLine();
        str=str.trim();
        System.out.println("The required combinations of the word :");
        int l=str.length();
        for(int i=0;i<l;i++)
        {
            for(int j=0;j<l;j++)
            {
                for(int k=0;k<l;k++)
                {
                    if(i!=j && j!=k && k!=i)
                        System.out.println(str.charAt(i)+""+str.charAt(j)+""+str.charAt(k));
                }
            }
            System.out.println();
        }
    }
}