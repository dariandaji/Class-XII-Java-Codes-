package Strings;
import java.io.*;
public class Encode3
{
    public static void main(String args[])throws IOException
    {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        System.out.println(" Enter the word ");
        String str=br.readLine();
        str=str.trim();
        String s="";
        System.out.println("Encode : -2");
        int l=str.length();
        for(int i=0;i<l;i++)
        {
            char ch=str.charAt(i);
            if(ch=='A' || ch=='B')
            {
                int r =(int)ch+24;
                char c=(char)r;
                s=s+c;
            }
            else
            {
                int r=(int)ch-2;
                char c=(char)r;
                s=s+c;
            }
        }
        
    
        System.out.println(s);
    }
    }