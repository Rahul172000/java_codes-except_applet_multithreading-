import java.util.Scanner;

class factorial
{
    public static void main(String args[])
    {
        Scanner input=new Scanner(System.in);
        System.out.print("Number pls:");
        int num=input.nextInt();
        long ans=1;
        for(int i=2;i<=num;i++)
        {ans*=i;}
        System.out.println("FACTORIAL:"+ans);
        input.close();
    }
}