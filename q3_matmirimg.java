import java.util.*;

class q3_matmirimg
{
    public static void main(String args[])//main begins
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter size of matrix");
        int m=sc.nextInt();
        if(m>=2&&m<20)//condition to check if the size is appropriate or not
        {
            int mat[][]=new int [m][m];
            System.out.println("Enter matrix elements");
            for(int i=0;i<m;i++)//code for input of matrix elements
            {
                for(int j=0;j<m;j++)
                {
                    mat[i][j]=sc.nextInt();
                }
            }
            System.out.println("Original Matrix");
            for(int i=0;i<m;i++)//code to display original matrix
            {
                for(int j=0;j<m;j++)
                {
                    System.out.print(mat[i][j]+" ");
                }
                System.out.println("");
            }
            System.out.println("Mirror Image Matrix");
            for(int i=0;i<m;i++)//code to display mirror image of the matrix
            {
                for(int j=m-1;j>=0;j--)
                {
                    System.out.print(mat[i][j]+" ");
                }
                System.out.println("");
            }
        }
        else
        {
            System.out.print("Size out of range");
        }
        System.out.println("");
    }//main ends
}