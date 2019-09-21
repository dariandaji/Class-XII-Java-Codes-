package Numbers;
import java.io.*;
public class ArmstrongAndLike
{
    static long number;
    ArmstrongAndLike(long l)
    {
        number=1;
    }
    public static void main(String args[])throws IOException
    {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter a six digit number");
        number=Long.parseLong(br.readLine());
        ArmstrongAndLike obj=new ArmstrongAndLike(number);
        boolean a=obj.IsArmstrong();
        if(a==true)
        {
            System.out
        }
    }