public class Repeat
{
    int st[];
    int f,r,cap,val;
    Repeat(int m)
    {
        f=0;
        r=0;
        cap=m+1;
        st=new int[m+1];
    }
    void pushvalue(int v)
    {
        if(r==cap-1)
            System.out.println("Overflow");
        else
        {
            if(f==-1 && r==-1)
            {
                f=0;
                r=0;
            }
            else
                r=r+1;
            st[r]=v;
        }
    }
    int popvalue()
    { 
        int j=-9999;
        if(f==0 && r==0)
            return j;
        else
        {
            val=st[f];
            if(f==r)
            {
                f=-1;
                r=-1;
            }
            else
                f=f+1;
            return val;
        }
    }
    void disp()
    {
        System.out.println("Elements of the queue");
        for(int j=f;j<=r;j++)
            System.out.println(st[j]);
    }
}