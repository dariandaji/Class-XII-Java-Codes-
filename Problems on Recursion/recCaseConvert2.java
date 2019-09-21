package Recursion; 

import java.io.*;
public class recCaseConvert2
{
    String newstr="";
    String caseConvert(String s,int i)
    {
        if(i<s.length())
        {
            char ch=s.charAt(i);
            if(Character.isUpperCase(ch))
                ch=Character.toLowerCase(ch);
            else
                ch=Character.toUpperCase(ch);
            newstr=newstr+ch;
            caseConvert(s,i+1);
        }
        return newstr;
    }
    void display()throws IOException
    {
        BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
        System.out.print("Enter any word : ");
        String s=br.readLine();
        int l=s.length();
        String r1=caseConvert(s,0);
    }
}