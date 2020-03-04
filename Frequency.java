import java.io.*;

class Frequency
{//class begins
    String text;
    int countan,countand,len;
    public static void main(String args[])throws IOException//main begins
    {
        Frequency obj=new Frequency();
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter your text");
        String str=br.readLine();
        str=str.toLowerCase();
        obj.accept(str);
        obj.checkandfreq();
        obj.checkanfreq();
        obj.display();
        System.out.println("");
    }//end of main
    Frequency()//default constructor
    {
        text="";
        countan=0;
        countand=0;
        len=0;
    }
    void accept(String n)
    {
        text=n;
        text=text.toLowerCase();
        len=text.length();
    }
    void checkandfreq()
    {
        int i,j;
        for(i=0;i<len;i++)//code to count the frequency of "and"
        {
            String wrd="";
            for(j=i;j<len&&text.charAt(j)!=' ';j++)
            {
                wrd=wrd+text.charAt(j);
            }
            if(wrd.equals("and"))
            {
                countand++;
            }
        }
    }
    void checkanfreq()
    {
        int i,j;
        for(i=0;i<len;i++)//code to count the frequency of "an"
        {
            String wrd="";
            for(j=i;j<len&&text.charAt(j)!=' ';j++)
            {
                wrd=wrd+text.charAt(j);
            }
            if(wrd.equals("an"))
            {
                countan++;
            }
        }
    }
    void display()
    {
        System.out.println("Frequency of and="+countand);
        System.out.println("Frequency of an="+countan);
    }
}//end of class