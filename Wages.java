public class Wages extends Worker
{
    double hrs,rate,otime;
    double wage;
    Wages(double h,double r)
    {
        super("Worker1",2000);
        h=hrs;
        r=rate;
    }
    double overtime()
    {
        otime=hrs*rate;
        return otime;
    }
    void display()
    {
        wage=otime+basic;
        super.display();
        System.out.println(" Wage of the worker is Rs."+wage);
    }
}