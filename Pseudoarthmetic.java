import java.util.*;

class Pseudoarthmetic
{//class begins
    int n,a[],flag,sum,r;
    boolean ans;
    public static void main(String args[])//main begins
    {
        Pseudoarthmetic obj=new Pseudoarthmetic();
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter your size");
        int a=sc.nextInt();
        obj.accept(a);
        boolean ans=obj.check();
        if(ans==true)//condition to check if the sequence is pseudoarthmetic or not
        {
            System.out.println("It is a Pseudoarthmetic sequence");
        }
        else
        {
            System.out.println("It is not a Pseudoarthmetic sequence");
        }
        System.out.println("");
    }//end of main
    Pseudoarthmetic()//default constructor
    {
        n=0;
        flag=0;
        sum=0;
        r=0;
        ans=false;
    }
    void accept(int nn)
    {
        Scanner sc=new Scanner(System.in);
        n=nn;
        a=new int[n];
        System.out.println("Enter array Elements");
        for(int i=0;i<n;i++)//code to take the input of array elements
        {
            a[i]=sc.nextInt();
        }
    }
    boolean check()
    {
        sum=a[0]+a[n-1];
        for(int i=1;i<(n-(n/2));i++)//code to check if the sequence is pseudoarthmetic or not
        {
            r=a[i]+a[(n-1)-i];
            if(r!=sum)
            {
                flag++;
                break;
            }
        }
        if(flag==0)
        {
            return true;
        }
        else
        {
            return false;
        }
    }
}//end of class