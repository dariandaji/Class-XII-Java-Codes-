package FileOperations;

import java.io.*;
import java.util.*;
public class FileStrToken
{
    public static void main(String args[])throws IOException
    {
        FileReader file=new FileReader("Name.txt");
        BufferedReader fileInput=new BufferedReader(file);
        String text;
        
        int i=0;
        int numberOfTokens=0;
        while((text=fileInput.readLine())!=null)
        {
            StringTokenizer str=new StringTokenizer(text);
            numberOfTokens=numberOfTokens+str.countTokens();
        }
        System.out.println("Number of Tokens : "+numberOfTokens);
        fileInput.close();
    }
}