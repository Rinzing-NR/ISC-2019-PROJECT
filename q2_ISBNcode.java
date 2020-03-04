import java.util.*;

class q2_ISBNcode
{
    public static void main(String args[])//main begins
    {
        Scanner sc=new Scanner(System.in);
        int sum=0;
        System.out.println("Enter your ISBN code");
        String str=sc.next();
        int n=Integer.valueOf(str);
        if(str.length()==10)//condition to check whether the code entered has ten digits or not 
        {
            for(int i=1;n>0;i++)//code to find the required sum
            {
                 int r=n%10;
                 sum=sum+(i*r);
                 n=n/10;
            }
            System.out.println("Sum="+sum);
            if(sum%11==0)//code to check if the entered code is a valid ISBN code or not
            {
                 System.out.println("Leaves no remainder-Valid ISBN");
            }
            else
            {
                 System.out.println("Leaves remainder-Invalid ISBN");
            }
        }
        else
        {
            System.out.println("Sum=Invalid input");
        }
        System.out.println("");
    }//main ends
}