class Account
{
    protected int accountnumber;
    protected double principal;
    void accept(int a,double p)
    {
        accountnumber=a;
        principal=p;
    }
    void display1()
    {
        System.out.println("Account number : "+accountnumber);
        System.out.println("Principal : "+principal);
    }
}