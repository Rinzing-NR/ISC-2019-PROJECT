import java.io.*;

class q5_denomination
{
    public static void main (String args[])throws IOException//main begins
    {
        BufferedReader br=new BufferedReader (new InputStreamReader(System.in));
        int arr[]={1000,500,100,50,20,10,5,2,1};
        int n,i,r,sum=0;
        System.out.println("Enter your amount");
        n=Integer.valueOf(br.readLine());
        String txt=Integer.toString(n);
        int copy=n,xerox=n;
        String str="";
        if(txt.length()<=5)//condition to check if the amount is valid or not
        {
            while(n>0)//code to print the digits in words
            {
                r=n%10;
                if(r==1)
                {
                    str="one "+str;
                }
                if(r==2)
                {
                    str="two "+str;
                }
                if(r==3)
                {
                    str="three "+str;
                }
                if(r==4)
                {
                    str="four "+str;
                }
                if(r==5)
                {
                    str="five "+str;
                }
                if(r==6)
                {
                    str="six "+str;
                }
                if(r==7)
                {
                    str="seven "+str;
                }
                if(r==8)
                {
                    str="eight "+str;
                }
                if(r==9)
                {
                    str="nine "+str;
                }
                if(r==0)
                {
                    str="zero "+str;
                }
                n=n/10;
            }
            System.out.println(str);
            System.out.println("Denomination:");
            for(i=0;copy>0&&i<9;i++)//code to print the breakup of denomination
            {
                 r=copy/arr[i];
                 copy=copy%arr[i];
                 sum=sum+r;
                 if(r>0)
                 {
                     System.out.println(arr[i]+"x"+r+"="+r*arr[i]);
                 }
            }
            System.out.println("Total="+xerox);
            System.out.println("Total number of notes="+sum);
        }
        else
        {
            System.out.println("Invalid Amount");
        }
        System.out.println("");
    }//main ends
}