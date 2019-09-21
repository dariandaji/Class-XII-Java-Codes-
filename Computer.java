import java.io.*;
class Computer extends Library
{
    double day,day1;
    double fine;
    double totes;
    Computer(double d)
    {
        super("Harry Potter 2","JK Rowling", 5000);
        day=d;
    }
    void fine()
    {
        day1=day-7;
        if(day1<=5 && day1>=1)
            fine=2*day1;
        else if(day1<=10 && day1>=6)
            fine=3*day1;
        else if(day1>10)
            fine=5*day1;
        totes=(0.02*p)*day+fine;
    }
    void display()
    {
        super.show();
        System.out.println("No. of excess days : "+day1);
        System.out.println("Fine : "+fine);
        System.out.println("Total amount to be paid : "+totes);
    }
}