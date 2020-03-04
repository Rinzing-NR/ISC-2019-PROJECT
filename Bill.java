class Bill extends Detail
{//sub class begins
    int n;
    double amt;
    public static void main(String args[])//main begins
    {
        Bill obj=new Bill(400);
        obj.cal();
        obj.show();
    }//end of main
    Bill(int nn)//sub class parameterized constructor
    {
        super("Jeon Uchiha","Tokyo,Japan",7602404,750);//calling super class parameterized constructor
        n=nn;
        amt=0.0;
    }
    void cal()
    {
        if(n<=100)
        {
            amt=super.rent;
        }
        else if(n>100&&n<=200)
        {
            amt=super.rent+((n-100)*0.6);
        }
        else if(n>200&&n<=300)
        {
            amt=super.rent+(100*0.6)+((n-200)*0.8);
        }
        else
        {
            amt=super.rent+(100*0.6)+(100*0.8)+((n-300)*1);
        }//code to find the amount
    }
    void show()
    {
        super.show();//calling super class function/method "show"
        System.out.println("Number of calls="+n);
        System.out.println("Amount to be paid="+amt);
    }
}//end of class