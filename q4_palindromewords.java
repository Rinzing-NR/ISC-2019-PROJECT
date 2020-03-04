import java.util.*;

class q4_palindromewords
{
    public static void main(String args[])//main begins
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter your sentence which terminates with either ‘.’ , ’,’ , ‘?’ , ‘!’");
        String str=sc.nextLine();
        str=str.toUpperCase();
        int len=str.length();
        int i,j,count=0;
        for(i=0;i<len;i=j+1)//code for word extraction:outer loop
        {
            String wrd="";
            for(j=i;j<len&&str.charAt(j)!=' '&&str.charAt(j)!='.'&&str.charAt(j)!='?'&&str.charAt(j)!='!';j++)//code for word extraction:inner loop
            {
                wrd=wrd+str.charAt(j);
            }
            StringBuffer obj= new StringBuffer(wrd);
            obj=obj.reverse();//code to reverse the word
            String rev=obj.toString();
            if(rev.equals(wrd))//code to check and print if the word is palindrome 
            {
                count++;
                System.out.print(wrd+" ");
            }
        }
        System.out.println("");
        if(count>0)//code to print the number of plindromic words
        {
            System.out.println("Number of palindromic words="+count);
        }
        else
        {
            System.out.println("No palindromic words");
        }
        System.out.println("");
    }//main ends
}