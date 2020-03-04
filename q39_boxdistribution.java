import java.util.*;

class q39_boxdistribution
{//class begins
    public static void main(String args[])//main begins
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter number of boxes");
        int n=sc.nextInt();
        if(n>1000)//condition to check if the value is valid or not
        {
            System.out.println("Invalid Input");
        }
        else
        {
            int arr[]={48,24,12,6};
            int r=0,sum=0,copy=n,ref=0;
            for(int i=0;i<4&&n>0;i++)//code to print the breakup of boxes
            {
                r=n/arr[i];
                n=n%arr[i];
                sum=sum+r;
                ref=ref+r*arr[i];
                if(r>0)
                {
                    System.out.println(arr[i]+"x"+r+"="+(r*arr[i]));
                }
            }
            int e;
            if(copy-ref<6&&copy-ref>0)
            {
                e=sum+1;
            }
            else
            {
                e=sum;
            }
            System.out.println("Remaining boxes="+(copy-ref)+"x"+"1"+"="+(copy-ref));    
            System.out.println("Total number of boxes="+copy);
            System.out.println("Total number of cartons="+e);
        }//end of main
        System.out.println("");
    }
}//end of class