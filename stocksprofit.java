


public class stocksprofit
{


    public static int profit()
    {
         int[] array = {2,4,1};
        int buy = array[0];
        int profit = 0;
        int sell = 0;
        int j = 0;
        int i = 0;
        while (i < array.length && j < array.length)
        {

            if (array[i] < buy) 
            {
                buy = array[i];
                j = i + 1;
            }
            if (j == array.length)
            {
                break;
            }
           
            sell = array[j];
            
            if (sell - buy > profit)
            {
                profit = sell - buy;
            }
           
            j++; 
            i++;

        }
        
        if (profit != 0)
        {
            return profit;
        }
        
        
 
        return 0;
    }

    public static void main(String[] args) 
    {

          int res = profit();
        System.out.println(res);
  
    }



}