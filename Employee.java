import java.io.*;
public class Employee
{
    long empc;
    double bpay;
    Employee()
    {
        empc=0;
        bpay=0;
    }
    Employee(int c,double b)
    {
        empc=c;
        bpay=b;
    }
    void display()
    {
        System.out.println("Employee code : "+empc+" has basic salary of Rs. "+bpay);
    }
}