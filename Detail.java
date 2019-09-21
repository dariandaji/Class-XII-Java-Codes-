import java.io.*;
class Detail
{
    String name,address;
    long telno;
    double rent;
    Detail(String n,String a,long t,double r)
    {
        name=n;
        address=a;
        telno=t;
        rent=r;
    }
    void Show()
    {
        System.out.println(" Name of the customer : "+name);
        System.out.println(" Address of the customer : "+address);
        System.out.println(" Telephone Number of the customer : "+telno);
        System.out.println(" Rent : "+rent);
    }
}
    