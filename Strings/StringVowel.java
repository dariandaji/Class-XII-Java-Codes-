package Strings;
import java.io.*;
public class StringVowel
{
    static String str;
    public static void main(String args[])throws IOException
    {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        System.out.println(" Enter the word ");
        str=br.readLine();
        str=str.trim();
        vowel(str);
    }
    static void vowel(String word)
    {
        String s="";
        System.out.print(" The vowels are : ");
        int l=str.length();
        for(int i=0;i<l;i++)
        {
            char ch=str.charAt(i);
            if(ch=='A' || ch=='a'||ch=='E' || ch=='e'||ch=='I' || ch=='i'||ch=='O' ||
            ch=='o'||ch=='U' || ch=='u')
            {
                System.out.print(ch+ " , ");
                s=s+ch;
            }
        }
        int len=s.length();
        int counta=0,counte=0,counti=0,counto=0,countu=0;
        for(int i=0;i<len;i++)
        {
            char ch=str.charAt(i);
            if(ch=='A' || ch=='a')
                counta++;
            if(ch=='E' || ch=='e')
                counte++;
            if(ch=='I' || ch=='i')
                counti++;
            if(ch=='O' || ch=='o')
                counto++;
            if(ch=='U' || ch=='u')
                countu++;
        }
        System.out.println();
        System.out.print(" Prominent vowel is : ");
        if(counta>counte && counta>counti && counta>counto && counta>countu)
            System.out.print('a');
        if(counte>counta && counte>counti && counte>counto && counte>countu)
            System.out.print('e');
        if(counti>counte && counti>counta && counti>counto && counti>countu)
            System.out.print('i');
        if(counto>counte && counto>counti && counto>counta && counto>countu)
            System.out.print('o');
        if(countu>counte && countu>counti && countu>counto && countu>counta)
            System.out.print('u');
    }
}
        