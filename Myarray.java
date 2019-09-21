import java.io.*;
public class Myarray
{
    int n;
    int i;
    int ar[]=new int[100];
    Myarray(int nm)
    {
        n=nm;
        for(int i=0;i<100;i++)
        {
            ar[i]=0;
        }
    }
    void readarray() throws IOException
    {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        for(i=0;i<n;i++)
        {
            System.out.println("Enter a number");
            ar[i]=Integer.parseInt(br.readLine());
        }
    }
    void displayarray()
    {
        System.out.println("The elements of the array are: ");
        for(i=0;i<n;i++)
            System.out.print(ar[i]+" ");
        System.out.println();
    }
    int binary_search(int value)
    {
        int lb,ub,mid,found=0,ret;
        lb=0;
        ub=n-1;
        mid=0;
        while(found==0 && lb!=ub)
        {
            mid=(lb+ub)/2;
            if(value<ar[mid])
                ub=mid;
            if(value>ar[mid])
                lb=mid;
            if(value==ar[mid])
                found=1;
            }
            if(found==1)
            ret=value;
            else
            ret=999;
            return ret;
        }
    }
        
    