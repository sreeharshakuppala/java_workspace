
import java.awt.image.RescaleOp;
import java.util.ArrayList;
import java.util.List;


//     //     double sum = billAmount * tipPercentage;
//     //     return sum;
//     // }
//     public static void main(String[] args) 
//     {
//         List<Double> numbers = new ArrayList<Double>();
//         List<Double> numbers1 = new LinkedList<>();
//         List<Double> numbers2 = new Vector<>();
//         listMethod(numbers1);
//         listMethod(numbers2);
//         Hash();
//     }
//     public static void listMethod(List<Double> numbers)
//     {
//         System.out.println(numbers);
//     }
//     public static void Hash()
//     {
//         Scanner reader = new Scanner(System.in);
//         HashMap<Integer, String> studentDetails = new HashMap<Integer, String>();
//         studentDetails.put(1, "Harsha");
//         studentDetails.put(2, "Naveen");
//         studentDetails.put(3, "Giri");
//         System.out.println("Enter any number!");
//         Integer key = reader.nextInt();
//         if(studentDetails.containsKey(key))
//         {
//             System.out.println(studentDetails.get(key));
//         }
//         else
//         {
//             System.out.println("Student not found");
//         }
//     }
// }




public class program 
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
