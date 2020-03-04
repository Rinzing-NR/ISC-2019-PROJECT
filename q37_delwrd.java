import java.io.*;

class q37_delwrd
{
    public static void main(String args[])throws IOException//main begins
    {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter your sentence");
        String str=br.readLine();
        int l=str.length();
        char c=str.charAt(l-1);
        if(c!='.'&&c!=','&&c!='?'&&c!='!')//condition to check if the string is valid or not
        {
            System.out.print("Invalid Input");
        }
        else
        {
            String txt="";
            int i,j,count=0;
            for(i=0;i<l;)//code to remove all extra spaces
            {
                char ch=str.charAt(i);
                if(ch==' ')
                {
                    for(j=i;j<l;j++)
                    {
                        char cha=str.charAt(j);
                        if(cha==' ')
                        {
                            i++;
                        }
                        else
                        {
                            txt=txt+' ';
                            count++;
                            break;
                        }
                    }
                }
                else
                {
                    txt=txt+ch;
                    i++;
                }
            }
            System.out.println("Word to be deleted");
            String word=br.readLine();
            System.out.println("Word position in the sentence");
            int p=Integer.valueOf(br.readLine());
            String arr[]=new String[count+1];
            int len=txt.length();
            int x=0;
            for(i=0;i<len;i=j+1)//code to extract each word and assign it to an array
            {
                String wrd="";
                for(j=i;j<len&&txt.charAt(j)!=' ';j++)
                {
                    wrd=wrd+txt.charAt(j);
                }
                arr[x]=wrd;
                x++;
            }
            for(i=p-1;i<count;i++)//code to remove the desired word
            {
                arr[i]=arr[i+1];
            }
            for(i=0;i<count;i++)
            {
                System.out.print(arr[i]+" ");
            }
            System.out.println("");
            System.out.println("");
        }
    }//end of main
}