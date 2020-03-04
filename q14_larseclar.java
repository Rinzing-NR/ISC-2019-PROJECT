import java.util.*;

class q14_larseclar
{
    public static void main(String args [])//main begins
    {
        Scanner sc=new Scanner(System.in);
        int  n;
        System.out.println("Enter your size");
        n=sc.nextInt();
        if(n>20)//condition to check if the entered size of matrix is valid or not
        {
            System.out.println("Invalid Input");
        }
        else
        {
            int arr[][]=new int[n][n];
            int arr2[][]=new int[n][n];
            System.out.println("Enter Elements");
            for(int i=0;i<n;i++)//code to take input of the elements
            {
                for(int j=0;j<n;j++)
                {
                    arr[i][j]=sc.nextInt();
                }
            }
            int lar=arr[0][0];
            int sec=arr[0][0];
            int r1=0,c1=0,r2=0,c2=0;
            for(int i=0;i<n;i++)//code to find the largest element
            {
                for(int j=0;j<n;j++)
                {
                    if(arr[i][j]>lar)
                    {
                        lar=arr[i][j];
                        r1=i+1;
                        c1=j+1;
                    }
                }
            }
            for(int i=0;i<n;i++)//code to find the second largest element
            {
                for(int j=0;j<n;j++)
                {
                    if(arr[i][j]>sec&&arr[i][j]<lar)
                    {
                        sec=arr[i][j];
                        r2=i+1;
                        c2=j+1;
                    }
                }
            }
            for(int i=0;i<n;i++)//code to display the original matrix
            {
                for(int j=0;j<n;j++)
                {
                    System.out.print(arr[i][j]+"\t");
                }
                System.out.println("");
            }
            System.out.println("The largest element "+lar+" is in row "+r1+" and column "+c1);
            System.out.println("The second largest element "+sec+" is in row "+r2+" and column "+c2);
            int a=0;
            for(int i=0;i<n;i++,a++)//code to sort the matrix elements row-wise
            {
                int x[]=new int[n];
                for(int j=0;j<n;j++)
                {
                    x[j]=arr[a][j];
                }
                for(int t=0;t<n-1;t++)
                {
                    for(int w=t+1;w<n;w++)
                    {
                        if(x[t]>x[w])
                        {
                            int temp=x[t];
                            x[t]=x[w];
                            x[w]=temp;
                        }
                    }
                }
                for(int j=0;j<n;j++)
                {
                    arr2[a][j]=x[j];
                }
            }
            for(int i=0;i<n;i++)//code to display the sorted original matrix
            {
                for(int j=0;j<n;j++)
                {
                    System.out.print(arr2[i][j]+"\t");
                }
                System.out.println("");
            }
        }
        System.out.println("");
    }//end of main
}