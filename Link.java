import java.io.*;
public class Link
{
    int Ink[];
    int max,begin,end;
    Link(int mm) // constructor
    {
        begin=-1;
        end=-1;
        max=mm;
        Ink=new int[max];
    }
    void addLink(int v)
    {
        if(end==max-1)
            System.out.println("OUT OF SIZE");
        else
        {
            if(begin==-1 && end==-1)
            {
                begin=0;
                end=0;
            }
            else
                end=end+1;
            Ink[end]=v;
        }
    }
    int delink()
    {
        int val;
        if(begin==-1 && end==-1)
        {    System.out.println("Empty");
             return -99;
        }
        else
        {
            val=Ink[begin];
            if(begin==end)
            {
                begin=-1;
                end=-1;
            }
            else
                begin=begin+1;
            return val;
        }
    }
    void display()
    {
        System.out.println("Elements of the Link are:");
        for(int j=begin;j<=end;j++)
            System.out.println(Ink[j]);
    }
}