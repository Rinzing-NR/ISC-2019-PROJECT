import java.util.*;

class Perfect
{//class begins
    int n,count;
    public static void main(String args[])//main begins
    {
        Scanner sc=new Scanner(System.in);
        Perfect ob=new Perfect();
        System.out.println("Enter your number");
        int a=sc.nextInt();
        Perfect obj=new Perfect(a);
        obj.perfect_sq();
        obj.sum_of();
        System.out.println("");
    }//end of main
    Perfect()//default constructor
    {
        n=0;
        count=1;
    }
    Perfect(int aa)//parameterized constructor
    {
        n=aa;
        count=1;
    }
    void perfect_sq()
    {
        for(int i=n+1;count<=5;i++)//code to find the next five perfect squares
        {
            int j;
            double r=Math.sqrt(i);
            String str=Double.toString(r);
            for(j=0;j<str.length();j++)
            {
                char ch=str.charAt(j);
                if(ch=='.')
                {
                    break;
                }
            }
            String txt=str.substring(j+1);
            if(txt.equals("0"))
            {
                System.out.print(i+" ");
                count++;
            }
        }
        System.out.println("");
    }
    void sum_of()
    {
        for(int i=1;i<n;i++)//code to find and print the required consecutive combination
        {
            int sum=0;
            for(int j=i;j<n;j++)
            {
                sum=sum+j;
                if(sum==n)
                {
                    for(int k=i;k<=j;k++)
                    {
                        System.out.print(k+" ");
                    }
                    System.out.println(" ");
                }
            }
        }
        System.out.println("");
    }
}//end of class