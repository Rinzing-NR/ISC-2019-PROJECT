import java.util.*;

class q15_consecsum
{
    public static void main(String args[])//main begins
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter your number");
        int n=sc.nextInt();
        for(int i=1;i<n;i++)
        {
            int sum=0;
            for(int j=i;j<n;j++)//code to check the possible number combinations
            {
                sum=sum+j;
                if(sum==n)//condition to check if the sum is equal to the unput or not
                {
                    for(int k=i;k<=j;k++)//code to print the consecutive numbers
                    {
                        System.out.print(k+" ");
                    }
                    System.out.println(" ");
                }
            }
        }
        System.out.println("");
        }//end of main
}