package FileOperations;
import java.io.*;
import java.util.*;
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