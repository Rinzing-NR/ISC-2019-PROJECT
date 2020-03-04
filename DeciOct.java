import java.util.*;

class DeciOct
{//class begins
    int n,i,oct;
    public static void main(String args[])//main begins
    {
        DeciOct obj=new DeciOct();
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter your decimal number");
        int a=sc.nextInt();
        obj.getnum(a);
        obj.show();
        System.out.println("");
    }//maun ends
    DeciOct()//default constructor
    {
        n=0;
        i=0;
        oct=0;
    }
    void getnum(int nn)
    {
        n=nn;
    }
    void deci_oct()//recursive function to convert the decimal number into an octal number
    {
        if(n>0)
        {
            int r=n%8;
            oct=oct+(r*(int)Math.pow(10,i));
            n=n/8;
            i++;
            deci_oct();
        }
    }
    void show()
    {
        System.out.println("Decimal value="+n);
        deci_oct();
        System.out.println("Octal value="+oct);
    }
}//end of class