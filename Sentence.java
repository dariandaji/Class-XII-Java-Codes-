import java.io.*;
public class Sentence
{
    protected String str;
    Sentence()
    {
        str="";
    }
    void Accept()throws IOException
    {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter name");
        str=br.readLine();
    }
    void Display()
    {
        System.out.println(str);
    }
}