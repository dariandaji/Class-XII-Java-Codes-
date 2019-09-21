package Strings;
import java.io.*;
public class Sentences
{
    public static void main(String args[])throws IOException
    {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        System.out.println(" Enter sentences(max 10)");
        String str=br.readLine();
        str=str.trim();
        int l=str.length();
        int count=1,count1=0;
        for(int i=0;i<l;i++)
        {
            char ch=str.charAt(i);
            if(ch=='!'||ch=='?'|| ch=='.')
            {
                count++;
            }
        }
        if(count<=10)
        {
            count =0;
            for(int i=0;i<l;i++)
            {
                char ch=str.charAt(i);
                if(ch=='!'||ch=='?'|| ch=='.')
                {
                    int key=i;
                    String s=str.substring(key,i);
                    int len=s.length();
                    for(int j=0;j<len;j++)
                    {
                        char ch1=s.charAt(j);
                        if(ch1=='a'|| ch=='e' || ch=='i' || ch=='o' || ch=='u'||ch1=='A'|| ch=='E' || ch=='I' || ch=='O' || ch=='U')
                        {
                            count1++;
                        }
                        System.out.println(" At sentence "+count+", number of vowels are : "+count1);
                    }
                    count++;
                }
            }
        }
        else
            System.out.println("Sentence Limit crossed");
    }
}