import java.io.*;

class VowelWord
{//class begins
    String str;
    int freq;
    public static void main(String args[])throws IOException//main begins
    {
        VowelWord obj=new VowelWord();
        obj.readstr();
        obj.freq_vowel();
        obj.display();
        System.out.println("");
    }//end of main
    VowelWord()//default constructor
    {
        str="";
        freq=0;
    }
    void readstr()throws IOException
    {
        BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter your sentence");
        str=br.readLine();
    }
    void freq_vowel()
    {
        int i,j;
        String txt=str.toUpperCase();
        for(i=0;i<txt.length();i=j+1)//code to extract each word and to count the number of words starting with a vowel
        {
            String wrd="";
            for(j=i;j<txt.length()&&txt.charAt(j)!=' ';j++)
            {
                wrd=wrd+txt.charAt(j);
            }
            char ch=wrd.charAt(0);
            if(ch=='A'||ch=='E'||ch=='I'||ch=='O'||ch=='U')
            {
                freq++;
            }
        }
    }
    void display()
    {
        System.out.println("Original String="+str);
        System.out.println("Frequency of words starting with a vowel="+freq);
    }
}//end of class