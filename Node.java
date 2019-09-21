import java.io.*;
import java.util.*;
class Node
{
    int data;
    Node link;
    Node()
    {
        data=0;
        link=null;
    }
    Node ptr,start;
    Node temp;
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
                temp=new Node();
                System.out.println("Enter next data");
                temp.data=Integer.parseInt(br.readLine());
                temp.link=null;
                ptr.link=temp;
                temp=null;
                ptr=ptr.link;
            }
        }while(ins=='y');
    }
    
    void insertbeg(int x)
    {
        temp = new Node();
        temp.data=x;
        temp.link=start;
        start=temp;
        temp=null;
    }
    
    void insertend(int x)
    {
        Node temp=new Node();
        temp.data=x;
        temp.link=null;
        Node ptr=start;
        while(ptr.link!=null)
        {
            ptr=ptr.link;
        }
        ptr.link=temp;
        temp=null;
        ptr=null;
    }
    
    void insertmid(int x, int y)
    {
        Node temp=new Node();
        temp.data=x;
        temp.link=null;
        ptr=start;
        int c=1;
        while(c<y)
        {
            ptr=ptr.link;
            c++;
        }
        temp.link=ptr.link;
        ptr.link=temp;
        temp=null;
        ptr=null;
    }
    
    void deletenode(int n)
    {
        Node ptr=start;
        Node ptr1=ptr;
        int c=1;
        while(c<n)
        {
            ptr1=ptr;
            ptr=ptr.link;
            c++;
        }
        ptr1.link=ptr.link;
        ptr.link=null;
        ptr=null;
        ptr1=null;
    }
    
    void display()
    {
        Node ptr=start;
        while(ptr!=null)
        {
            System.out.println(ptr.data);
            ptr=ptr.link;
        }
    }
    
    public static void main(String args[])throws IOException
    {
        int k,p,ch;
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        Node first=new Node();
        Node abc=new Node();
        do
        {
            System.out.println(" Main menu ");
            System.out.println("1. Create a linked list structure");
            System.out.println("2. Insert a list in the beginning");
            System.out.println("3. Insert a list in the end");
            System.out.println("4. Insert a list in the middle");
            System.out.println("5. Delete a list from the linked list");
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
                System.out.println("Enter data for the new node");
                k=Integer.parseInt(br.readLine());
                first.insertbeg(k);
                break;
                
                case 3:
                System.out.println("Enter data for the new node");
                k=Integer.parseInt(br.readLine());
                first.insertend(k);
                break;
                
                case 4:
                System.out.println("Enter data for the new node");
                k=Integer.parseInt(br.readLine());
                System.out.println("Enter the node number after which node is to be inserted");
                p=Integer.parseInt(br.readLine());
                first.insertmid(k,p);
                break;
                
                case 5:
                System.out.println("Enter the node number which node is to be deleted");
                p=Integer.parseInt(br.readLine());
                first.deletenode(p);
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