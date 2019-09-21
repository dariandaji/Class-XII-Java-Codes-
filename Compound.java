class Compound extends Account
{
    protected double ci;
    private double rate,time;
    void Compound(double r,double t)
    {
        rate=r;
        time=t;
    }
    double Interest()
    {
        ci=principal*Math.pow((1+(rate/100)),time)-principal;
        return ci;
    }
    void displaycompint()
    {
        display1();
        double s=Interest();
        System.out.println("Rate : "+rate);
        System.out.println("Time : "+time);
        System.out.println("Interest : "+s);
    }
}