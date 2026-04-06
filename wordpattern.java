import java.util.HashMap;




//two hashmap pattern method

class wordpattern
{

    public static boolean word()
    {
        String pattern = "jquery";
        String s = "jquery";
        HashMap<Character, String> mapping1 = new HashMap<>();
        StringBuilder builder1 = new StringBuilder();
        HashMap<String, Character> mapping2 = new HashMap<>();
        StringBuilder builder2 = new StringBuilder();

        int j = 0;
        int i = 0;

        while (i < s.length() && j < pattern.length()) {

            if (s.charAt(i) != ' ') {
                builder1.append(s.charAt(i));

            }
            if (builder1.length() == s.length() - 1 && pattern.length() > 1) {
                return false;
            }
            if (s.charAt(i) != ' ') {
                builder2.append(s.charAt(i));

            }

            if (s.charAt(i) == ' ' || i == s.length() - 1) {

                if (mapping1.containsKey(pattern.charAt(j))
                        && !(mapping1.get(pattern.charAt(j))).equals(builder1.toString())) {
                    return false;

                }

                mapping1.put(pattern.charAt(j), builder1.toString());

                if (mapping2.containsKey(builder2.toString())
                        && !(mapping2.get(builder2.toString())).equals(pattern.charAt(j))) {
                    return false;

                }
                mapping2.put(builder1.toString(), pattern.charAt(j));

                builder1.setLength(0);
                builder2.setLength(0);
                j++;

            }

            i++;

        }
        if (i < s.length()) {
            return false;
        }

        return true;
    }

    public static void main(String[] args) {

        boolean res = word();
        System.out.println(res);

    }



}