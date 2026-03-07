import java.util.HashMap;

public class anagram{
   
    // public boolean isAnagram(String s, String t) 
    // {

    //     if(s.length() != t.length()) //1
    //     {
    //        return false;//1
    //     }
    //        ArrayList<Character> str = new ArrayList<Character>();
    //     int i = 0;//1
    //     while (i<s.length()) //1,2,3--> n^2 times
    //     { 
            
    //         str.add(s.charAt(i));// n
    //         i++;//1
    //     }

        
    //     int j = 0;//1
    //     while (j < t.length())//n -> n^2
    //     {
    //         int index = str.indexOf(t.charAt(j));//n
    //         if (index == -1)
    //         {
    //             break;  //1
    //         }
    //         else 
    //         {
    //             str.remove(index);//n
    //         }
    //         j++;//1

    //     }
        
      
       
    //    return str.size() == 0;


    public static boolean Anagram() {

        String s = "aabbbb";
        String t = "aaaabb";

        if (s.length() != t.length())//1
        {
            return false;
        }
        HashMap<Character, Integer> str = new HashMap<Character,Integer>();
        int count = 0;//1
        int i = 0;//1
        while (i < s.length()) //n-->3n
        {
            count = 0;//1

            if (str.containsKey(s.charAt(i))) //1
            {
                count = str.get(s.charAt(i));//1
            }
            str.put(s.charAt(i), ++count);//1

            i++;

        }
        // count = t.length();
        int j = 0;
        while (j < t.length())//->n times(3n)
        {
            if (str.containsKey(t.charAt(j))) {
                count = str.get(t.charAt(j));
                count--;
                str.put(t.charAt(j), count);
            } else {
                return false;
            }
            if (count < 0) {
                return false;
            }

            j++;

        }

        return true;

    }
    
    public static void main(String[] args) {
        boolean res = Anagram();
        System.out.println(res);
    }
   
}

