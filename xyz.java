class xyz
{
    int a,b;
    void getval(int x, int y)
    {
        a=x;
        b=y;
    }
    void sumobj(xyz p,xyz q)
    {
        a = p.a + q.a;
        b = p.b + q.b;
    }
    void display()
    {
        System.out.println("Sum of a = "+a);
        System.out.println("Sum of b = "+b);
    }
}
class abc
{
    public static void main(String args[])
    {
        xyz ob1=new xyz();
        xyz ob2= new xyz();
        xyz ob3= new xyz();
        ob1.getval(2,3);
        ob2.getval(4,6);
        ob3.sumobj(ob1,ob2);
        ob3.display();
    }
}