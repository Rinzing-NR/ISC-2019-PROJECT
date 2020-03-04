import java.util.*;

class q22_pripal
{
    public static void main(String args[])//main begins
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter your starting number");
        int m=sc.nextInt();
        System.out.println("Enter your limit");
        int n=sc.nextInt();
        int freq=0;
        if(m<3000&&n<3000)//condition to check if the user inputs are valid or not
        {
            System.out.println("The Prime Palindrome Integers are:");
            for(int a=m;a<=n;a++)//loop to check the numbers between user inputs
            {
                int copy=a,count=0,flag=0;
                for(int i=2;i<=copy;i++)//code to check if the number is prime or not
                {
                    if(copy%i==0)
                    {
                        count++;
                    }
                }
                if(count==1)
                {
                    int rev=0,xerox=copy;
                    while(xerox>0)//code to find the reverse of a number
                    {
                        int r=xerox%10;
                        rev=rev*10+r;
                        xerox=xerox/10;
                    }
                    if(rev==copy)//condition to check if the number is palindrome or not
                    {
                        System.out.print(a+" ");
                        freq++;
                    }
                }
            }
            System.out.println("");
            System.out.println("The frequency of Prime Palindrome Integers:"+freq);
            System.out.println("");
        }
        else
        {
            System.out.println("Out of range");
        }
        System.out.println("");
    }//end of main
}