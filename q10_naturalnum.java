import java.util.*;

class q10_naturalnum
{
    public static void main(String args[])//main begins
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter your number");
        int n=sc.nextInt();
        String s=Integer.toString(n);
        int len=s.length();
        if(n>=1000)//condition to check if the number input is valid
        {
            System.out.println("Out of Range");
        }
        else
        {
            String str="";
            if(len==1)//condition for one digit number
            {
                if(n==0)
                {
                    str="Zero";
                }
                if(n==1)
                {
                    str="One";
                }
                if(n==2)
                {
                    str="Two";
                }
                if(n==3)
                {
                    str="Three";
                }
                if(n==4)
                {
                    str="Four";
                }
                if(n==5)
                {
                    str="Five";
                }
                if(n==6)
                {
                    str="Six";
                }
                if(n==7)
                {
                    str="Seven";
                }
                if(n==8)
                {
                    str="Eight";
                }
                if(n==9)
                {
                    str="Nine";
                }
            }
            if(len==2)//conditon for two digit numbers
            {
                 if(s.charAt(0)=='1')//special code for ten's place(teens)
                 {
                     char c=s.charAt(1);
                     if(c=='0')
                     {
                         str="Ten";
                     }
                     if(c=='1')
                     {
                         str="Eleven";
                     }
                     if(c=='2')
                     {
                         str="Twelve";
                     }
                     if(c=='3')
                     {
                         str="Thirteen";
                     }
                     if(c=='4')
                     {
                         str="Fourteen";
                     }
                     if(c=='5')
                     {
                         str="Fifteen";
                     }
                     if(c=='6')
                     {
                         str="Sixteen";
                     }
                     if(c=='7')
                     {
                         str="Seventeen";
                     }
                     if(c=='8')
                     {
                         str="Eighteen";
                     }
                     if(c=='9')
                     {
                         str="Nineteen";
                     }
                 }
                 else
                 {
                     int y=n%10;
                     if(y==1)
                     {
                         str="One";
                     }
                     if(y==2)
                     {
                         str="Two";
                     }
                     if(y==3)
                     {
                         str="Three";
                     }
                     if(y==4)
                     {
                         str="Four";
                     }
                     if(y==5)
                     {
                         str="Five";
                     }
                     if(y==6)
                     {
                         str="Six";
                     }
                     if(y==7)
                     {
                         str="Seven";
                     }
                     if(y==8)
                     {
                         str="Eight";
                     }
                     if(y==9)
                     {
                         str="Nine";
                     }
                     char q=s.charAt(0);
                     if(q=='2')
                     {
                         str="Twenty "+str;
                     }
                     if(q=='3')
                     {
                         str="Thirty "+str;
                     }
                     if(q=='4')
                     {
                         str="Fourty "+str;
                     }
                     if(q=='5')
                     {
                         str="Fifty "+str;
                     }
                     if(q=='6')
                     {
                         str="Sixty "+str;
                     }
                     if(q=='7')
                     {
                         str="Seventy "+str;
                     }
                     if(q=='8')
                     {
                         str="Eighty "+str;
                     }
                     if(q=='9')
                     {
                         str="Ninety "+str;
                     }//general code for ten's place(non teens)
                }
            }
            if(len==3)//conditon for three digit numbers
            {
                char e=s.charAt(0);
                if(e=='1')
                {
                    str="One hundred ";
                }
                if(e=='2')
                {
                    str="Two hundred ";
                }
                if(e=='3')
                {
                    str="Three hundred ";
                }
                if(e=='4')
                {
                    str="Four hundred ";
                }
                if(e=='5')
                {
                    str="Five hundred ";
                }
                if(e=='6')
                {
                    str="Six hundred ";
                }
                if(e=='7')
                {
                    str="Seven hundred ";
                }
                if(e=='8')
                {
                    str="Eight hundred ";
                }
                if(e=='9')
                {
                    str="Nine hundred ";
                }//code for hundred's place
                if(s.charAt(1)=='1')//special code for ten's place(teens)
                {
                    char c=s.charAt(2);
                    if(c=='0')
                    {
                        str=str+"and Ten";
                    }
                    if(c=='1')
                    {
                        str=str+"and Eleven";
                    }
                    if(c=='2')
                    {
                        str=str+"and Twelve";
                    }
                    if(c=='3')
                    {
                        str=str+"and Thirteen";
                    }
                    if(c=='4')
                    {
                        str=str+"and Fourteen";
                    }
                    if(c=='5')
                    {
                        str=str+"and Fifteen";
                    }
                    if(c=='6')
                    {
                        str=str+"and Sixteen";
                    }
                    if(c=='7')
                    {
                        str=str+"and Seventeen";
                    }
                    if(c=='8')
                    {
                        str=str+"and Eighteen";
                    }
                    if(c=='9')
                    {
                        str=str+"and Nineteen";
                    }
                }
                else
                {
                    char q=s.charAt(1);
                    if(q=='2')
                    {
                        str=str+"and Twenty ";
                    }
                    if(q=='3')
                    {
                         str=str+"and Thirty ";
                    }
                    if(q=='4')
                    {
                        str=str+"and Fourty ";
                    }
                    if(q=='5')
                    {
                        str=str+"and Fifty ";
                    }
                    if(q=='6')
                    {
                        str=str+"and Sixty ";
                    }
                    if(q=='7')
                    {
                        str=str+"and Seventy ";
                    }
                    if(q=='8')
                    {
                        str=str+"and Eighty ";
                    }
                    if(q=='9')
                    {
                        str=str+"and Ninety ";
                    }
                    int y=n%10;
                    if(y==1)
                    {
                        str=str+"and One";
                    }
                    if(y==2)
                    {
                        str=str+"and Two";
                    }
                    if(y==3)
                    {
                        str=str+"and Three";
                    }
                    if(y==4)
                    {
                        str=str+"and Four";
                    }
                    if(y==5)
                    {
                        str=str+"and Five";
                    }
                    if(y==6)
                    {
                        str=str+"and Six";
                    }
                    if(y==7)
                    {
                        str=str+"and Seven";
                    }
                    if(y==8)
                    {
                        str=str+"and Eight";
                    }
                    if(y==9)
                    {
                        str=str+"and Nine";
                    }//general code for ten's place(non teens)
                }
            }
            System.out.println(str);
        }
        System.out.println("");
    }//end of main
}