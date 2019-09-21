package Numbers;
import java.util.*;
public class TriangularNumber //Number where the product of two consecutive numbers gives a number   
{
    int num;int flag=0,sum=0;
    void getNum()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number");
        num=sc.nextInt();
    }
    int checkInt(int num)
    {
        for(int i=1;i<=num;i++)
        {
            sum=sum+i;
            if(sum==num){
            flag=1;
            break;}
        }
        return flag;
    }
    void display()
    {
        if(flag==1)
            System.out.println(num+" is a Triangular Number ");
        else
            System.out.println(num+" is not a Triangular Number");
    }
}
        