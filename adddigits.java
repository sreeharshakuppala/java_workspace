



public class adddigits 
{
   public static int  Adddigits()
     {
       
        int num = 243;
       int remainder = 0;
       int quotient = 0;
       int digits = num;

        if(digits <= 9)
        {
            return  num;
        }
        
        while (true)
        {
                quotient = digits/10;
                remainder = digits % 10;
                
                digits = quotient + remainder;
                if(digits <= 9)
                {
                    break;
                }

            
        }




        return digits;
     }
    public static void main(String[] args) {
        int res = Adddigits();
        System.out.println(res);

    } 
}
