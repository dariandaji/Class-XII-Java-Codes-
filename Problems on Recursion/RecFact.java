package Recursion;

import java.io.*;
public class RecFact
{
    int n,r,fact;
    RecFact()
    {
        n=0;
        r=0;
    }
    void readnum()throws IOException
    {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter value of n");
        n=Integer.parseInt(br.readLine());
        System.out.println("Enter value of r");
        r=Integer.parseInt(br.readLine());
    }
    int factorial(int n)
    {
        if(n==0)
            return 1;
        else
            return(n*factorial(n-1));
    }
    void factSeries()
    {
        int series = factorial(n)/ (factorial(r)*(factorial(n-r)));
        System.out.println("Value of the series is "+series);
    }
    public void main()throws IOException
    {
        RecFact obj=new RecFact();
        obj.readnum();
        obj.factSeries();
    }
}