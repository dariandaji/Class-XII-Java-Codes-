import java.io.*;
public class Time
{
    int h1,h2,m1,m2,h3,m3;
    public void input()throws IOException
    {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter time in hours and then the minutes");
        h1=Integer.parseInt(br.readLine());
        m1=Integer.parseInt(br.readLine());
        System.out.println("Enter another time in hours and then the minutes");
        h2=Integer.parseInt(br.readLine());
        m2=Integer.parseInt(br.readLine());
    }
    public void add()
    {
        int tm=m1+m2;
        if(tm>=60)
        {
            m3=tm-60;
            h3=h1+h2+1;
        }
        else
        {
            h3=h1+h2;
            m3=m1+m2;
        }
    }
    void display()
    {
        System.out.println("The total time is "+h3+" hours and "+m3+" minutes");
    }
}