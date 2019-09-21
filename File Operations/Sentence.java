package FileOperations;
import java.io.*;
import java.util.*;
public class Sentence
{
    public static void main(String args[])throws IOException
    {
        Scanner in=new Scanner(System.in);
        FileWriter fwr=new FileWriter("Sentence.txt");
        BufferedWriter bwr=new BufferedWriter(fwr);
        PrintWriter ob=new PrintWriter(bwr);
        String st;
        System.out.println("Enter a sentence");
        st=in.nextLine();
        ob.println(st);
        ob.close();
        Scanner inp=new Scanner(System.in);
        Scanner std=new Scanner(new File("Sentence.txt"));
        System.out.println("Sentence        No. of words    No. of vowels");
        int i,c=0,w=0;String str="";
        while(std.hasNextLine())
        {
            str=std.nextLine();
            c=0;
            for(i=0;i<str.length();i++)
            {
                char b=str.charAt(i);
                if(b==' ')
                w++;
                if(b=='A' || b=='E' ||b=='I' || b=='O' ||b=='U' || b=='a' ||b=='e' || b=='i' ||b=='u' || b=='o')
                c++;
            }
        }
        System.out.println(str+"\t\t"+(w+1)+"\t\t"+c);
        std.close();
    }
}