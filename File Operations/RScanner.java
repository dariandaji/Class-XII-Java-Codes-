package FileOperations;

import java.io.*;
import java.util.Scanner;
public class RScanner
{
    public static void main(String args[])throws IOException
    {
        File f1=new File("Names.txt");
        Scanner s=new Scanner(f1);
        String nm;
        int total;
        System.out.println("Name "+ "\t" + "Total ");
        while(s.hasNext())
        {
            nm=s.next();
            total=s.nextInt();
            
            System.out.println(nm+ "\t" + total);
        }
    }
}