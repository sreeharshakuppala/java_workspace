
import java.util.ArrayList;
import java.util.List;

public class summaryranges
{

    public static List<String> Ranges()
    {
        int[] nums = {0,1,2};

        List<String> result = new ArrayList<>();
        List<Integer> build = new ArrayList<>();


        if(nums.length == 0)
        {
            return result;
        }
        int i = 0;
        int j = nums[0];
        while (i < nums.length)
        {

          
           
            if (i == nums.length - 1) 
            {
                break;

            }
            else if (Math.abs(nums[i] - nums[i + 1]) == 1)
            {
                build.add(nums[i]);
            }
            else if(build.isEmpty())
            {
                build.add(nums[i]);
                result.add(build.get(0).toString());
                build.clear();
            }

            if(Math.abs(nums[i] - nums[i + 1]) != 1 && build.size() >= 1)
            {
                build.add(nums[i]);
                result.add(build.getFirst() + "->" + build.getLast());
                build.clear();
            }
            
            
            i++;
            

        }
        int len = nums.length;

        if (build.isEmpty()) 
        {
            build.add(nums[len - 1]);
            result.add(build.get(0).toString());
            return result;
        }
        if (build.size() == 2)
        {
             build.add(nums[len - 1]);
             result.add(build.getFirst() + "->" + build.getLast());
             return result;
           
        }
        if (Math.abs(build.get(0) - nums[len-1]) == 1)
        {
            build.add(nums[len - 1]);
            result.add(build.getFirst() + "->" + build.getLast());
        }
        else if(build.size() == 2)
        {
            result.add(build.get(0).toString());
            result.add(build.get(1).toString());
        }
        

      
        return result;
    }
   

    public static void main(String[] args) 
    {
     
       List<String> res = Ranges();
        System.out.println(res);

    }

}