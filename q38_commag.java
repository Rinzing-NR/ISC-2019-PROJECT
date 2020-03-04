import java.util.*;

class q38_commag
{
    public static void main(String args[])//main begins
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Starting number");
        int m=sc.nextInt();
        System.out.println("Enter Limit");
        int n=sc.nextInt();
        int freq=0;
        if(m<n)
        {
            System.out.print("The composite magic numbers are ");
            for(int i=m;i<=n;i++)//loop to check composite magic numbers between user inputs
            {
                int copy=i,count=0,mag=0;
                for(int j=2;j<copy;j++)//code to check if the number is composite or not
                {
                    if(copy%j==0)
                    {
                        count++;
                    }
                }
                if(count>1)//condition to check if the number is composite or not
                {
                    while(copy>0)//code to check if the number is magic or not
                    {
                        int r=copy%10;
                        mag=mag+r;
                        copy=copy/10;
                        if(mag>9&&copy==0)
                        {
                            copy=mag;
                            mag=0;
                        }
                    }
                }   
                if(mag==1)//condition to check if the number is magic or not
                {
                    System.out.print(i+" ");
                    freq++;
                }
            }
            System.out.println("");
            System.out.println("Frequency of composite magic numbers:"+freq);
        }
        else
        {
            System.out.println("Invalid Input");
        }
        System.out.println("");
    }//end of main
}