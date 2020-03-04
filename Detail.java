class Detail
{//super class begins
    String name,address;
    int rent;
    long telno;
    Detail(String n,String a,long t,int r)//super class paramerized constructor
    {
        name=n;
        address=a;
        telno=t;
        rent=r;
    }
    void show()//super class function/method "show"
    {
        System.out.println("Customer name="+name);
        System.out.println("Customer address="+address);
        System.out.println("Telephone Number="+telno);
        System.out.println("Rental Charge="+rent);
    }
}//end of class