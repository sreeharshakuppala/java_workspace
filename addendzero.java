

class addendzero
{

    public static int[] addzero()
    {
        
    
      int[] nums = {0,1,0,3,12};
        int len = nums.length;
        int i = 0;
        int j = 0;
    
        while (i< nums.length)
        {
           
            if(nums[i] != 0)
            {
                int s = nums[j];
                nums[j] = nums[i];
                nums[i] = s;
                j++;
            }
            i++;
           

            
        }
        
       
        
    
        return nums;
        
    }
   

    public static void main(String[] args) 
    {
       
         int[] res = addzero();

        System.out.println(res);

    }

}


