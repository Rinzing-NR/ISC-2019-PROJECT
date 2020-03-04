import java.util.*;

class q19_uniquenum
{
    public static void main(String args[])//main begins
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter your starting number");
        int m=sc.nextInt();
        System.out.println("Enter your limit");
        int n=sc.nextInt();
        System.out.print("The Unique Digit Integers are: ");
        int freq=0;
        for(int i=m;i<=n;i++)//loop to find unique digits for user inputs
        {
            int flag=0;
            String str=Integer.toString(i);
            for(int j=0;j<str.length();j++)//code to check if there is any repeating digits            {
            {   
                char c1=str.charAt(j);
                for(int k=j+1;k<str.length();k++)
                {
                    char c2=str.charAt(k);
                    if(c1==c2)
                    {
                        flag++;
                    }
                }
            }
            if(flag==0)
            {
                System.out.print(i+" ");
                freq++;
            }
        }
        System.out.println("");
        System.out.println("Frequency of Unique-Digit Integers is:"+freq);//code to print frequency of unique digits
        System.out.println("");
    }//end of main
}