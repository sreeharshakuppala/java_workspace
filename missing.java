

class missing
{


 public static Integer missing()
    
    {
        int[] nums = { 1, 0,2};
        int n = nums.length + 1;
        int sum1 = 0;
        int sum2 = 0;
        int i = 0;
        while (i < nums.length) 
        {
            sum1 += nums[i];
            i++;

        }
        i = 0;
         while (i < n) 
         {
             sum2 += i;
             i++;

         }

         return   Math.abs(sum2 - sum1);
        



         
    }
   

    public static void main(String[] args) 
    {
       
        Integer res = missing();

        System.out.println(res);

    }

}
