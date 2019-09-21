class Salary extends Employee1
{
    float da,hra,spl,tsal;
    Salary()
    {
        da=0;
        hra=0;
        spl=0;
    }
    Salary(float d,float h,float s)
    {
        da=d;
        hra=h;
        spl=s;
    }
    double Calculate_Sal()
    {
        tsal=(float)bsal+da+hra+spl;
        return tsal;
    }
    void show_Salary()
    {
        super.sallnfo();
        System.out.println("DA : "+da);
        System.out.println("HRA : "+hra);
        System.out.println("Spl : "+spl);
        System.out.println("Total Payable Salary : "+tsal);
    }
}