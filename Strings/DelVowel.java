package Strings;
import java.io.*;
public class DelVowel
{
    public static void main(String args[])throws IOException
    {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        System.out.println(" Enter the word ");
        String str=br.readLine();
        str=str.trim();
        String s="",s2="";
        int l=str.length();
        for(int i=0;i<l;i++)
        {
            char ch=str.charAt(i);
            if(ch=='A' || ch=='a'||ch=='E' || ch=='e'||ch=='I' || ch=='i'||ch=='O' || ch=='o'||ch=='U' || ch=='u')
                continue;
            s=s+ch;
        }
        System.out.println(s);
        int len=s.length();
        for(int i=65;i<=90;i++)
        {
            for(int j=0;j<len;j++)
            {
                char a=s.charAt(j);
                if(a==(char)i || a==(char)(i+32))
                    s2=s2+a;
            }
        }
        System.out.println(s2);
    }
}