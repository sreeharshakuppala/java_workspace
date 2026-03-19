import java.util.ArrayList;
import java.util.List;

public class pascalstriangle
{
    
    public static void main(String[] args)
     {
         List<Integer> singleList = new ArrayList<>();
       List<List<Integer>> nestedList = new ArrayList<>();
      
       singleList.add(1);
       nestedList.add(new ArrayList<>(singleList));

       singleList.add(1);
       nestedList.add(new ArrayList<>(singleList));
       singleList.clear();
      
       
        int num = 5;
        int i = 1;
        while (i < num-1) 
        {
           singleList.add(1);
            int j = 0;
           
            while (j < nestedList.get(i).size() - 1) 
            {

             int value1 = nestedList.get(i).get(j);
             singleList.add(value1 + nestedList.get(i).get(j + 1));

             j++;
             
                
            }
            singleList.add(1);

            nestedList.add(new ArrayList<>(singleList));
            singleList.clear();

            i++;
            
        }
       
        System.out.print(nestedList);
      
    }
}