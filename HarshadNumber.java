package Numbers;
import java.util.*;
public class HarshadNumber
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number");
        int n=sc.nextInt();
        int c=n, d,sum=0;
        
        while(c>0)
        {
            d=c%10;
            sum=sum+d;
            c=c/10;
        }
        if(n%sum==0)
        System.out.println(n+" is a Harshad Number");
        else
        System.out.println(n+" is not a Harshad Number");
    }
}