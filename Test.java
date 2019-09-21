import java.io.*;
public class Test
{
    public static void main(String args[])
    {
        current cc=new current();
        cc.printdata();
    }
}

abstract class acc
{
    String name="RX";
    double bal=50000;
    public abstract void printdata();
    public void printdata1()
    {}
}
class current extends acc
{
    double withdraw;
    double dep;
    void calbalance()
    {
        bal=bal-withdraw;
        bal=bal+dep;
        System.out.println("Balance Amount : "+bal);
    }
    public void printdata()
    {
        System.out.println("Name of Account Holder : "+name);
        calbalance();
    }
}