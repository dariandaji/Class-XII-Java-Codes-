import java.io.*;
import java.util.*;
class Node1
{
    int data;
    Node1 link;
    Node1()
    {
        data=0;
        link=null;
    }
    Node1 ptr,start;
    Node1 temp;
    
    void create()throws IOException
    {
        int n;
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter the first data");
        this.data=Integer.parseInt(br.readLine());
        ptr=this;
        start=ptr;
        char ins='y';
        do
        {
            System.out.println("Want to insert another Node?");
            ins=(char)br.read();
            br.read();
            if(ins=='y')
            {
                temp=new Node1();
                System.out.println("Enter next data");
                temp.data=Integer.parseInt(br.readLine());
                temp.link=null;
                ptr.link=temp;
                temp=null;
                ptr=ptr.link;
            }
        }while(ins=='y');
    }
    
    void search(int x)
    {
        ptr=this;
        int f=0,pos=1;
        while(ptr!=null)
        {
            if(ptr.data==x)
            {
                System.out.println("Data Item "+x+"found at node number "+pos);
                f=f+1;
            }
            ptr=ptr.link;
            pos=pos+1;
        }
        if(f!=0)
            System.out.println("Data Item "+x+" found "+f+" time(s) in the Linked list");
        else
            System.out.println("Data item not present in the list");
    }
    
    void merge(Node1 temp)
    {
        ptr=this;
        while(ptr.link!=null)
            ptr=ptr.link;
        ptr.link=temp.start;
        ptr=null;
        temp=null;
    }
    
    void split(Node1 first2,int x)
    {
        ptr=this;
        start=this;
        int c=0;
        int c1=x;
        while(ptr!=null)
        {
            ptr=ptr.link;
            c=c+1;
        }
        ptr=start;
        if(c1<1 || c1>c)
            System.out.println("Invalid node number. Can't split");
        else
        {
            for(int a=1;a<c1;++a)
            {
                temp=ptr;
                ptr=ptr.link;
            }
            first2.start=ptr;
            temp.link=null;
        }
    }
    
    void reverse()
    {
        Node1 start1=null;
        start=this;
        while(start!=null)
        {
            ptr=start;
            start=start.link;
            ptr.link=start1;
            start1=ptr;
        }
        //start=this;
        //ptr=this;
    }                              
    
    void display()
    {
        Node1 ptr=start;
        while(ptr!=null)
        {
            System.out.println(ptr.data);
            ptr=ptr.link;
        }
    }
    
    public static void main(String args[])throws IOException
    {
        int k,p,ch,s;
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        Node1 first=new Node1();
        Node1 first1=new Node1();
        Node1 first2=new Node1();
        Node1 first3=new Node1();
        
        do
        {
            System.out.println(" Main menu ");
            System.out.println("1. Create a linked list structure");
            System.out.println("2. Searching for a node in a Linked List");
            System.out.println("3. Merging two linked lists");
            System.out.println("4. Splitting a linked list");
            System.out.println("5. Reversing a linked list");
            System.out.println("6. Display");
            System.out.println("7. Exit");
            System.out.println("Enter your choice");
            ch=Integer.parseInt(br.readLine());
            br.readLine();
            
            switch(ch)
            {
                case 1:
                first.create();
                break;
                
                case 2:
                System.out.println("Enter data to be searched");
                k=Integer.parseInt(br.readLine());
                first.search(k);
                break;
                
                case 3:
                System.out.println("Create another list to be merged: ");
                first1.create();
                first.merge(first1);
                first.display();
                break;
                
                case 4:
                System.out.println("Enter node number to split from :");
                s=Integer.parseInt(br.readLine());
                System.out.println("The  splitted linked lists are  1:");
                first.split(first2,s);
                first.display();
                System.out.println("The  splitted linked lists are  2:");
                first2.display();
                break;
                
                case 5:
                first.reverse();
                first.display();
                break;
                
                case 6:
                System.out.println("Data in the Linked List are : ");
                first.display();
                break;
                
                case 7:
                System.out.println("You chose to exit ");
                break;
                default:System.out.println(" Invalid choice ");
            }
        }while(ch!=7);
    }
}