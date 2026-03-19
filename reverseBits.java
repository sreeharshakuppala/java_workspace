


public class reverseBits 
{
    public static Integer Binary()
    {
       
        int num = 43261596;
        int remainder = 0;
        int digit = num;
        int res = 0;
        int i = 1;
        while (i <= 32)
        {
            remainder = digit % 2;
            System.out.print(remainder);
            res = res * 2 + remainder;
            digit = digit / 2;
            i++;
        }
        
    

        return res;
    }


    public static void main(String[] args) 
    {
     
        int res = Binary();
    System.out.println();
        System.out.println(res);



        
    }

}