import java.io.*;
class Matrix1
{
    int m,n,r,c;
    double a[][]=new double[10][10];
    double b[][]=new double [10][10];
    BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
    Matrix1()
    {
        m=0;r=0;n=0;c=0;
        for(int i=0;i<m;i++)
        {
            for(int j=0;j<n;j++)
            {
                a[i][j]=0;
            }
        }
        for(int i=0;i<r;i++)
        {
            for(int j=0;j<c;j++)
            {
                b[i][j]=0;
            }
        }
    }
    void readLimit()throws IOException
    {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Input m and n");
        m=Integer.parseInt(br.readLine());
        n=Integer.parseInt(br.readLine());
        System.out.println("Input r and c");
        r=Integer.parseInt(br.readLine());
        c=Integer.parseInt(br.readLine());
    }
    void input_a()throws IOException
    { 
        System.out.println("Enter elements in array a");
        for(int i=0;i<m;i++)
        {
            for(int j=0;j<n;j++)
            {
                a[i][j]=Double.parseDouble(br.readLine());
            }
        }
    }
    void input_b()throws IOException
    {
        System.out.println("Enter elements in array b");
        for(int i=0;i<r;i++)
        {
            for(int j=0;j<c;j++)
            {
                b[i][j]=Double.parseDouble(br.readLine());
            }
        }
    }
    void showmats()
    {
        System.out.println("Array a is :");
        for(int i=0;i<m;i++)
        {
            for(int j=0;j<n;j++)
            {
                System.out.print(a[i][j]);
            }
            System.out.println();
        }
        System.out.println("Array b is :");
        for(int i=0;i<r;i++)
        {
            for(int j=0;j<c;j++)
            {
                System.out.print(b[i][j]);
            }
            System.out.println();
        }
    }
}