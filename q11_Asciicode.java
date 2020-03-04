import java.io.*;

class q11_Asciicode
{
    public static void main(String args [])throws IOException//main begins
    {
        BufferedReader br=new BufferedReader (new InputStreamReader(System.in));
        String ctxt,txt="";
        System.out.println("Enter your code");
        ctxt=br.readLine();
        int len=ctxt.length();
        int i;
        StringBuffer obj=new StringBuffer(ctxt);
        obj=obj.reverse();
        String str=obj.toString();//code to reverse the string
        for(i=0;i<len-1;)//code to convert the ASCII code into alphabets
        {
            char ch=str.charAt(i);
            char ch1=str.charAt(i+1);
            String c=Character.toString(ch);
            String c1=Character.toString(ch1);
            String d=c.concat(c1);
            int x=Integer.valueOf(d);
            if(x<23&&x>9)
            {
                char ch2=str.charAt(i+2);
                String c2=Character.toString(ch2);
                String e=d.concat(c2);
                int y=Integer.valueOf(e);
                txt=txt+(char)y;
                i=i+3;
            }
            else
            {
                txt=txt+(char)x;
                i=i+2;
            }
        }
        System.out.println("THE DECODED MESSAGE: "+txt);//code to print the decoded message
        System.out.println("");
    }//end of main
}