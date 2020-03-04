import java.util.*;

class q24_matsor
{
    public static void main(String args[])//main begins
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter number of rows");
        int m=sc.nextInt();
        System.out.println("Enter number of columns");
        int n=sc.nextInt();
        if(m>=2&&m<20&&n>=2&&n<20)//condition to check if the size of row and column is valid or not
        {
            int mat[][]=new int[m][n];
            System.out.println("Enter elements");
            int i,j;
            for(i=0;i<m;i++)//code to take the input of matrix elements
            {
                for(j=0;j<n;j++)
                {
                    mat[i][j]=sc.nextInt();
                }
            }
            int l=mat[0][0],s=mat[0][0],lr=0,lc=0,sr=0,smc=0;
            for(i=0;i<m;i++)//code to find the largest and smallest elements in the matrix along with their positions
            {
                for(j=0;j<n;j++)
                {
                    if(mat[i][j]>l)
                    {
                        l=mat[i][j];
                        lr=i;
                        lc=j;
                    }
                    if(mat[i][j]<s)
                    {
                        s=mat[i][j];
                        sr=i;
                        smc=j;
                    }
                }
            }
            int arr[]=new int[m*n];
            int x=0;
            for(i=0;i<m;i++)//code to convert the matrix into a single dimensional array
            {
                for(j=0;j<n;j++)
                {
                    arr[x]=mat[i][j];
                    x++;
                }
            }
            for(i=0;i<(m*n)-1;i++)//code to sort the array
            {
                for(j=i+1;j<m*n;j++)
                {
                    if(arr[i]>arr[j])
                    {
                        int temp=arr[i];
                        arr[i]=arr[j];
                        arr[j]=temp;
                    }
                }
            }
            int matA[][]=new int[m][n];
            x=0;
            for(i=0;i<m;i++)//code to assign the array elements to a matrix 
            {
                for(j=0;j<n;j++)
                {
                    matA[i][j]=arr[x];
                    x++;
                }
            }
            System.out.println("Original Matrix");
            for(i=0;i<m;i++)//code to print the original matrix
            {
                for(j=0;j<n;j++)
                {
                    System.out.print(mat[i][j]+"\t");
                }
                System.out.println("\t");
            }
            System.out.println("Largest Number:"+l);
            System.out.println("Row:"+lr);
            System.out.println("Column:"+lc);
            System.out.println("Smallest Number:"+s);
            System.out.println("Row:"+sr);
            System.out.println("Column:"+smc);
            System.out.println("Rearranged Matrix");
            for(i=0;i<m;i++)//code to print the rearranged matrix
            {
                for(j=0;j<n;j++)
                {
                    System.out.print(matA[i][j]+"\t");
                }
                System.out.println("\t");
            }
        }
        else
        {
            System.out.println("Invalid input");
        }
        System.out.println("");
    }//end of main
}