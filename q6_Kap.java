import java.util.*;

class q6_Kap
{
    public static void main(String args[])//main begins
    {
        Scanner sc=new Scanner(System.in);
        int p,q;
        System.out.println("Enter starting number");
        p=sc.nextInt();
        System.out.println("Enter ending number");
        q=sc.nextInt();
        int flag=0;
        for(int i=p;i<=q;i++)//code to check the numbers between user inputs
        {
            int copy=i,xerox=i*i,count=0;
            while(copy>0)
            {
                count++;
                copy=copy/10;
            }
            int rem=xerox%(int)Math.pow(10,count);
            int quo=xerox/(int)Math.pow(10,count);
            if((rem+quo)==i)//condition to check whether the number is kaprekar or not
            {
                System.out.print(i+" ");
                flag++;
            }
        }
        System.out.println("");
        System.out.println("Frequency of Kaprekar Numbers is:"+flag);//code to print the frequency of kaprekar 
        System.out.println("");
    }//main ends
}
