package Recursion; 

import java.io.*;
public class recRevString4
{
    void rev(String s,int i)
    {
        if(i>=0)
        {
            char ch=s.charAt(i);
            rev(s,i+1);
            System.out.print(ch);
        }
    }
    void display()throws IOException
    {
        BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
        System.out.print("Enter any word : ");
        String s=br.readLine();
        int l=s.length();
        rev(s,l);
    }
}