package Numbers;

import java.io.*;
public class Disarium
{
    public static void main(String args[])throws IOException
    {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        int n;
        int d=0,sum=0;
        System.out.println("Enter a number");
        n=Integer.parseInt(br.readLine());
        int copy=n;
        String s=Integer.toString(n);
        int len=s.length();
        while (copy>0)
        {
            d=copy%10;
            sum=sum+(int)Math.pow(d,len);
            len--;
            copy=copy/10;
        }
        
        if(sum==n)
            System.out.println(n+" is a Disarium Number ");
        else
            System.out.println(n+" is not a Disarium Number ");
    }
}