



class simpleinterest 
{
    private int amount;
    private int interest;
    private int years;
     
    
    public void setamount(int amount) 
    {

        if (amount >= 10000) {
            this.amount = amount;
        }

    }

    public void setinterest(int interest)
    {
        if (interest > 0 && interest <= 10) {
            this.interest = interest;
        }
    }
    public void setyears(int years)
    {
        this.years = years;

    }
    
    public int getamount()
    {
        return amount;
    }

    public int getinterest()
    {
        return interest;
    }

    public int getyears()
    {
        return years;
    }
    public  int calculate()
    {

        return (getamount() * getinterest() * getyears()) / 100;
       
    }
   
}

public class encapsimpleinterest
{
    
    public static void main(String[] args) 
    {
        simpleinterest interest = new simpleinterest();
         interest.setamount(100000);
          interest.setinterest(2);
          interest.setyears(2);
            System.out.println(interest.calculate());
          
    }

}
