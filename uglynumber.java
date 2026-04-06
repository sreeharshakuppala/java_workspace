


class uglynumber
{
 public static boolean  ugly(int quotient)
    {
        if (quotient == 0)
          {
              return true;
          }
 
       if(quotient % 2 == 0)
       {

           //  quotient = quotient / 2;
           return ugly(quotient / 2);
       }
        
         if(quotient % 3 == 0)
         {
            //  quotient = quotient / 3;
              return ugly(quotient/3); 
         }
          if(quotient % 5 == 0)
          {
            //   quotient = quotient / 5;
               return ugly(quotient/5); 
          }
         

             return false;
    }
   

    public static void main(String[] args) 
    {
        int num = 19;
        int quotient = num;
        boolean res = ugly(quotient);

        System.out.println(res);

    }

}
