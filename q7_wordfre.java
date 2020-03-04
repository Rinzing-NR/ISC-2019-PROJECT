import java.io.*;

class q7_wordfre
{
    public static void main(String args[])throws IOException//main begins
    {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter number of sentence");
        int n=Integer.valueOf(br.readLine());
        if(n>=1&&n<4)//condition to check if the number of sentences is valid or not
        {
            System.out.println("Enter sentence");
            String str=br.readLine();
            str=str.toUpperCase();
            int count=0,i,j;
            int len=str.length();
            for(i=0;i<len;i++)//code to find the number of words
            {
                if(str.charAt(i)==' '||str.charAt(i)==','||str.charAt(i)=='.'||str.charAt(i)=='?')
                {
                    count++;
                }
            }
            int y=count+1,a=0;
            String arr[]=new String[y];
            for(i=0;i<len;i=j+1)//word extraction:outer loop
            {
                String wrd="";
                for(j=i;j<len&&(str.charAt(j)!=' '&&str.charAt(j)!=','&&str.charAt(j)!='.'&&str.charAt(j)!='?');j++)//word extraction:inner loop
                {
                    wrd=wrd+str.charAt(j);
                }
                int flag=0;
                for(int k=0;k<a;k++)
                {
                    if(wrd.equals(arr[k]))
                    {
                        flag=1;
                    }
                }
                if(flag==1)
                {
                    continue;
                }
                else
                {
                    arr[a]=wrd;
                    a++;
                }//code to enter words in the array without repeating it
            }
            int c=0;
            for(i=0;i<y;i++)//code to find total number of words(non repeating)
            {
                if(arr[i]==null||arr[i]=="")
                {
                    continue;
                }
                c++;
            }
            String s[]=new String[c];
            for(i=0;i<c;i++)
            {
                s[i]=arr[i];
            }
            int arr1[]=new int[s.length];
            int x;
            int e=0;
            for(x=0;x<c;x++)//code to count frequency of each word
            {
                for(i=0;i<len;i=j+1)
                {
                    String wrd="";
                    for(j=i;j<len&&(str.charAt(j)!=' '&&str.charAt(j)!=','&&str.charAt(j)!='.'&&str.charAt(j)!='?');j++)
                    {
                        wrd=wrd+str.charAt(j);
                    }
                    if(arr[x].equals(wrd))    
                    {
                        arr1[x]=arr1[x]+1;
                        e++;
                    }
                }
            }
            for(i=0;i<(arr1.length-1);i++)//code to sort the two array elements simultaneously
            {
                for(j=i+1;j<arr1.length;j++)
                {
                    if(arr1[i]>arr1[j])
                    {
                        int temp=arr1[i];
                        arr1[i]=arr1[j];
                        arr1[j]=temp;
                        String tmp=s[i];
                        s[i]=s[j];
                        s[j]=tmp;
                    }
                }
            }
            System.out.println("Total number of words:"+e);
            System.out.println("Word\tFrequency");
            for(i=0;i<c;i++)//code to print the frequency of each word in sorted format
            {
                System.out.println(s[i]+"\t"+arr1[i]);
            }
        }
        else
        {
            System.out.println("Invalid Entry");
        }
        System.out.println("");
    }//end of main
}