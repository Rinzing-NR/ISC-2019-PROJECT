import java.util.*;

class q36_symmat
{
    public static void main(String args[])//main begins
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Matrix Size");
        int m=sc.nextInt();
        if(m>=2&&m<10)//condition to check if the matrix size is valid or not
        {
            int mat[][]=new int[m][m];
            int i,j;
            System.out.println("Enter your Elements");
            for(i=0;i<m;i++)//code to take input of matrix elements
            {
                for(j=0;j<m;j++)
                {
                    mat[i][j]=sc.nextInt();
                }
            }
            int flag=0;
            for(i=0;i<m;i++)//code to check if the matrix is symmetric or not
            {
                for(j=0;j<m;j++)
                {
                    if(mat[i][j]!=mat[j][i])
                    {
                        flag=1;
                        break;
                    }
                }
            }
            System.out.println("Original Matrix:");
            for(i=0;i<m;i++)//code to print the original matrix
            {
                for(j=0;j<m;j++)
                {
                    System.out.print(mat[i][j]+"\t");
                }
                System.out.println("");
            }
            if(flag==1)//condition to check if the matrix is symmetric or not
            {
                System.out.println("The given matrix is not symmetric");
            }
            else
            {
                System.out.println("The given matrix is symmetric");
            }
            int sld=0;
            int srd=0;
            for(i=0,j=0;j<m;j++,i++)//code to find the sum of left diagonal
            {
                sld=sld+mat[i][j];
            }
            for(i=0,j=m-1;j>=0;j--,i++)//code to find the sum of right diagonal
            {
                srd=srd+mat[i][j];
            }
            System.out.println("Sum of the left diagonal="+sld);
            System.out.println("Sum of the right diagonal="+srd);
        }
        else
        {
            System.out.println("Matrix Size is out of range");
        }
        System.out.println("");
    }//end of main
}