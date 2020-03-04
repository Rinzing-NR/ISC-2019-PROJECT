class Author
{//super class begins
    int authorno;
    String name;
    Author()//super class default constructor
    {
        authorno=0;
        name="";
    }
    Author(int a,String s)//super class parameterized constructor
    {
        authorno=a;
        name=s;
    }
    void show()//super class function/method "show"
    {
        System.out.println("Author number="+authorno);
        System.out.println("Author name="+name);
    }
}//super class ends