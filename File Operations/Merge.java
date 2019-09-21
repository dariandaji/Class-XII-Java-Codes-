package FileOperations;

import java.io.*;
public class Merge
{
    public static void main(String args[])throws IOException
    {
        String name,reg="";
        int m=0,n=0,p;
        String name1[]=new String[5];
        String reg1[]=new String[5];
        FileReader fr1 =new FileReader("Registration.txt");
        BufferedReader br1 = new BufferedReader(fr1);
        
        FileReader fr2 =new FileReader("Name.txt");
        BufferedReader br2 = new BufferedReader(fr2);
        
        FileWriter fr3 =new FileWriter("Admission1.txt");
        BufferedWriter br3 = new BufferedWriter(fr3);
        
        PrintWriter pr=new PrintWriter(br3);
        
        while(((name=br2.readLine())!=null))
        {
            name1[m]=name;
            m++;
        }
        while(((reg=br1.readLine())!=null))
        {
            reg1[n]=reg;
            n++;
        }
        for(p=0;p<m;p++)
        {
            String str=name1[p]+"    "+reg1[p];
            pr.println(str);
        }
        br1.close();
        br2.close();
        pr.close();
    }
}