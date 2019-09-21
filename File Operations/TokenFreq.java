package FileOperations;

import java.util.*;
public class TokenFreq
{
    public static void main(String str,String wd)
    {
        StringTokenizer st=new StringTokenizer(str);
        int c=0;
        String str1;
        while(st.hasMoreTokens())
        {
            str1=st.nextToken();
            if(wd.equals(str1))
                c=c+1;
        }
        System.out.println("Frequency of "+wd+"	 is : "+c);
    }
}