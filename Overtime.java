class Overtime extends Employee
{
    int nd;
    float rate;
    Overtime(int n,float r,int c, double b)
    {
        super(c,b);
        nd=n;
        rate=r;
    }
    double Calculate()
    {
        double totes=bpay+(nd*rate);
        return totes;
    }
    void show()
    {
        super.display();
        double totes=Calculate();
        System.out.println("No. of days worked : "+nd+" and Salary is : "+totes);
    }
}