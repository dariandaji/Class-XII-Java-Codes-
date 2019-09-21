class Derived2 extends Base1
{
    int a=5;
    public void display()
    {
        System.out.println("a = "+a);
        System.out.println("I belong to derived class ");
        System.out.println("a in the super class is : a= "+super.a);
    }
    public void otherMethod()
    {
        System.out.println("I will store a new value in 'a' and invoke method display");
        a=50;
        super.display();
    }
}