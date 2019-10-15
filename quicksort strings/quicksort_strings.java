import java.util.Scanner;

class quicksort_strings
{
    static int pivotindexfn(String arr[],int low,int high)
    {
        int i=low,pindex=low;
        while(i<high)
        {
            if(arr[i].compareTo(arr[high])<0)
            {
                String temp=arr[i];
                arr[i]=arr[pindex];
                arr[pindex]=temp;
                pindex++;
            }
            i++;
        }
        String temp=arr[pindex];
        arr[pindex]=arr[high];
        arr[high]=temp;
        return pindex;
    }

    static void sort(String arr[],int low,int high)
    {
        if(low>=high)
        {return;}
        int pivot=pivotindexfn(arr,low,high);
        sort(arr,low,pivot-1);
        sort(arr,pivot+1,high);
    }

    public static void main(String args[])
    {
        Scanner input=new Scanner(System.in);
        System.out.println("Number of names");
        int size=input.nextInt();
        String arr[]=new String[size];
        System.out.println("ENTER THE NAMES ONE BY ONE");
        String buffer=input.nextLine();//to ignore the buffer effect
        for(int i=0;i<size;i++)
        {  
            arr[i]=input.nextLine();
        }
        sort(arr,0,size-1);
        System.out.println("");
        System.out.println("SORTED IS:");
        for(int i=0;i<size;i++)
        {
            System.out.println(arr[i]);
        }
        input.close();
    }
}