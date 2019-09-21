import java.io.*;
public class Admission
{
    int adno[]=new int[10];
    int flag=0;
    Admission()
    {
        for(int i=0;i<10;i++)
        adno[i]=0;
    }
    
    void fillArray()throws IOException
    {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter the numbers ");
        for(int i=0;i<10;i++)
        {
            adno[i]=Integer.parseInt(br.readLine());
        }
    }
    
    int binsearch(int l,int q,int v)
    {
        
        int mid;
        mid=(l+q)/2;
        if(l>q || flag==1)
            return(flag);
        else
        {

            flag=1;
            if(v<adno[mid])
            q=mid-1;
            if(v>adno[mid])
            l=mid+1;
            return(binsearch(l,q,v));
        }
    }
    public static void main(String args[]) throws IOException
    {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter the element to be searched");
        int v=Integer.parseInt(br.readLine());
        int l=0;
        int q=100-1;
        Admission obj=new Admission();
        
        int r=obj.binsearch(l,q,v);
        if(r==1)
        System.out.println("Element present");
        else
        System.out.println("Element not present");
    }
}







