package FileOperations;

import java.io.*;
import java.util.*;
public class FileCreate
{
    public static void main(String args[])throws IOException
    {
        String name1,name2;
        int e,s,c,ch,p=0;
        FileWriter fr=new FileWriter("Eleven.txt");
        BufferedWriter br=new BufferedWriter(fr);
        PrintWriter pr=new PrintWriter(br);
        Scanner sc=new Scanner(System.in);
        do
        {
            System.out.println("Enter first name and last name");
            name1=sc.next();
            name2=sc.next();
            System.out.println("Enter marks in 3 subjects : Eng, Science and Computer");
            e=sc.nextInt();
            s=sc.nextInt();
            c=sc.nextInt();
            pr.println(name1);
            pr.println(name2);
            pr.println(e);
            pr.println(s);
            pr.println(c);
            System.out.println("Want to add more records? Enter 1 for yes and 2 for No");
            ch=sc.nextInt();
            p++;
        }while(ch==1);
        pr.close();
        br.close();
        fr.close();
    }
}

class MFRead
{
    public static void main(String args[])throws IOException
    {
        String name1,name2;
        int e,s,c,ch,p=0;
        FileReader fr=new FileReader("Eleven.txt");
        BufferedReader br=new BufferedReader(fr);
        Scanner sc2=new Scanner(new File("Eleven.txt"));
        while(sc2.hasNext())
        {
            name1=sc2.next();
            name2=sc2.next();
            e=sc2.nextInt();
            c=sc2.nextInt();
            s=sc2.nextInt();
            System.out.println(name1+" "+name2+"    "+e+"   "+s+"   "+c);
        }
        sc2.close();
    }
}