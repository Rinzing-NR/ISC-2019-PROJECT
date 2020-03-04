import java.util.*;

class RecFact
{//class begins
    int n,r,fact;
    public static void main(String args[])//main begins
    {
        RecFact obj=new RecFact();
        obj.readnum();
        obj.factseries();
        System.out.println("");
    }//end of main
    RecFact()//default constructor
    {
        n=0;
        r=0;
        fact=1;
    }
    void readnum()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter value of n");
        n=sc.nextInt();
        System.out.println("Enter value of r");
        r=sc.nextInt();
    }
    void factseries()
    {
        int x=factorial(n);
        fact=1;
        int y=factorial(r);
        fact=1;
        int z=factorial(n-r);
        double d=x/(y*z);
        System.out.println(d);
    }
    int factorial(int w)//recursive function which returns the factorial of the number
    {
        if(w>=1)
        {
            fact=fact*w;
            w--;
            int h=factorial(w);
            return h;
        }
        return fact;
    }
}//end of class