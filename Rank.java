import java.io.*;
class Rank extends Record
{
    int index;
    String Tname;
    Rank()
    {
        super();
        index=0;
    }
    
    void highest()
    {
        for(int i=0;i<15;i++)
        {
            if(rnk[i]==1)
            { 
                index=rnk[i];
                Tname=name[i];
            }
            else
                continue;
        }
    }
    
    void display()
    {
        super.display();
        System.out.println("Name with topmost rank is "+Tname);
    }
    
    public static void main(String args[])throws IOException
    {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        Rank obj=new Rank();
        obj.readValues();
        obj.highest();
        obj.display();
    }
}