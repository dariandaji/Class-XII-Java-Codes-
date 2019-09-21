package Strings;
import java.io.*;
public class MagicString
{
    public void magic(String name)
    {
        int l=name.length();
        for(int i=0;i<l;i++)
        {
            char ch=name.charAt(i);
            char ch1=name.charAt(i+1);
            if(((int)ch1-1)==(int)ch)
            {
                System.out.println("Magic String");
                break;
            }
            else if(((int)ch1-1)==(int)ch && i==(l-1))
            {
                System.out.println("Not a Magic String");
                break;
            }
            else
            {
                continue;
            }
        }
    }
    public static void main(String args[])throws IOException
    {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        System.out.println(" Enter the word ");
        String str=br.readLine();
        str=str.trim();
        MagicString obj=new MagicString();
        obj.magic(str);
    }
}
        