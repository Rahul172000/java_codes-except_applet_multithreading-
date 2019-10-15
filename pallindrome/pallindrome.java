import java.util.Scanner;

class pallindrome
{
    public static void main(String args[])
    {
        Scanner input=new Scanner(System.in);
        System.out.print("String pls:");
        String str=input.nextLine();
        boolean ans=true;
        int i=0; int j=str.length()-1;
        while(i<j)
        {
            if(str.charAt(i) != str.charAt(j))
            {ans=false;break;}
            i++;j--;
        }
        if(ans)
        {System.out.println("Yes it is");}
        else
        {System.out.print("No its not");}
        input.close();
    }
}