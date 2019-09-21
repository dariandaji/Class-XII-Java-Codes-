class Stacks
{
    int s[]=new int[20];
    int sp,n;
    Stacks(int nm)
    {
        for(int i=0;i<20;i++)
        {
            s[i]=0;
        }
        sp=-1;
        n=nm;
    }
    void pushData(int item)
    {
        if(sp==(n-1))
            System.out.println("STACK OVERFLOW");
        else
        {
            sp++;
            s[sp]=item;
        }
    }
    void popData()
    {
        int v;
        if(sp==-1)
            System.out.println("STACK UNDERFLOW");
        else
        {
            v=s[sp];
            System.out.println("Popped out element is "+v);
            sp--;
        }
    }
    void display()
    {
        if(sp==-1)
            System.out.println("STACK EMPTY");
        else
        {
            System.out.println(s[sp]);
            for(int i=sp-1;i>=0;i--)
            {
                System.out.println(s[i]);
            }
        }
    }
}