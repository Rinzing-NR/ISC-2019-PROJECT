import java.util.*;

class Happy
{//class begins
    int n,sum;
    public static void main(String args[])//main begins
    {
        Happy obj=new Happy();
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number you want to check");
        int a=sc.nextInt();
        obj.getnum(a);
        obj.ishappy();
        System.out.println("");
    }//end of main
    Happy()//default constructor
    {
        n=0;
        sum=0;
    }
    void getnum(int nn)
    {
        n=nn;
    }
    int sum_sq_digits(int x)//recursive function to find and return the sum of square of digits
    {
        if(x>0)
        {
            int r=x%10;
            sum=sum+(r*r);
            x=x/10;
            if(sum>9&&x==0)
            {
                x=sum;
                sum=0;
            }
            int z=sum_sq_digits(x);
            return z;
        }
        return sum;
    }
    void ishappy()
    {
        int hap=sum_sq_digits(n);
        if(hap==1)//condition to check if the number is happy or not
        {
            System.out.println("The given number is a Happy Number");
        }
        else
        {
            System.out.println("The given number is not a Happy Number");
        }
    }
}//end of class