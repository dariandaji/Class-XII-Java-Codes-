import java.io.*;
class Marks extends Student
{
    float p,c,m,cts,e;
    float tot,per;
    char gd;
    void readdata()throws IOException
    {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter marks in Physics");
        p=Integer.parseInt(br.readLine());
        System.out.println("Enter marks in Chemistry");
        c=Integer.parseInt(br.readLine());
        System.out.println("Enter marks in Mathematics");
        m=Integer.parseInt(br.readLine());
        System.out.println("Enter marks in Computer Science");
        cts=Integer.parseInt(br.readLine());
        System.out.println("Enter marks in English");
        e=Integer.parseInt(br.readLine());
    }
    void compute()
    {
        tot=p+c+m+e+cts;
        per=(tot*100)/500;
        if(per>=90)
            gd='A';
        if(per>=60 && per<90)
            gd='B';
        if(per>=40 && per<60)
            gd='C';
        if(per<40)
            gd='D';
    }
    void showData()
    {
        printData();
        System.out.println("Marks in Physics : "+p);
        System.out.println("Marks in Chemistry : "+c);
        System.out.println("Marks in Mathematics : "+m);
        System.out.println("Marks in English : "+e);
        System.out.println("Marks in Computer Science : "+cts);
        System.out.println("Percentage Marks : "+per);
        System.out.println("Grade obtained : "+gd);
    }
}