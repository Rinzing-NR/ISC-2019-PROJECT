class Booklist extends Author
{//sub class begins
    long bookno;
    String bookname;
    float price;
    int edition;
    Booklist(long b,String bn,float p,int e)//sub class parameterized constructor
    {
        super(23267,"Stephen Hawking");//calling super class parameterized constructor
        bookno=b;
        bookname=bn;
        price=p;
        edition=e;
    }
    void show()
    {
        super.show();//calling super class function/method "show"
        System.out.println("Book number="+bookno);
        System.out.println("Book name="+bookname);
        System.out.println("Price="+price);
        System.out.println("Edition="+edition);
    }
    public static void main(String args[])//main begins
    {
        Booklist obj=new Booklist(11227,"A Brief History of Time",535.0f,2019);
        obj.show();
    }//end of main
}//end of sub class