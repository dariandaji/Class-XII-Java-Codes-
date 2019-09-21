import java.io.*;
public class Library
{
    String name,author;
    float p;
    Library(String n, String a,float pr)
    {
        name=n;
        author=a;
        p=pr;
    }
    void show()
    {
        System.out.println("Name of the book is : "+name+" by "+author);
        System.out.println("Cost of the above book is : "+p);
    }
}