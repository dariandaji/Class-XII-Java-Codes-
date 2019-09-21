import java.io.*;
public class Merger
{
    long n1,n2,merg;
    Merger()
    {
        n1=0;
        n2=0;
        merg=0;
    }
    void readNum() throws IOException
    {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter the 1st long integer number");
        n1=Integer.parseInt(br.readLine());
        System.out.println("Enter the 2nd long integer number");
        n2=Integer.parseInt(br.readLine());
    }
    void joinNum()
    {
        String s1=Long.toString(n1);
        String s2=Long.toString(n2);
        String s3=s1+s2;
    }
}