package FileOperations;

import java.io.*;
public class AppendSentence
{
    public static void main(String args[])throws IOException
    {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        FileWriter fwr=new FileWriter("Text.txt",true);
        BufferedWriter bwr=new BufferedWriter(fwr);
        PrintWriter obj=new PrintWriter(bwr);
        String st;
        int c=0,ch,t=0;
        char chr,chr1;
        System.out.println("Starts appending records");
        do
        {
            System.out.println("Enter a sentence");
            st=br.readLine();
            obj.println(st);
            System.out.println("Want to add more records????   Enter 1 for yes and 2 for no!");
            ch=Integer.parseInt(br.readLine());
        }
        while(ch==1);
        obj.close();
        FileReader fr=new FileReader("Text.txt");
        BufferedReader in=new BufferedReader(fr);
        boolean eof=false;
        int i,l;
        while((st=in.readLine())!=null)
        {
            c++;
            l=st.length();
            st=" "+st;
            for(i=0;i<l-1;i++)
            {
                chr=st.charAt(i);
                if(chr==' ')
                {
                    chr1=st.charAt(i+1);
                    if(chr1=='A' || chr1=='E' ||chr1=='I' || chr1=='O' ||chr1=='U' ||chr1=='a' ||chr1=='e' || chr1=='i' ||chr1=='u' || chr1=='o')
                    t++;
                }
            }
        }
        System.out.println("Number of sentences : "+c);
        System.out.println("Number of words start with vowel in the sentences : "+t);
    }
}