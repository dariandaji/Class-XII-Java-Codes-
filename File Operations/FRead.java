package FileOperations;
import java.io.*;
import java.util.*;
class FRead
{
    public static void main(String args[])throws IOException
    {
        String name1,name2;
        int e,s,c,ch,p=0;
        FileReader fr=new FileReader("Eleven.txt");
        BufferedReader br=new BufferedReader(fr);
        FileWriter fw=new FileWriter("Science.txt");
        BufferedWriter bw=new BufferedWriter(fw);
        PrintWriter pr=new PrintWriter(bw);
        Scanner sc1=new Scanner(new File("Eleven.txt"));
        while(sc1.hasNext())
        {
            name1=sc1.next();
            name2=sc1.next();
            e=sc1.nextInt();
            s=sc1.nextInt();
            c=sc1.nextInt();
            if((e>=80)&&(s>=80)&&(c>=90))
            {
                pr.println(name1);
                pr.println(name2);
                pr.println(e);
                pr.println(s);
                pr.println(c);
            }
        }
        pr.close();
        sc1.close();
        File f1=new File("Eleven.txt");
        f1.delete();
        File f2=new File("Science.txt");
        boolean Rename=f2.renameTo(f1);
        if(!Rename)
            System.out.println("Renaming of file not done");
        else
            System.out.println("Renaming of file done successfully");
    }
}