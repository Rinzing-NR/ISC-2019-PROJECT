import java.io.*;

class q17_seccode
{
    public static void main(String args[])throws IOException//main begins
    {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter your value of N");
        int n=Integer.valueOf(br.readLine());
        if(n>6)//condition to check if the length is valid or not
        {
            System.out.println("ERROR!Length of string should not exceed 6 characters!");
            System.out.println("");
        }
        else
        {
            System.out.println("Enter your code");
            String str=br.readLine();
            int len=str.length();
            int f=0;
            if(len!=n)//condition to check if the length is valid or not
            {
                System.out.println("Invalid!String length not same as specified!");
                f++;
            }
            int a=0;
            for(int i=0;i<len;i++)//code to check if there are lower case letters
            {
                char ch=str.charAt(i);
                if(Character.isLowerCase(ch))
                {
                    a++;
                    break;
                }
            }
            if(a!=0)
            {
                System.out.println("Invalid!Only uppercase letters permitted!");
                f++;
            }
            int b=0;
            for(int i=0;i<len;i++)//code to check if there are non alternate letters
            {
                char ch=str.charAt(i);
                if(ch=='A'||ch=='C'||ch=='E'||ch=='G'||ch=='I'||ch=='K')
                {
                    b++;
                }
            }
            if(b!=len)
            {
                System.out.println("Invalid!Only alternate letters permitted!");
                f++;
            }
            int x=0;
            for(int i=0;i<len;i++)//code to check if there is repeatition of characters
            {
                char ch=str.charAt(i);
                for(int j=i+1;j<len;j++)
                {
                    char c=str.charAt(j);
                    if(ch==c)
                    {
                        x++;
                    }
                }
            }
            if(x!=0)
            {
                System.out.println("Invalid!Repetition of characters not permitted!");
                f++;
            }
            if(f==0)
            {
                System.out.println("Valid");
            }
            System.out.println("");
        }
    }
}