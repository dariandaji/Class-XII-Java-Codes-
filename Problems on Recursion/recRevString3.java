package Recursion; 

import java.io.*;
public class recRevString3
{
    String r="";
    String rev(String s,int i)
    {
        if(i>=0)
        {
            char ch=s.charAt(i);
            r=r+ch;
            rev(s,i-1);
        }
        return r;
    }
    void display()throws IOException
    {
        BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
        System.out.print("Enter any word : ");
        String s=br.readLine();
        int l=s.length();
        String r1=rev(s,l);
        System.out.println("reverse of the String is : "+r1);
    }
}