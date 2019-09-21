package Recursion;

import java.io.*;
public class Iterative_RevString1
{
    String r="";
    String rev(String s)
    {
        int i=0;
        while(i<s.length())
        {
            char ch=s.charAt(i);
            r=ch+r;
            i++;
        }
        return r;
    }
    void display()throws IOException
    {
        BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
        System.out.print("Enter any word : ");
        String s=br.readLine();
        String r1=rev(s);
        System.out.println("reverse of the String is : "+r1);
    }
}