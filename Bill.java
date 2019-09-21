public class Bill extends Detail
{
    int n;
    double amount;
    Bill(int num)
    {
        super("Mr.Reddy","Hyderabad",20267835,500);
        n=num;
    }
    void cal()
    {
        if(n<=100 && n>=1)
        amount=rent;
        if(n<=200 && n>=101)
        amount=rent+0.60*n;
        if(n<=300 && n>=201)
        amount=rent+0.80*n;
        if(n>300)
        amount=rent+1*n;
    }
    void display()
    {
        super.Show();
        System.out.println(" Amount is Rs."+amount);
    }
}