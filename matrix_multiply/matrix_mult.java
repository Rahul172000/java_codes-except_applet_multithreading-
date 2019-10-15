import java.util.Scanner;

class matrix_mult
{
    public static void main(String args[])
    {
        Scanner input = new Scanner(System.in);
        System.out.print("ENTER THE ROWS AND COLUMNS OF BOTH:");
        int r1=input.nextInt();
        int c1=input.nextInt();
        int r2=input.nextInt();
        int c2=input.nextInt();
        if(c1!=r2)
        {
            System.out.println("NOT POSSIBLE");
            System.exit(0);
        }
        int mat1[][]=new int[r1][c1];
        int mat2[][]=new int[r2][c2];
        System.out.println("ENTER THE FIRST MATRIX");
        for(int i=0;i<r1;i++)
        {
            for(int j=0;j<c1;j++)
            {mat1[i][j]=input.nextInt();}
        }
        System.out.println("ENTER THE SECOND MATRIX");
        for(int i=0;i<r2;i++)
        {
            for(int j=0;j<c2;j++)
            {mat2[i][j]=input.nextInt();}
        }
        int ansmat[][]=new int[r1][c2];
        for(int i=0;i<r1;i++)
        {
            for(int j=0;j<c2;j++)
            {
                int temp=0;
                for(int k=0;k<c1;k++)
                {
                    temp+=mat1[i][k]*mat2[k][j];
                }
                ansmat[i][j]=temp;
            }
        }
        System.out.println("The answer matrix is:");
        for(int i=0;i<r1;i++)
        {
            for(int j=0;j<c2;j++)
            {System.out.print(ansmat[i][j]+" ");}
            System.out.println("");
        }
        input.close();
    }
}