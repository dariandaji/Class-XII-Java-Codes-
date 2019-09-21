package Numbers;

/** Examples of Merseene 1,3,7,15,31,63,127....
 * few Double Merseene are 1,7,127,32767,2147483647
 */

class Double_Mersenne
{
    public void isMerseeneNo(int n)
    {
        int flag=0;
        int num=0;
        for(int i=1;i<n;i++)
        {
            num = (int)(Math.pow(2,i)-1) ;
            if(num==n)
            {
                flag=1;
                break;
            }
        }
        if(flag==1)
        System.out.println(n+ " is a Mersenne no.");
        else
        System.out.println(n+ " is not a Mersenne no.");
    }
    
    public void genMerseeneNo(int n)
    {
        int flag=0;
        int num=0;
        for(int i=1;i<=n;i++)
        {
            for(int j=1;j<=i;j++)
            {
                num = (int)(Math.pow(2,j)-1) ;
                if(num==i)
                {
                    System.out.println(i+ " is a Mersenne no.");
                    break;
                }
            }
        }
    }
   
    public void isDoubleMerseeneNo(int n)
    {
        int flag=0;
        int num=0;
        int pwr=0;
        for(int i=1;i<n;i++)
        {
            pwr = (int)(Math.pow(2,i)-1) ;
            num=(int)(Math.pow(2,pwr)-1);
            if(num==n)
            {
                flag=1;
                break;
            }
        }
        if(flag==1)
        System.out.println(n+ " is a Double Mersenne no.");
        else
        System.out.println(n+ " is not a Double Mersenne no.");
    }
    
    public void genDoubleMerseeneNo(int n)
    {
        int flag=0;
        int num=0; 
        int pwr=0;
        for(int i=1;i<=n;i++)
        { 
            for(int j=1;j<=i;j++)
            {
                pwr = (int)(Math.pow(2,j)-1) ;
                num=(int)(Math.pow(2,pwr)-1);
                if(num==i)
                {
                    System.out.println(i+ " is a Double Mersenne no.");
                    break;
                }
            }   
        }
    }
}