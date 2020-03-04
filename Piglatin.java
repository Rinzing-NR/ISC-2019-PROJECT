import java.io.*;

class Piglatin
{//class begins
    BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
    String txt,ctxt;
    int len,count;
    public static void main(String args[])throws IOException//main begins
    {
        Piglatin obj=new Piglatin();
        obj.readstring();
        obj.convert();
        obj.consonant();
        System.out.println("");
    }//end of main
    Piglatin()//default constructor
    {
        txt="";
        len=0;
        ctxt="";
        count=0;
    }
    void readstring()throws IOException
    {
        System.out.println("Enter your word");
        txt=br.readLine();
        txt=txt.toUpperCase();
        len=txt.length();
    }
    void convert()
    {
        int i;
        String str="";
        for(i=0;i<len;i++)
        {
            char ch=txt.charAt(i);
            if(ch=='A'||ch=='E'||ch=='I'||ch=='O'||ch=='U')
            {
                break;
            }
            str=str+ch;
        }
        char c=txt.charAt(0);
        if(c=='A'||c=='E'||c=='I'||c=='O'||c=='U')
        {
            ctxt=txt;
        }
        else
        {
            ctxt=txt.substring(i)+str+"AY";
        }//code to convert the word into a piglatin word
        System.out.println(ctxt);
    }
    void consonant()
    {
        for(int i=0;i<len;i++)//code to count the number of consonants
        {
            char ch=txt.charAt(i);
            if(ch!='A'&&ch!='E'&&ch!='I'&&ch!='O'&&ch!='U')
            {
                count++;
            }
        }
        System.out.println("Number of consonants="+count);
    }
}//end of class