package Recursion;

import java.io.*;
public class IterativeCaseConvert1
{
    void CaseConvert(String s)
    {
        int i=0;
        while(i<s.length())
        {
            char ch=s.charAt(i);
            if(Character.isUpperCase(ch))
                System.out.print(Character.toLowerCase(ch));
            else
                System.out.print(Character.toUpperCase(ch));
            i++;
        }
    }
    void display()throws IOException
    {
        BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
        System.out.print("Enter any word : ");
        String s=br.readLine();
        CaseConvert(s);
    }
}