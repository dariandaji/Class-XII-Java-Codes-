package FileOperations;
import java.io.*;
import java.util.*;
public class UDefDeli
{
    public static void main(String args[])throws IOException
    {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        
        System.out.println("Enter the String");
        String s=br.readLine();
        int count=0;
        Scanner sc=new Scanner(s);
        int l=s.length();
        while(sc.hasNext())
        {
            sc.next();
            count++;
        }
        System.out.println("No. of tokens is "+count);
    }
}