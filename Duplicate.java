public class Duplicate extends Sentence
{
    int len;
    void RemoveDuplicate()
    {
        str=str+' ';
        len=str.length();
        char b,c;
        char st[]=new char[len];
        int i,p;
        String mdstr="";
        p=len;
        for(i=0;i<p;i++)
        {
            c=str.charAt(i);
            st[i]=c;
        }
        for(i=0;i<p-1;i++)
        {
            c=st[i];
            b=st[i+1];
            if(b==c)
            continue;
            else
            mdstr=mdstr+c;
        }
        System.out.println("Original String : "+str);
        System.out.println("Modified String : "+mdstr);
    }
}