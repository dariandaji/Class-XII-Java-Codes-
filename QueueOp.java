public class QueueOp
{
    int q[];
    int f,r,size,val;
    QueueOp(int n) // constructor
    {
        f=-1;
        r=-1;
        size=n;
        q=new int[size];
    }
    void insertqueue(int item) //enqueue function
    {
        if(r==size-1)
            System.out.println("Queue Overflows");
        else
        {
            if(f==-1 && r==-1)
            {
                f=0;
                r=0;
            }
            else
                r=r+1;
            q[r]=item;
        }
    }
    void deletequeue() //dequeue function
    {
        if(f==-1 && r==-1)
            System.out.println("Queue underflows");
        else
        {
            val=q[f];
            if(f==r)
            {
                f=-1;
                r=-1;
            }
            else
                f=f+1;
        }
    }
    void display()
    {
        System.out.println("Elements of the queue");
        for(int j=f;j<=r;j++)
            System.out.println(q[j]);
    }
}