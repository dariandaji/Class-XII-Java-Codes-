package Recursion; 

import java.io.*;
public class Change
{
    String str,newstr;
    int len;
    Change()
    {
        str="";
        newstr="";
        len=0;
    }
    
    void inputWord()throws IOException
    {
        BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter a word ");
        String str=br.readLine();
        len=str.length();
    }
    
    char caseConvert(char ch)
    {
        if(ch>=65&&ch<=90)
        {
            ch=Character.toLowerCase(ch);
            return ch;
        }
        else
        {
            ch=Character.toUpperCase(ch);
            return ch;
        }
    }
    
    void recChange(int i)
    {
        if(i<str.length())
        {
            char ch1=str.charAt(i);
            ch1=caseConvert(ch1);
            newstr=newstr+ch1;
            recChange(i+1);
        }
    }
    
    void display()
    {
        System.out.println("The original string is : "+str);
        System.out.println("The new string is : "+newstr);
    }
    
    public static void main(String args[])throws IOException
    {
        Change obj=new Change();
        obj.inputWord();
        obj.recChange(0);
        obj.display();
    }
}