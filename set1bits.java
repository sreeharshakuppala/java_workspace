
public class set1bits
{
     public static Integer set1bits()
    {
        int n = 2147483645;
       int remainder = 0;
       int quotient = n;
       int count = 0;
        while (quotient != 0) 
        {
            
            remainder = quotient % 2;
            if (remainder != 0)
            {
                count += 1;
            }
            quotient = quotient / 2;
            
            

        }
         
        return count;

    }


    public static void main(String[] args) 
    {
     
        int res = set1bits();
      
        System.out.println(res);



        
    }

}