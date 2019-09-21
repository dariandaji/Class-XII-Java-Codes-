import java.io.*;
class Record
{
    String name[];
    int rnk[];
    Record()
    {
        name=new String [15];
        rnk=new int[15];
    }
    void readValues()throws IOException
    {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Input Names and Ranks");
        System.out.println("Enter rank of student followed by names of students");
        for(int i=0;i<15;i++)
        {
            rnk[i]=Integer.parseInt(br.readLine());
            name[i]=br.readLine();
        }
    }
    void display()
    {
        System.out.println("RANK          NAME");
        for(int i=0;i<15;i++)
        {
            System.out.println(rnk[i]+"          "+name[i]);
        }
    }
}
