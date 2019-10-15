import java.util.Scanner;

class doublycircll
{
    public static void main(String args[])
    {
        ll ll1=new ll();
        Scanner input=new Scanner(System.in);
        int choice=10;
        while(choice!=0)
        {
            System.out.println("1.INSERT");
            System.out.println("2.DELETE");
            System.out.println("3.PRINT");
            System.out.println("0.EXIT");
            choice=input.nextInt();
            switch(choice)
            {
                case 1:
                {
                    System.out.println("DATA TO BE INSERTED AND THE POSITION");
                    int data=input.nextInt();
                    int pos=input.nextInt();
                    ll1.insert(data,pos);
                    break;
                }
                case 2:
                {
                    System.out.println("Position to be deleted");
                    int pos=input.nextInt();
                    ll1.remove(pos);
                    break;
                }
                case 3:
                {
                    ll1.print();
                    break;
                }
                case 0:
                {
                    break;
                }
                default:
                {
                    System.out.println("TRY AGAIN");
                }
            }
        }
        input.close();
    }
}

class node
{
    node next;
    node prev;
    int data;
    
    node(int d)
    {
        next=null;
        prev=null;
        data=d;
    }
};

class ll
{
    node head,tail;
    int length=0;
    
    ll()
    {
        head=null;
    }

    void insert(int d,int pos)
    {
        if(head==null)
        {
            node obj=new node(d);
            obj.next=null;
            obj.prev=null;
            head=obj;
            tail=obj;
            length++;
            return;
        }
        if(pos==0)
        {
            node obj=new node(d);
            obj.next=head;
            obj.prev=tail;
            head.prev=obj;
            head=obj;
            tail.next=obj;
            length++;
            return;
        }
        else
        {
            if(pos>=length)
            {
                node obj=new node(d);
                obj.next=head;
                obj.prev=tail;
                tail.next=obj;
                head.prev=obj;
                tail=obj;
                length++;
                return;
            }
            else
            {
                node temp=head;
                for(int i=1;i<pos;i++)
                {
                    temp=temp.next;
                }
                node obj=new node(d);
                obj.next=temp.next;
                obj.prev=temp;
                temp.next=obj;
                obj.next.prev=obj;
                length++;
                return;
            }
        }
    }

    void remove(int pos)
    {
        if(head==null)
        {
            System.out.println("LINKED LIST EMPTY");
            return;
        }
        if(pos>=length)
        {
            System.out.println("NO SUCH POSITION");
            return;
        }
        if(length==1)
        {
            head=null;
            tail=null;
            length=0;
            return;
        }
        if(pos==0)
        {
            node temp=head.next;
            temp.prev=tail;
            tail.next=temp;
            head=temp;
            length--;
            return;
        }
        if(pos==length-1)
        {
            node temp=tail.prev;
            temp.next=head;
            head.prev=temp;
            tail=temp;
            length--;
            return;
        }
        node temp=head;
        for(int i=1;i<=pos;i++)
        {
            temp=temp.next;
        }
        node previous=temp.prev;
        node nextnode=temp.next;
        previous.next=nextnode;
        nextnode.prev=previous;
        length--;
    }

    void print()
    {
        System.out.println("LINKED LIST IS:");
        node temp=head;
        if(temp==null)
        {System.out.println("EMPTY");return;}
        while(temp!=tail)
        {
            System.out.print(temp.data+" ");
            temp=temp.next;
        }
        System.out.print(temp.data);
        System.out.println("");
    }
}

