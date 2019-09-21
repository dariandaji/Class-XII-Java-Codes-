package Numbers;
/**  Mobius Function
 * Ex: M(78)=-1  (for 78=2*3*13  M(78)=(-1)^3=-1)
 */
import java.util.*;
import java.io.*;
public class Mobius
{
    int n;
    Mobius()
    {
        n=0;
    }
    void input()throws IOException
    {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter value of n");
        n=Integer.parseInt(br.readLine());
    }
    int primeFact()
    {
        int c=0,a=n;
        int i=2, f=0;
        while(a>1)
        {
            while(a%i==0)
            {
                c++;
                f++;
                a=a/i;
            }
            i++;
            if(c>1)
            return 0;
        }
        return f;
    }
    void display()
    {
        int mob,x;
        if(n==1)
            mob=1;
        else
        {
            x=primeFact();
            if(x==0)
                mob=0;
            else
                mob=(int)Math.pow(-1,x);
        }
        System.out.println("Mobius of "+n+" is = "+mob);
    }
}
