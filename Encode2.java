import java.io.*;
public class Encode2
{
    public static void main(String args[])throws IOException
    {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        System.out.println(" Enter the word ");
        String str=br.readLine();
        str=str.trim();
        String s="";
        System.out.println("Enter the Encode : ");
        int e=Integer.parseInt(br.readLine());
        int l=str.length();
        for(int i=0;i<l;i++)
        {
            char ch=str.charAt(i);
            int as=(int)ch;
            int r=(int)ch+e;
            if(r>90 || r >122)
            {
                s=s+((char)(ch-(26-e)));
            }
            else
            {
                char c=(char)r;
                s=s+c;
            }
        }
    
        System.out.println(s);
    }
    }