import java.util.Stack;


// import java.util.Scanner;
// import java.util.Vector;
// class program 
// {
//     //     System.out.println(calculateTip(100.0,0.20));
//     // }
//     // public static double calculateTip(double billAmount, double tipPercentage) {
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

public class program {

    public static boolean  validparanthesis(String s,int i, Stack<Character> stack) 
    {
      
         if (i == s.length() && stack.size() != 0)
        {
            return false;
        }

         if (i == s.length() && stack.isEmpty())
        {
            return true;
        }
        else if (stack.size() == 0)
        {
             stack.push(s.charAt(i));
             i++;
             return  validparanthesis(s , i, stack);
        }
        
       
       
       

        if( '(' == stack.peek() && ')' == s.charAt(i) )
        {
            stack.pop();
            i++;
        }
        else if ('{' == stack.peek() && '}' == s.charAt(i))
         {
             stack.pop();
             i++;
         }
        else if ('[' == stack.peek() && ']' == s.charAt(i))
        {
            stack.pop();
            i++;
        }
        else
        {
            stack.push(s.charAt(i));
             i++; 
        }      
         

      
        return  validparanthesis(s , i, stack);
    

    }
    
    public static void main(String[] args) {
        String s = "([)]";
        int i = 0;
      
        Stack<Character> stack = new Stack<>();
       boolean res = validparanthesis(s,i,stack);
        System.out.println(res);
    }

}
