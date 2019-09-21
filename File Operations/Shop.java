package FileOperations;

import java.io.*;
import java.util.*;
public class Shop
{
    public static void main(String args[])throws IOException
    {
        int pc,q,rate;
        float amt;
        String name;
        FileWriter fr =new FileWriter("Inventory.txt");
        BufferedWriter br = new BufferedWriter(fr);
        PrintWriter pr=new PrintWriter (br);
        Scanner sc=new Scanner(System.in);
        
        for(int i=1;i<=10;i++)
        {
            System.out.println("Enter product code");
            pc=sc.nextInt();
            System.out.println("Enter product name");
            name=sc.next();
            System.out.println("Enter quantity");
            q=sc.nextInt();
            System.out.println("Enter rate");
            rate=sc.nextInt();
            amt=q*rate;
            pr.println(pc);
            pr.println(name);
            pr.println(q);
            pr.println(rate);
            pr.println(amt);
        }
        pr.close();
        br.close();
        fr.close();
        Scanner s=new Scanner(new File("Inventory.txt"));
        System.out.println();
        System.out.println("----Inventory----");
        System.out.println("Product Code Product Name Quantity  Unit price Shop Inventory Amount ");
        while(s.hasNext())
        {
            pc=s.nextInt();
            name=s.next();
            q=s.nextInt();
            rate=s.nextInt();
            amt=s.nextFloat();
            System.out.println(pc+"     "+name+"    "+q+"       "+rate+"        "+amt);
        }
        s.close();
    }
}