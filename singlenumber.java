






import java.util.HashMap;

public class singlenumber
{
      public static  int  single()
   {
   
    HashMap<Integer,Integer> mapping = new HashMap<Integer,Integer>();
    
    int[] array = {4,1,2,1,2};
    int i = 0;
    int count = 0;
    while (i < array.length)
    {
        count = 1;
        if (mapping.containsKey(array[i])) {
            count = mapping.get(array[i]);
            count += 1;
        }

        mapping.put(array[i], count);

        i++;
    }
    i = 0;
    while (i < array.length)
    {

        if (mapping.get(array[i]) == 1)
        {
            return array[i];
        }

        i++;

    }
    


    return 0;

   }

    
   

    public static void main(String[] args) {
       
      
      
       int res = single();
        System.out.println(res);
    }
}