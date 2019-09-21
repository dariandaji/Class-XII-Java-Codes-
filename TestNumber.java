import java.io.*;
public class TestNumber
{
    public static void main(String args[])throws IOException
    {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter a number");
        int n=Integer.parseInt(br.readLine());
        String str="";
        if(n<1000)
        {
            String s=Integer.toString(n);
            int l=s.length();
            int j=l-1;
            int i=l-1;
            while(i>=0)
            {
                char ch=s.charAt(i);
                /**if(ch=='1' && s.charAt(i-1)=='1')
                     str=str+"ELEVEN";
                if(ch=='2' && s.charAt(i-1)=='1')
                     str=str+"TWELVE";
                     if(ch=='3' && s.charAt(i-1)=='1')
                     str=str+"THIRTEEN";
                     if(ch=='5' && s.charAt(i-1)=='1')
                     str=str+"FIFTEEN";**/
                     if(i==(l-3))
                        str=" HUNDRED "+str;
                if(i==(l-1)|| i!=1)
                {
                    if(ch=='1')
                        str="ONE"+str;
                    if(ch=='2')
                        str="TWO"+str;
                    if(ch=='3')
                        str="THREE"+str;
                    if(ch=='4')
                        str="FOUR"+str;  
                    if(ch=='5')
                        str="FIVE"+str;
                    if(ch=='6')
                        str="SIX"+str;
                    if(ch=='7')
                        str="SEVEN"+str;
                    if(ch=='8')
                        str="EIGHT"+str;
                    if(ch=='9')
                        str="NINE"+str;
                    }
                     if(i==(l-2))
                    {
                       if(ch=='2')
                        str="TWENTY"+str;  
                    if(ch=='3')
                        str="THIRTY"+str;
                    if(ch=='4')
                        str="FORTY"+str;  
                    if(ch=='5')
                        str="FIFTY"+str;
                    if(ch=='6')
                        str="SIXTY"+str;
                    if(ch=='7')
                        str="SEVENTY"+str;
                    if(ch=='8')
                        str="EIGHTY"+str;
                    if(ch=='9')
                        str="NINETY"+str;
                    }
                    
                i--;
            }
            System.out.println(str);
        }
       else
        System.out.println("Number above 10000");
    }
}