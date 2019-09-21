import java.io.*;
class ISCScores
{
    protected int number[][]=new int[6][2];
    ISCScores()throws IOException
    {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter subject codes and marks");
        for(int i=0;i<6;i++)
        {
            number[i][0]=Integer.parseInt(br.readLine());
            number[i][1]=Integer.parseInt(br.readLine());
        }
    }
    int point(int sub_score)throws IOException
    {
        int pt=0;
        for(int i=1;i<=6;i++)
        {
            if(sub_score>=(100-i*10))
            {
                pt=i;
                break;
            }
        }
        return pt;
    }
}