import java.io.*;

class q20_lensor
{
    public static void main(String args[])throws IOException//main begins
    {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter your sentence");
        String str=br.readLine();
        str=str.toLowerCase();
        int len=str.length();
        int i,j,m=0;
        for(i=0;i<len;i++)//code to find the number of words
        {
            char ch=str.charAt(i);
            if(Character.isWhitespace(ch))
            {
                m++;
            }
        }
        int n=m+1;
        String arr[]=new String[n];
        int a=0;
        for(i=0;i<len;i=j+1)//code to extract each word and to store it in an array
        {
            String wrd="";
            for(j=i;j<len&&str.charAt(j)!=' '&&str.charAt(j)!='.';j++)
            {
                wrd=wrd+str.charAt(j);
            }
            arr[a]=wrd;
            a++;
        }
        int k;
        for(i=1;i<n;i++)//code to sort the array lengthwise using insertion sort
        {
            for(j=0;j<i;j++)
            {
                if(arr[i].length()<arr[j].length())
                {
                    String temp=arr[j];
                    arr[j]=arr[i];
                    for(k=i;k>j;k--)
                    {
                        arr[k]=arr[k-1];
                    }
                    arr[k+1]=temp;
                }
            }
        }
        char c=Character.toUpperCase(arr[0].charAt(0));
        arr[0]=c+arr[0].substring(1);
        arr[n-1]=arr[n-1]+".";
        for(i=0;i<n;i++)//code to print the sorted sentence
        {
            System.out.print(arr[i]+" ");
        }
        System.out.println("");
        System.out.println("");
    }//end of main
}