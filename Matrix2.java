import java.io.*;
class Matrix2 extends Matrix1
{
    double c[][]=new double [10][10];int r;
    BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
    Matrix2()
    {
        for(int i=0;i<10;i++)
        {
            for(int j=0;j<10;j++)
            {
                c[i][j]=0;
            }
        }
    }
    void find_product()
    {
        if(n==r)
        {
            for(int i=0;i<10;i++)
            {
                for(int j=0;j<10;j++)
                {
                    c[i][j]=0;
                    for(int k=0;k<10;k++)
                    {
                        c[i][j]=c[i][j]+a[i][k]*b[k][j];
                    }
                }
            }
        }
        else
            r=1;
    }
    void showmats()
    {
        if(r!=1)
        {
            System.out.println("Array c is :");
            for(int i=0;i<10;i++)
            {
                for(int j=0;j<10;j++)
                {
                    System.out.print(c[i][j]);
                }
                System.out.println();
            }
        }
    }
}