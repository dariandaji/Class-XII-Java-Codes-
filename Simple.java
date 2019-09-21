class Simple extends Account
{
    protected double si;
    private double rate,time;
    void Simple(double r,double t)
    {
        rate=r;
        time=t;
    }
    double Interest()
    {
        si=(principal*rate*time)/100;
        return si;
    }
    void display2()
    {
        display1();
        double s=Interest();
        System.out.println("Rate : "+rate);
        System.out.println("Time : "+time);
        System.out.println("Interest : "+s);
    }
}