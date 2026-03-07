 
import java.util.HashMap;
 
public class containsduplicates2
{

 public static boolean containsduplicates() 
    {
        int[] nums = { 1, 0, 1, 1};
        HashMap<Integer, Integer> checking = new HashMap<Integer, Integer>();
        int k = 1;
        int i = 0;
        
        int j = 1000000;
       
        while (i < nums.length)
        {
            
            j =  1000000;
           
            if (checking.containsKey(nums[i]))
            {
                j = checking.get(nums[i]);
               
            }
            if (Math.abs(j - i) <= k)
            {
                return true;
            } 
            
        
         checking.put(nums[i],i);
           
            
            i++;
            
        }



        return false;
    }
    
    public static void main(String[] args) {
        boolean res = containsduplicates();
        System.out.println(res);
    }


}