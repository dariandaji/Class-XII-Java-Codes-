package FileOperations;
import java.io.*;
public class Name
{
    public static void main(String args[])throws IOException
    {
        byte myname[]={'K','E','D','A','R',' ','G','H','U','L','E'};
        FileOutputStream fout=null;
        fout=new FileOutputStream("MyName.txt");
        fout.write(myname);
        fout.close();
    }
}