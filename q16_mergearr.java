import java.io.*;

class q16_mergearr
{
    public static void main(String args [])throws IOException//main begins
    {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        int m,n;
        System.out.println("Enter number of names in Array A,N=");
        n=Integer.valueOf(br.readLine());
        System.out.println("Enter number of names in Array B,M=");
        m=Integer.valueOf(br.readLine());
        String A[]=new String[n];
        String B[]=new String[m];
        System.out.println("First array:(A)");
        for(int i=0;i<n;i++)//code for input in first array
        {
            A[i]=br.readLine();
        }
        System.out.println("Second array:(B)");
        for(int i=0;i<m;i++)//code for input in second array
        {
            B[i]=br.readLine();
        }
        String C[]=new String[m+n];
        int x=0;
        for(int i=0;i<n;i++)
        {
            C[x]=A[i];
            x++;
        }
        for(int i=0;i<m;i++)
        {
            C[x]=B[i];
            x++;
        }//code to merge the two arrays
        for(int i=0;i<n-1;i++)//code to sort the array alphabetically
        {
            for(int j=i+1;j<n;j++)
            {
                if(A[i].compareTo(A[j])>0)
                {
                    String temp=A[i];
                    A[i]=A[j];
                    A[j]=temp;
                }
            }
        }
        for(int i=0;i<m-1;i++)//code to sort the array alphabetically
        {
            for(int j=i+1;j<m;j++)
            {
                if(B[i].compareTo(B[j])>0)
                {
                    String temp=B[i];
                    B[i]=B[j];
                    B[j]=temp;
                }
            }
        }
        for(int i=0;i<(m+n)-1;i++)//code to sort the array alphabetically
        {
            for(int j=i+1;j<m+n;j++)
            {
                if(C[i].compareTo(C[j])>0)
                {
                    String temp=C[i];
                    C[i]=C[j];
                    C[j]=temp;
                }
            }
        }
        System.out.println("Sorted Merged Array:(C)");
        for(int i=0;i<m+n;i++)//code to print the sorted array
        {
            System.out.println(C[i]);
        }
        System.out.println("Sorted Merged Array:(A)");
        for(int i=0;i<n;i++)//code to print the sorted array
        {
            System.out.println(A[i]);
        }
        System.out.println("Sorted Merged Array:(B)");
        for(int i=0;i<m;i++)//code to print the sorted array
        {
            System.out.println(B[i]);
        }
        System.out.println("");
    }//end of main
}    