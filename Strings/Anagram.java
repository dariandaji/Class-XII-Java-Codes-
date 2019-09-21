package Strings;
import java.io.*;
public class Anagram
{
    public static void main(String args[])throws IOException
    {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        int as1,as2,n1=0,n2=0;
        String s3="",s4="";
        System.out.println(" Enter first word");
        String s1=br.readLine();
        System.out.println(" Enter second word");
        String s2=br.readLine();
        s1=s1.trim();
        s2=s2.trim();
        s1=s1.toUpperCase();
        s2=s2.toUpperCase();
        int l1=s1.length();
        int l2=s2.length();
        if(l1==l2)
        {
            for(int i=65;i<=90;i++)
            {
                for(int j=0;j<l2;j++)
                {
                    char ch1=s1.charAt(j);
                    char ch2=s2.charAt(j);
                    as1=(int)ch1;
                    as2=(int)ch2;
                    if(as1==i)
                    {
                        s3=s3+ch1;
                        n1=n1+as1;
                    }
                    if(as2==i)
                    {
                        s4=s4+ch2;
                        n2=n2+as2;
                    }
                }
            }
            if(s3.equals(s4)&&(s1==s2))
                System.out.println(s1+" and "+s2+" are Anagram words");
            else
                System.out.println(s1+" and "+s2+" are not Anagram words");
        }
        else
            System.out.println("Wrong input! Re-enter words for Anagram");
    }
}