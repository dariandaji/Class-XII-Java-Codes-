import java.io.*;
public class Teacher
{
    String name[]=new String[10];
    String dob[]=new String[10];
    String doj[]=new String[10];
    void getData()throws IOException
    {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        for(int i=0;i<10;i++)
        {
            System.out.println("Enter the name of teacher number "+(i+1));
            name[i]=br.readLine();
            System.out.println("Enter her date of birth");
            dob[i]=br.readLine();
            System.out.println("Enter her date of joining");
            doj[i]=br.readLine();
        }
    }
    void show_getData()
    {
        System.out.println("Name    \t\t Date of Birth \t  Date of Joining ");
        for(int i=0;i<10;i++)
        {
            System.out.println(name[i]+" \t\t "+dob[i]+" \t\t "+doj[i]);
        }
    }
}