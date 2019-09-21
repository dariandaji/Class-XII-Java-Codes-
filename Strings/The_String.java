package Strings;
import java.io.*;
public class The_String
{
    String str;
    int len,wordcount,cons;
    public void main(String args[])throws IOException
    {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        System.out.println(" Enter the word ");
        str=br.readLine();
        str=str.trim();
        The_String obj= new The_String();
        obj.freq_count();
        obj.display();
    }
    The_String()
    {
        str="";
        len=0;
        wordcount=0;
        cons=0;
    }
    The_String(String ds)
    {
        str=ds;
        len=0;
        wordcount=0;
        cons=0;
    }
    void freq_count()
    {
        int len=str.length();
        for(int i=0;i<len;i++)
        {
            char ch=str.charAt(i);
            if(ch!='A' || ch!='a'||ch!='E' || ch!='e'||ch!='I' || ch!='i'||ch!='O' ||ch!='o'||ch!='U' || ch!='u')
            {
                cons++;
            }
        }
        str=str+" ";
        len=len+1;
        for(int i=0;i<len;i++)
        {
            char ch=str.charAt(i);
            if(ch==' ' && str.charAt(i+1)!=' ')
                wordcount++;
        }
    }
    void display()
    {
        System.out.println("Original string : "+str);
        System.out.println("No. of consonants : "+cons);
        System.out.println("No. of words : "+wordcount);
    }
    
}