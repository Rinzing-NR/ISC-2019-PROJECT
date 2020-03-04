import java.util.*;

class Combine
{//class begins
    int com[],size;
    public static void main(String args[])//main begins
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter array 1 size");
        int a=sc.nextInt();
        System.out.println("Enter array 2 size");
        int b=sc.nextInt();
        Combine obj1=new Combine(a);
        Combine obj2=new Combine(b);
        Combine obj3=new Combine(a+b);
        obj1.inputarray();
        obj2.inputarray();
        obj3.mix(obj1,obj2);
        obj3.sort();
        obj1.display();
        obj2.display();
        obj3.display();
        System.out.println("");
    }//end of main
    Combine(int nn)//parameterized constructor
    {
        size=nn;
        com=new int[size];
    }
    void inputarray()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Elements in the array");
        for(int i=0;i<size;i++)//code to take the input of array elements
        {
            com[i]=sc.nextInt();
        }
    }
    void sort()
    {
        for(int i=0;i<size-1;i++)//code to sort the array elements
        {
            for(int j=i+1;j<size;j++)
            {
                if(com[i]>com[j])
                {
                    int temp=com[i];
                    com[i]=com[j];
                    com[j]=temp;
                }
            }
        }
    }
    void mix(Combine A,Combine B)
    {
        int x=0;
        for(int i=0;i<A.size;i++)
        {
            com[x]=A.com[i];
            x++;
        }
        for(int i=0;i<B.size;i++)
        {
            com[x]=B.com[i];
            x++;
        }//code to combine the array elements
    }
    void display()
    {
        System.out.println("Array Elements");
        for(int i=0;i<size;i++)//code to display the array elements
        {
            System.out.print(com[i]+" ");
        }
        System.out.println("");
    }
}//end of class