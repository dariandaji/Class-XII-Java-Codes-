package FileOperations;

import java.io.*;
import java.util.*;
public class RTextFile
{
    public static void main(String args[]) throws IOException
    {
        FileReader fin=new FileReader("RV.txt");
        BufferedReader ffin=new BufferedReader(fin);
        Scanner sc=new Scanner(System.in);
        int p;
        System.out.println("Enter 1 to display the records");
        System.out.println("Enter 2 to display the record getting the highest mark"); 
        System.out.println("Enter your choice");
        p=sc.nextInt();
        switch(p)
        {
            case 1:
            int i=0;
            String adm,name1,name2,c1;
            int total;
            System.out.println("Display all the records of the file RV.txt");
            System.out.println("Adm no.    Name                 Class       Total");
            Scanner s1=new Scanner(new File("RV.txt"));
            while(s1.hasNext())
            {
                adm=s1.next();
                name1=s1.next();
                name2=s1.next();
                c1=s1.next();
                total=s1.nextInt();
                System.out.println(adm+ "\t" + name1+" "+name2+"\t"+c1+"\t"+total);
            }
            s1.close();
            break;
            
            case 2:
            int max=0;
            String ad="",n1="",n2="",c="";
            Scanner s2=new Scanner(new File("RV.txt"));
            while(s2.hasNext())
            {
                adm=s2.next();
                name1=s2.next();
                name2=s2.next();
                c1=s2.next();
                total=s2.nextInt();
                if(max<total)
                {
                    max=total;
                    ad=adm;
                    n1=name1;
                    n2=name2;
                    c=c1;
                }
            }
            System.out.println("The record getting the highest marks : ");
            System.out.println("Adm no.    Name                 Class       Total");
            System.out.println(ad+ "\t" + n1+" "+n2+"\t"+c+"\t"+max);
            break;
            
            default:
            System.out.println("Wrong choice !!");
        }
    }
}