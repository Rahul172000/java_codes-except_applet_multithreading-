import java.util.Scanner;
import java.util.Stack;

class stack
{
    public static void main(String args[])
    {
        Scanner input=new Scanner(System.in);
        Stack<Integer> stack=new Stack<Integer>();
        int choice=0;
        while(choice!=-1)
        {
            System.out.println("\n1.Push\n2.POP\n3.SIZE\n4.TOP\n-1:EXIT");
            choice=input.nextInt();
            if(choice==1)
            {
                System.out.print("NUMBER:");
                int num=input.nextInt();
                stack.push(num);
            }
            else if(choice==2)
            {
                if(stack.size()==0)
                {System.out.println("STACK EMPTY SO NOTHING DELETED");}
                else
                {stack.pop();}
            }
            else if(choice==3)
            {
                System.out.println("SIZE IS:"+stack.size());
            }
            else if(choice==4)
            {
                System.out.println("ON TOP:"+stack.peek());
            }
            else if(choice==-1)
            {break;}
            else
            {System.out.println("INVALID OPTION");}
        }
        input.close();
    }
}