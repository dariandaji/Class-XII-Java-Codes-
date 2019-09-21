package Numbers;

import java.io.*;
public class UniqueNo
{
    boolean Unique(int a)
    {
        String s=Integer.toString(a);
        boolean flag=true;
        int i,j;
        for(i=0;i<s.length();i++)
        {
            for(j=i+1;j<s.length();j++)
            {
                if(s.charAt(j)==s.charAt(i))
                {
                    flag=false;
                    break;
                }
            }
        }
        return flag;
    }
    public void main(String args[])throws IOException
    {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter lower limit");
        int m=Integer.parseInt(br.readLine());
        System.out.println("Enter upper limit");
        int n=Integer.parseInt(br.readLine());
        int l=(n-m)+1;
        if(m<n && m<30000 && n<30000)
        {
            int uni[]=new int[l];
            int prime[]=new int[l];
            boolean flag=true,pr;
            int i,j=0,k=0,p,cnt1=0,cnt2=0;
            for(i=m;i<=n;i++)
            {
                flag=Unique(i);
                if(flag==true)
                {
                    uni[j++]=i;
                    cnt1++;
                    pr=true;
                    for(p=2;p<i;p++)
                    {
                        if(i%p==0)
                        {
                            pr=false;
                            break;
                        }
                    }
                    if(pr==true && i>1)
                    {
                        prime[k++]=i;
                        cnt2++;
                    }
                }
            }
            if(cnt1!=0)
            {
                System.out.println("The no. of Unique Numbers are : "+cnt1);
                for(i=0;i<cnt1;i++)
                    System.out.println(uni[i]);
                System.out.println("The no. of Unique Prime Numbers are : "+cnt2);
                for(i=0;i<cnt1;i++)
                    System.out.println(prime[i]);    
            }
        }
    }
}