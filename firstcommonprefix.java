


import java.util.Arrays;

public class firstcommonprefix {
     public static String commonprefix() {

        String[] strs = {"flower","flow","fleet"};
        StringBuilder builder = new StringBuilder();
        String reference = strs[0];
        String result = "";
        int i = 1;
        int j = 0;
        if (strs.length == 1) 
        {
            return reference;
        }
        if (Arrays.asList(strs).contains(result))
        {
            return result;
        }
        // else if (strs[i].charAt(j) != reference.charAt(j))
        // {
        //     return result;
        // }

      
        while (i < strs.length) 
        {
            j = 0;
            while (j < strs[i].length() && j < reference.length()) 
            {
                if (reference.charAt(j) == strs[i].charAt(j)) 
                {
                    builder.append(strs[i].charAt(j));
                } 
                else 
                {
                    break;
                }
                j++;

            }
            result = builder.toString();
            builder.setLength(0);
            reference = result;
            i++;
            
        }


        return result;
    }

    public static void main(String[] args) {
        String res = commonprefix();
        System.out.println(res);

    }

}

