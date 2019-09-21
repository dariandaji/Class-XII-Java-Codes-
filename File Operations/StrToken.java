package FileOperations;

import java.io.*;
import java.util.*;
public class StrToken
{
    public static void main(String args[])throws IOException
    {
        int count=0;
        Scanner sc=new Scanner(System.in);
        StringTokenizer str=new StringTokenizer("Understanding Computer Science");
        while(str.hasMoreTokens())
        {
            System.out.println(str.nextToken());
            count++;
        }
        System.out.println("Number of tokens : "+count);
    }
}