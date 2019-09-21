package Recursion;

import java.io.*;
public class RecursivePattern
{
    void Pattern(String s,int i)
    {
        int l=s.length();
        if(i<=l)
        {
            System.out.println(s.substring(0,i));
            Pattern(s,i+1);
        }
    }
    public static void main(String args[])throws IOException
    {
        BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
        System.out.print("Enter the string : ");
        String s=br.readLine();
        RecursivePattern obj=new RecursivePattern();
        obj.Pattern(s,0);
    }
}
