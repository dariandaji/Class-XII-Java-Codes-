package Recursion;

import java.io.*;
public class RemoveVowel
{
    static String s,str="";
    static int l;
    static String RemVowel(String s,int i)
    {
        l=s.length();
        if(i<l)
        {
            char ch=s.charAt(i);
            if(ch=='a' || ch=='e' || ch=='i' || ch=='o' || ch=='u' || ch=='A' || ch=='E'
            || ch=='I' || ch=='O' || ch=='U')
            {
                str=str;
            }
            else
            str=str+ch;
            RemVowel(s,i+1);
        }
        return str;
    }
    public static void main(String args[])throws IOException
    {
        BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
        System.out.print("Enter the string : ");
        String s=br.readLine();
        String s1=RemVowel(s,0);
        System.out.println(s1);
    }
}