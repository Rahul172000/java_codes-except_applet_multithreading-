import java.util.Scanner; 

class simple_interest
{
    public static void main(String args[])
    {
        Scanner input=new Scanner(System.in);
        System.out.print("Principal amount:");
        int a=input.nextInt();
        System.out.println("\nRate of inerest:");
        float b=input.nextFloat();
        System.out.print("\nTime in years:");
        float c=input.nextFloat();
        System.out.println("Simple interest:"+a*b*c/100);
        input.close();
    }
}