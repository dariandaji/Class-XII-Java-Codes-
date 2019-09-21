import java.io.*;
public class Principal extends Teacher
{
    String temp,t1,t2;
    int i,j;
    void sortData()
    {
        for(i=0;i<9;i++)
        {
            for(j=(i+1);j<10;j++)
            {
                if(name[i].compareTo(name[j])>0)
                {
                    temp=name[i];
                    name[i]=name[j];
                    name[j]=temp;
                    
                    t1=dob[i];
                    dob[i]=dob[j];
                    dob[j]=t1;
                    
                    t2=doj[i];
                    doj[i]=doj[j];
                    doj[j]=t2;
                }
            }
        }
    }
    void display()
    {
        System.out.println("The names in ascending order are ");
        System.out.println("Name    \t\t Date of Birth \t  Date of Joining ");
        for(int i=0;i<10;i++)
        {
            System.out.println(name[i]+" \t\t "+dob[i]+" \t\t "+doj[i]);
        }
    }
    void searchData()throws IOException
    {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        String search;
        System.out.println("Enter the teacher to be searched");
        search=br.readLine();
        for(int i=0;i<10;i++)
        {
            if(name[i]==search)
            {
                System.out.println("Name    \t\t Date of Birth \t  Date of Joining ");
                System.out.println(name[i]+" \t\t "+dob[i]+" \t\t "+doj[i]);
                break;
            }
            else
                continue;
        }
    }
}