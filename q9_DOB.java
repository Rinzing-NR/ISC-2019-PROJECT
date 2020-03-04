import java.util.*;

class q9_DOB
{
    public static void main(String args[])//main begins
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter your date of birth in dd mm yyyy format");
        int d=sc.nextInt();
        int m=sc.nextInt();
        int y=sc.nextInt();
        int sum=0,flag=0;
        if(m==2)//special condition for February
        {
            if(y%4==0)//special condition for leap year
            {
                if(d>0&&d<=29)
                {
                    flag=1;
                }
            }
            else
            {
                if(d>0&&d<=28)
                {
                    flag=1;
                }
            }
        }
        if(m==1||m==3||m==5||m==7||m==8||m==10||m==12)//condition for months with 31 days
        {
            if(d>=0&&d<=31)
            {
                flag=1;
            }
        }
        if(m==4||m==6||m==9||m==11)//condition for months with 30 days
        {
            if(d>=0&&d<=30)
            {
                flag=1;
            }
        }
        if(flag==1)//conditon to check if the date is valid
        {
            if(m==1)
            {
                sum=sum+d;
            }
            if(m==2)
            {
                sum=sum+31+d;
            }
            if(m==3)
            {
                sum=sum+31+28+d;
            }
            if(m==4)
            {
                sum=sum+31+28+31+d;
            }
            if(m==5)
            {
                sum=sum+31+28+31+30+d;
            }
            if(m==6)
            {
                sum=sum+31+28+31+30+31+d;
            }
            if(m==7)
            {
                sum=sum+31+28+31+30+31+30+d;
            }
            if(m==8)
            {
                sum=sum+31+28+31+30+31+30+31+d;
            }
            if(m==9)
            {
                sum=sum+31+28+31+30+31+30+31+31+d;
            }
            if(m==10)
            {
                sum=sum+31+28+31+30+31+30+31+31+30+d;
            }
            if(m==11)
            {
                sum=sum+31+28+31+30+31+30+31+31+30+31+d;
            }
            if(m==12)
            {
                sum=sum+31+28+31+30+31+30+31+31+30+31+30+d;
            }//code to find the number of days after 1st January
            System.out.println("Valid date");
            System.out.println(sum);
        }
        else
        {
            System.out.println("Invalid date");
        }
        System.out.println("");
    }//end of main
}