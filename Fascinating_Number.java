package Numbers;
import java.io.*;
public class Fascinating_Number
{
    public static void main (String args[])throws IOException
    {
        int n1,n2,n3;
        char t;
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter a three digit number");
        int num=Integer.parseInt(br.readLine());
        String snum=Integer.toString(num);
        int len=snum.length();
        if(len<3)
            System.out.println("Not a Three Digit Number");
        else if(len>=3)
        {
             n1=num;
             n2=num*2;
             n3=num*3;
             String sn2=Integer.toString(n2);
             String sn3=Integer.toString(n3);
             String s=snum.concat(sn2);
             String str=s.concat(sn3);
             int l=str.length();
             char fn[]=new char[l];
             for(int i=0;i<l;i++)
             {
                 char ch=str.charAt(i);
                 fn[i]=ch;
             }
             for(int i=0;i<l-1;i++)
             {
                 for(int j=i+1;j<l;j++)
                 {
                     if(fn[i]>fn[j])
                     {
                         t=fn[i];
                         fn[i]=fn[j];
                         fn[j]=t;
                     }
                 }
             }
        }
    }
}