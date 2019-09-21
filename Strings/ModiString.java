package Strings;
import java.io.*;
public class ModiString
{
    String str1,str2,str3;
    char ch;
    void getString()throws IOException
    {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        System.out.println(" Enter the first String ");
        str1=br.readLine();
        str1=str1.trim();
        System.out.println(" Enter the second String ");
        str2=br.readLine();
        str2=str2.trim();
        System.out.println(" Enter the third String ");
        str3=br.readLine();
        str3=str3.trim();
    }
    void changestr()throws IOException
    {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        System.out.println(" Enter the character ");
        ch=(char)br.read();
        str1=str1.replace(str1.charAt(0),ch);
        str2=str2.replace(str2.charAt(0),ch);
        str3=str3.replace(str3.charAt(0),ch);
        System.out.println(str1+"     "+str2+"      "+str3);
    }
    void nextstr()
    {
        String s2="",s1="",s3="";
        for(int i=0;i<str1.length();i++)
        {
            char ch1=str1.charAt(i);
            ch1=(char)((int)ch1+1);
            s1=s1+ch1;
        }
        for(int i=0;i<str2.length();i++)
        {
            char ch2=str2.charAt(i);
            ch2=(char)((int)ch2+1);
            s2=s2+ch2;
        }
        for(int i=0;i<str3.length();i++)
        {
            char ch3=str3.charAt(i);
            ch3=(char)((int)ch3+1);
            s3=s3+ch3;
        }
        System.out.println(s1+"     "+s2+"      "+s3);
    }
    void show()throws IOException
    {
        changestr();
        nextstr() ;
    }
}
        
        