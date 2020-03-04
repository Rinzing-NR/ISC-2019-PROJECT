import java.util.*;

class q21_boundsort
{
    public static void main(String args[])//main begins
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter row size");
        int m=sc.nextInt();
        System.out.println("Enter column size");
        int n=sc.nextInt();
        if(m>=2&&m<20&&n>=2&&n<20)//condition to check if the row and column size are valid or not
        {
            int mat[][]=new int[m][n];
            System.out.println("Enter elements in matrix");
            int i,j,x=0;
            for(i=0;i<m;i++)//code to take the input of matrix elements
            {
                for(j=0;j<n;j++)
                {
                    mat[i][j]=sc.nextInt();
                }
            }
            int a=n+n+(m-2)+(m-2);
            int arr[]=new int[a];
            for(i=0;i<n;i++)
            {
                arr[x]=mat[0][i];
                x++;
            }
            for(i=1;i<m;i++)
            {
                arr[x]=mat[i][n-1];
                x++;
            }
            for(i=n-2;i>=0;i--)
            {
                arr[x]=mat[m-1][i];
                x++;
            }
            for(i=m-2;i>=1;i--)
            {
                arr[x]=mat[i][0];
                x++;
            }//code to extract the boundary elements
            for(i=0;i<a-1;i++)//code to sort the boundary elements
            {
                for(j=i+1;j<a;j++)
                {
                    if(arr[i]>arr[j])
                    {
                        int temp=arr[i];
                        arr[i]=arr[j];
                        arr[j]=temp;
                    }
                }
            }
            int sum=0;
            for(i=0;i<a;i++)//code to find the sum of boundary elements
            {
                sum=sum+arr[i];
            }
            int matA[][]=new int[m][n];
            x=0;
            for(i=0;i<n;i++)
            {
                matA[0][i]=arr[x];
                x++;
            }
            for(i=1;i<m;i++)
            {
                matA[i][n-1]=arr[x];
                x++;
            }
            for(i=n-2;i>=0;i--)
            {
                matA[m-1][i]=arr[x];
                x++;
            }
            for(i=m-2;i>=1;i--)
            {
                matA[i][0]=arr[x];
                x++;
            }//code to assign the sorted boundary elements
            for(i=1;i<m-1;i++)//code to assign the inner elements
            {
                for(j=1;j<n-1;j++)
                {
                    matA[i][j]=mat[i][j];
                }
            }
            System.out.println("Original Matrix:");
            for(i=0;i<m;i++)//code to print the original matrix
            {
                for(j=0;j<n;j++)
                {
                    System.out.print(mat[i][j]+"\t");
                }
                System.out.println("");
            }
            System.out.println("Rearranged Matrix:");
            for(i=0;i<m;i++)//code to print the rearranged matrix
            {
                for(j=0;j<n;j++)
                {
                    System.out.print(matA[i][j]+"\t");
                }
                System.out.println("");
            }
            System.out.println("Boundary Elements:");
            for(i=0;i<m;i++)//code to print the boundary elements of the matrix
            {
                for(j=0;j<n;j++)
                {
                    if(i==0||i==m-1||j==0||j==n-1)
                    {
                        System.out.print(matA[i][j]+"\t");
                    }
                    else
                    {
                        System.out.print("\t");
                    }
                }
                System.out.println("");
            }
            System.out.println("Sum of outer row and outer column="+sum);
        }
        else
        {
            System.out.println("Invalid input");
        }
        System.out.println("");
    }
}