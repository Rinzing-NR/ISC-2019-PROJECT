import java.io.*;

class q18_revsent
{
    public static void main(String args[])throws IOException//main begins
    {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter your number of sentence");
        int n=Integer.valueOf(br.readLine());
        if(n<=20)//condition to check if the number of sentences is valid
        {   
            String arr[]=new String[n];
            System.out.println("Enter your sentences");
            int i,j,k,x;
            for(i=0;i<n;i++)//code to input the sentences
            {
                arr[i]=br.readLine();
            }
            String arr1[]=new String[n];
            for(i=n-1,x=0;i>=0;i--,x++)//loop for the extraction of sentences from the array
            {
                String txt="";
                for(j=0;j<arr[i].length();j=k+1)//outer loop for the extraction of words
                {
                    String wrd="";
                    for(k=j;k<arr[i].length()&&arr[i].charAt(k)!=' ';k++)//inner loop for the extraction of words
                    {
                        wrd=wrd+arr[i].charAt(k);
                    }
                    txt=wrd+" "+txt;
                }
                arr1[x]=txt;
            }
            String arr2[]=new String[n];
            for(i=0;i<n;i++)//code to remove special characters
            {
                String s="";
                for(j=0;j<arr1[i].length();j++)
                {
                    char ch=arr1[i].charAt(j);
                    if(ch=='!'||ch=='.'||ch==','||ch==';'||ch==':')
                    {
                        continue;
                    }
                    s=s+ch;
                }
                arr2[i]=s;
            }
            for(i=0;i<n;i++)//code to print the required output
            {
                System.out.print(arr2[i]+" ");
            }
            System.out.println("");
        }
        else
        {
            System.out.println("Invalid input");
        }
        System.out.println("");
    }//end of main
}