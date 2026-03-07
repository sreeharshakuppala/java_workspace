import java.util.HashMap;

public class isomorphicString
{
    public static boolean isomorphicString() 
    {
        String s = "paper";
        String t = "title";

        HashMap<Character, Character> map1 = new HashMap<Character, Character>();
        HashMap<Character, Character> map2 = new HashMap<Character, Character>();

        if (s.length() != t.length()) {
            return false;
        }
       
        int i = 0;

        while (i < s.length()) {

            map1.put(s.charAt(i), t.charAt(i));
            i++;
        }

        i = 0;
        while (i < s.length()) {

            map2.put(t.charAt(i), s.charAt(i));
            i++;
        }
        int j = 0;
        while (j < t.length()) {

            if (!(map1.containsKey(s.charAt(j)) && map1.get(s.charAt(j)).equals(t.charAt(j)))) {
                return false;
            } else if (!(map2.containsKey(t.charAt(j)) && map2.get(t.charAt(j)).equals(s.charAt(j)))) {
                return false;
            }

            j++;

        }

        return true;
    }
    
    public static void main(String[] args) {
        boolean res = isomorphicString();
        System.out.println(res);
    }

}