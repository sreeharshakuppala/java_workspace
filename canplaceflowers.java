



public class canplaceflowers {


     public static boolean  placeFlowers()
     {
         int[] array = {0,1,0};
         int n = 1;

         int plant = 0;
        
         int left = 2;
        int current = 2;
        int right = 2;
         int i = 0;
         while (i < array.length) 
         {

             current = array[i];

             if (i == array.length - 1) {
                 right = 2;
             } else {
                 right = array[i + 1];
             }
               
             if(array.length == 1 && array[i] == 0)
             {
                 array[i] = 1;
                 plant += 1;
             }
             else if (i == 0 && current == 0 && right == 0) {
                 array[i] = 1;
                 plant += 1;
             } else if (left == 0 && current == 0 && right == 0) {
                 array[i] = 1;
                 plant += 1;
             } else if (i == array.length - 1 && left == 0 && right == 0) {
                 array[i] = 1;
                 plant += 1;
             }

             i++;
             left = array[i - 1];

         }
         
         if(n <= plant)
         {
            return true;
         }
         else
        {
            return false;
        }
          

     }

    public static void main(String[] args) 
    {
        boolean res = placeFlowers();
        System.out.println(res);
        

        
    }

   
           
    

}
