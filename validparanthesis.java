import java.util.Stack;

public class validparanthesis
{
    

    public static boolean valid()
    {

        String s = "{([])}";
     
    Stack<Character> stack = new Stack<>();

    int i = 0;

    while(i < s.length())
    {

      
        int mark = 0;
        if (stack.size() == 0) 
        {
            stack.push(s.charAt(i));
            mark = 1;

        }

        if ('(' == stack.peek() && ')' == s.charAt(i))
        {
            stack.pop();
            mark = 1;
        }
        else if ('{' == stack.peek() && '}' == s.charAt(i)) 
        {
            stack.pop();
            mark = 1;
        } 
        else if ('[' == stack.peek() && ']' == s.charAt(i)) 
        {

            stack.pop();
            mark = 1;
        }

        if (stack.size() != 0 && mark == 0)
        {
            stack.push(s.charAt(i));
        }
        
        
        i++;

    }

    if (stack.isEmpty())
    {
        return true;
    }

    return false;
    }

    public static void main(String[] args) {
        boolean res = valid();
        System.err.println(res);
    }
    




     //#RecursionMethod

    //    public static boolean  validparanthesis(String s,int i, Stack<Character> stack) 
    // {
      
    //      if (i == s.length() && stack.size() != 0)
    //     {
    //         return false;
    //     }

    //      if (i == s.length() && stack.isEmpty())
    //     {
    //         return true;
    //     }
    //     else if (stack.size() == 0)
    //     {
    //          stack.push(s.charAt(i));
    //          i++;
    //          return  validparanthesis(s , i, stack);
    //     }
        
       
       
       

    //     if( '(' == stack.peek() && ')' == s.charAt(i) )
    //     {
    //         stack.pop();
    //         i++;
    //     }
    //     else if ('{' == stack.peek() && '}' == s.charAt(i))
    //      {
    //          stack.pop();
    //          i++;
    //      }
    //     else if ('[' == stack.peek() && ']' == s.charAt(i))
    //     {
    //         stack.pop();
    //         i++;
    //     }
    //     else
    //     {
    //         stack.push(s.charAt(i));
    //          i++; 
    //     }      
         

      
    //     return  validparanthesis(s , i, stack);
    

    // }
    
    // public static void main(String[] args) {
    //     String s = "([)]";
    //     int i = 0;
      
    //     Stack<Character> stack = new Stack<>();
    //    boolean res = validparanthesis(s,i,stack);
    //     System.out.println(res);

}