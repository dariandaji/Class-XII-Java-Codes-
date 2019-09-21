package Strings;
import java.io.*;
public class PigLatinSent
{
    public static void main(String args[])throws IOException
    {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        System.out.println(" Enter the word ");
        String str=br.readLine();
        str=str.trim()+' ';
        String s="",c,d;int j;
        int l=str.length();
        for(int i=0;i<l;i++)
        {
            char ch=str.charAt(i);
            if(Character.isWhitespace(ch))
            {
                int len=s.length();
                for(j=0;j<len;j++)
                {
                    char a=s.charAt(j);
                    if(a=='A' || a=='a'||a=='E' || a=='e'||a=='I' || a=='i'||a=='O' || a=='o'||a=='U' || a=='u')
                        break;
                }
                c=s.substring(j,len);
                d=s.substring(0,j);
                System.out.print(c+d+"AY"+' ');
                s="";
            }
            else
                    s=s+ch;        
        }
    }
}