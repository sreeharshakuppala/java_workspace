public class poweroftwo 
{
    
     public static boolean poweroftwo() 
    {
 
        int n = 16;
        int i = 0;
        double power;
        double res = 0;
        while(true)
        {
          
        power = Math.pow(2, i);
        if(power <= n)
        {
            res = power;
        }
        else 
        {
            break;
        }
        i++;

        }
       
        if (n == (int) res)
        {
            return true;
        }
       

        return false;


    }
    
    public static void main(String[] args)
    {
        boolean res = poweroftwo();
        System.out.println(res);
    }

}
