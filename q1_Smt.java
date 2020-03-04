import java.util.*;//util package called

class q1_Smt
{
    public static void main(String args[])//main begins
    {
        Scanner sc=new Scanner(System.in);
        int i=2,n,sum=0,sum1=0;
        System.out.println("Enter number");
        n=sc.nextInt();
        int xerox=n,rem;
        while(xerox>0)//code to find sum of digits a number
        {
            rem=xerox%10;
            sum=sum+rem;
            xerox=xerox/10;
        }
        while(n>1)//code to find the sum of prime factors
        {
            if(n%i==0)
            {
                int s=0;
                if(i>9)
                {
                    int copy=i,r;
                    while(copy>0)
                    {
                        r=copy%10;
                        s=s+r;
                        copy=copy/10;
                    }
                    sum1=sum1+s;
                }
                else
                {
                    sum1=sum1+i;
                }
                n=n/i;
            }
            else
            {
                i++;
            }
        }
        if(sum==sum1)//code to check if the given number is prime or not
        {
            System.out.println("It is a smith number");
        }
        else
        {
            System.out.println("It is a not smith number");
        }
        System.out.println("");
    }//main ends
}