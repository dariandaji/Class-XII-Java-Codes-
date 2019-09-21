package Recursion; 

import java.io.*;
public class recFrequency
{
    int count=0;
    void Frequency(String s,int i,char freq)
    {
        char ch1=freq;
        if(i<s.length())
        {
            char ch=s.charAt(i);
            if(ch==freq)
                count++;
            Frequency(s,i+1,ch1);
        }
        else
            System.out.println("Frequency is : "+count);
    }
    void display()throws IOException
    {
        BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
        System.out.print("Enter the string : ");
        String s=br.readLine();
        System.out.print("Enter the character whose frequency is needed: ");
        char ch=(char)br.read();
        Frequency(s,0,ch);
    }
}