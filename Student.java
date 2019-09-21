import java.io.*;
class Student
{
    String name,dob;
    int roll;
    void inputdata()throws IOException
    {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter name");
        name=br.readLine();
        System.out.println("Enter DOB");
        dob=br.readLine();
        System.out.println("Enter roll number");
        roll=Integer.parseInt(br.readLine());
    }
    void printData()
    {
        System.out.println("Name : "+name);
        System.out.println("Date of birth : "+dob);
        System.out.println("Roll number : "+roll);
    }
}