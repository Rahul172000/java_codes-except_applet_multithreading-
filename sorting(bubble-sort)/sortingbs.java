import java.util.Scanner;

class sortingbs
{
    public static void main(String args[])
    {
        Scanner input=new Scanner(System.in);
        System.out.print("Array size:");
        int size=input.nextInt();
        int arr[]=new int[size];
        System.out.println("Array's elements");
        for(int i=0;i<size;i++)
        {
            arr[i]=input.nextInt();
        }
        int temp;
        //bubble sort
        for(int i=0;i<size-1;i++)
        {
            for(int j=0;j<size-1;j++)
            {
                if(arr[j]>arr[j+1])
                {
                    temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                }
            }
        }
        //ends here
        System.out.println("");
        for(int i=0;i<size;i++)
        {
            System.out.print(arr[i]+" ");
        }
    }
}