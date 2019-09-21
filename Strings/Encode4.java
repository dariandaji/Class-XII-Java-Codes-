package Strings;

import java.io.*;
public class Encode4
{
    public static void main(String args[])throws IOException
    {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        System.out.println(" Enter the word ");
        String str=br.readLine();
        str=str.trim();
        String s="";
        System.out.println("Encode : -3");
        int l=str.length();
        for(int i=0;i<l;i++)
        {
            char ch=str.charAt(i);
            if(ch=='A' || ch=='B' || ch=='C')
            {
                int r =(int)ch+23;
                char c=(char)r;
                s=s+c;
            }
            else
            {
                int r=(int)ch-3;
                char c=(char)r;
                s=s+c;
            }
        }
        System.out.println(s);
    }
    }