import java.io.*;

class q23_alphasort
{
    public static void main(String args[])throws IOException//main begins
    {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter your sentence");
        String str=br.readLine();
        int len=str.length();
        int i,j,s=0;
        for(i=0;i<len;i++)//code to find the number of words
        {
            char ch=str.charAt(i);
            if(Character.isWhitespace(ch))
            {
                s++;
            }
        }
        str=str.toUpperCase();
        int n=s+1,x=0;
        String arr[]=new String[n];
        for(i=0;i<len;i=j+1)//code to extract each word and insert it in the array
        {
            String wrd="";
            for(j=i;j<len&&str.charAt(j)!=' '&&str.charAt(j)!='.'&&str.charAt(j)!='?'&&str.charAt(j)!='!';j++)
            {
                wrd=wrd+str.charAt(j);
            }
            arr[x]=wrd;
            x++;
        }
        for(i=0;i<n-1;i++)//code to sort the array alphabetically
        {
            for(j=i+1;j<n;j++)
            {
                if(arr[i].compareTo(arr[j])>0)
                {
                    String temp=arr[i];
                    arr[i]=arr[j];
                    arr[j]=temp;
                }
            }
        }
        System.out.println("Length:"+n);
        System.out.print("Rearranged Sentence:");
        for(i=0;i<n;i++)//code to print the rearranged sentence
        {
            System.out.print(arr[i]+" ");
        }
        System.out.println("");
        System.out.println("");
    }//end of main
}