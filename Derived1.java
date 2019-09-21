class Derived1 extends Base1
{
    int a=5;
    public void display()
    {
        System.out.println("a = "+a);
        System.out.println("I belong to derived class ");
        super.display();
    }
}