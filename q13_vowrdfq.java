import java.io.*;

class q13_vowrdfq
{
    public static void main(String args[])throws IOException//main begins
    {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        String str;
        String txt[]=new String[10];
        System.out.println("Enter Your Sentence");
        str=br.readLine();
        str=str.toUpperCase();
        int len=str.length();
        int count=0,i,j;
        for(i=0;i<len;i=j+2)//Sentence extraction:outer loop
        {
            String sent="";
            for(j=i;j<len;j++)//Sentence extraction:inner loop
            {
                if(str.substring(j,j+2).equals("? ")||str.substring(j,j+2).equals(". ")||str.substring(j,j+2).equals("! "))
                {
                    break;
                }
                sent=sent+str.charAt(j);
            }
            txt[count]=sent;
            count++;
        }
        System.out.println("Sentence\tNo.of vowels\tNo.words");
        System.out.println("------------------------------------------------");
        int x=1;
        int v[]=new int[count];
        int w[]=new int[count];
        for(i=0;i<count;i++,x++)//outer loop for operation on each sentence 
        {
            int vow=0,sp=0;
            int l=txt[i].length();
            for(j=0;j<l;j++)//inner loop to extract words from each sentence
            {
                char ch=txt[i].charAt(j);
                if(Character.isWhitespace(ch))//condition to find number of spaces
                {
                    sp++;
                }
                if(ch=='A'||ch=='E'||ch=='I'||ch=='O'||ch=='U')//condition to find number of vowels
                {
                    vow++;
                }
            }
            v[i]=vow;
            w[i]=l;
            System.out.println(x+"\t\t"+vow+"\t\t"+(sp+1));
        }
        x=1;
        System.out.println("Sentence\tNo.of words/vowels");
        System.out.println("------------------------------------------------");
        for(i=0;i<count;i++,x++)
        {
            System.out.print(x+"\t\t");
            for(j=1;j<=w[i];j++)
            {
                System.out.print("V");
            }
            System.out.println("");
            System.out.print("\t\t");
            for(j=1;j<=v[i];j++)
            {
                System.out.print("W");
            }
            System.out.println("");
        }
        System.out.println("");
    }//end of main
}