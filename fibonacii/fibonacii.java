import java.util.Scanner;

class fibonacii
{
    public static void main(String args[])
    {
        Scanner input=new Scanner(System.in);
        System.out.print("Size:");
        int size=input.nextInt();
        System.out.println("");
        if(size==1)
        {System.out.print("1");}
        else if(size==2)
        {System.out.print("1 1");}
        else
        {
            long first=1; long second=1; long third=2; size-=2;
            System.out.print("1 1 ");
            while(size>0)
            {
                System.out.print(third+" ");
                first=second;
                second=third;
                third=first+second;
                size--;
            }
        }
        input.close();
    }
}