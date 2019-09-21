import java.io.*;
public class ISC2015
{
    public static void main(String args[])throws IOException
    {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        System.out.println(" Enter the sentence with each word separated by a single blank space");
        String str=br.readLine();
        str=str.trim();
        String a="?",b=".";
        if(str.endsWith(a) || str.endsWith(b))
        {
            int l=str.length();
            String s="";
            for(int i=0;i<l;i++)
            {
                char ch=str.charAt(i);
                char ch1=str.charAt(i+1);
                if(ch==' ' && (str.charAt(i+1))!=' ')
                {
                    ch1=Character.toUpperCase(ch1);
                    s=s+ch1;
                }
                else
                {
                    s=s+ch1;
                }
            }
            int countv=0,countc=0;
            String sv="";
            String sc="";
            for(int i=0;i<l;i++)
            {
               char ch=str.charAt(i);
               if(ch=='a'|| ch=='e' || ch=='i' || ch=='o' || ch=='u'||ch=='A'|| ch=='E' || ch=='I' || ch=='O' || ch=='U')
               {
                   countv++;
               }
               else
                    countc++;
            }
            System.out.println("New word : "+str);
            System.out.println("No. of vowels : "+countv);
            System.out.println("No. of consonants : "+countc);
        }
        else
        {
            System.out.println("Error...Sentence does not end with ? or .");
        }
    }
}