package Recursion; 

import java.io.*;
public class recCaseConvert1
{
    void caseConvert(String s,int i)
    {
        if(i<s.length())
        {
            char ch=s.charAt(i);
            if(Character.isUpperCase(ch))
                System.out.print(Character.toLowerCase(ch));
            else
                System.out.print(Character.toUpperCase(ch));
            caseConvert(s,i+1);
        }
    }
    void display()throws IOException
    {
        BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
        System.out.print("Enter any word : ");
        String s=br.readLine();
        int l=s.length();
        caseConvert(s,0);
    }
}