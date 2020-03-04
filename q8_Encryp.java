import java.io.*;

class q8_Encryp
{
    public static void main(String args[])throws IOException//main begins
    {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter number of sentence");
        int n=Integer.valueOf(br.readLine());
        if(n>1&&n<10)//condition to check whether the number of sentences are valid or not
        {
            String arr[]=new String[n];
            System.out.println("Enter your sentences");
            int i,j;
            for(i=0;i<n;i++)//code to input the sentences
            {
                arr[i]=br.readLine();
            }
            for(i=0;i<n;i++)//code to perform the desired operation
            {
                if(i%2==0)//condition for the required operation
                {
                    String ctxt="";
                    for(j=0;j<arr[i].length();j++)//code to take each character two steps ahead
                    {
                        int d;
                        char ch=arr[i].charAt(j);
                        if(ch>='A'&&ch<='X' || ch>='a'&&ch<='x')
                        {
                            d=(int)ch+2;
                            ctxt=ctxt+(char)d;
                        }
                        else if(ch=='y'||ch=='Y'||ch=='z'||ch=='Z')
                        {
                            d=(int)ch-24;
                            ctxt=ctxt+(char)d;
                        }
                        else
                        {
                            ctxt=ctxt+ch;
                        }
                    }
                    arr[i]=ctxt;
                }
                else//code to reverse the order of words
                {
                    String ctxt="";
                    int k;
                    for(k=0;k<arr[i].length();k=j+1)
                    {
                        String wrd="";
                        for(j=k;j<arr[i].length()&&arr[i].charAt(j)!=' ';j++)
                        {
                            wrd=wrd+arr[i].charAt(j);
                        }
                        ctxt=wrd+" "+ctxt;
                    }
                    arr[i]=ctxt;
                }
            }
            for(i=0;i<n;i++)//code to print after the operations are performed
            {
                System.out.println(arr[i]);
            }
        }
        else
        {
            System.out.println("Invalid Entry");
        }
        System.out.println("");
    }//end of main
}