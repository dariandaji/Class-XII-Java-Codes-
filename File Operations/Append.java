package FileOperations;

import java.io.*;
import java.util.*;
public class Append
{
    public static void main(String args[])throws IOException
    {
        int i,m,n,p;
        String name1,name2,cl,adm,reg;
        
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter 1---------To Enter");
        System.out.println("Enter 2---------To Display the Records");
        System.out.println("Enter 3---------To Append");
        System.out.println("Enter 4---------To Display the appended records");
        System.out.println("Enter your choice");
        p=sc.nextInt();
        
        switch(p)
        {
            case 1:
            FileWriter fr =new FileWriter("Admission.txt");
            BufferedWriter br = new BufferedWriter(fr);
            PrintWriter pr=new PrintWriter (br);
            System.out.println("Enter the number of records to be entered");
            n=sc.nextInt();
            for(i=1;i<=n;i++)
            {
                System.out.println("Enter Registration number");
                reg=sc.next();
                System.out.println("Enter first name");
                name1=sc.next();
                System.out.println("Enter surname");
                name2=sc.next();
                System.out.println("Enter class");
                cl=sc.next();
                System.out.println("Enter date of admission");
                adm=sc.next();
                pr.println(reg);
                pr.println(name1);
                pr.println(name2);
                pr.println(cl);
                pr.println(adm);
            }
            pr.close();
            br.close();
            fr.close();
            break;
            
            case 2:
            Scanner s=new Scanner(new File("Admission.txt"));
            System.out.println("Reg No.     Name        Class   Date of Admission");
            while(s.hasNext())
            {
                reg=s.next();
                name1=s.next();
                name2=s.next();
                cl=s.next();
                adm=s.next();
                System.out.println(reg+"       "+name1+" "+name2+"     "+cl+"  "+adm);
            }
            s.close();
            break;
            
            case 3:
            FileWriter fr1 =new FileWriter("Admission.txt",true);
            BufferedWriter br1 = new BufferedWriter(fr1);
            PrintWriter pr1=new PrintWriter(br1);
            Scanner sc1=new Scanner(System.in);
            System.out.println("Enter the number of new records to be entered");
            m=sc.nextInt();
            for(i=1;i<=m;i++)
            {
                System.out.println("Enter Registration number");
                reg=sc1.next();
                System.out.println("Enter first name");
                name1=sc1.next();
                System.out.println("Enter surname");
                name2=sc1.next();
                System.out.println("Enter class");
                cl=sc1.next();
                System.out.println("Enter date of admission");
                adm=sc1.next();
                pr1.println(reg);
                pr1.println(name1);
                pr1.println(name2);
                pr1.println(cl);
                pr1.println(adm);
            }
            pr1.close();
            br1.close();
            fr1.close();
            break;
            
            case 4:
            Scanner sc2=new Scanner(new File("Admission.txt"));
            System.out.println("Reg No.     Name        Class   Date of Admission");
            while(sc2.hasNext())
            {
                reg=sc2.next();
                name1=sc2.next();
                name2=sc2.next();
                cl=sc2.next();
                adm=sc2.next();
                System.out.println(reg+"       "+name1+" "+name2+"      "+cl+"  "+adm);
            }
            sc2.close();
            break;
            
            default:
            System.out.println("Wrong choice!!");
        }
    }
}