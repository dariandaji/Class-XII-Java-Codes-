import java.io.*;
public class Employee1
{
    long empn;
    double bsal;
    Employee1()
    {
        empn=0;
        bsal=0;
    }
    Employee1(int e,double b)
    {
        empn=e;
        bsal=b;
    }
    void sallnfo()
    {
        System.out.println("Employee code : "+empn+" has basic salary of Rs. "+bsal);
    }
}