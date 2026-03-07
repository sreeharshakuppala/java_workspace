public class validpalindrome {

     public static boolean validPalindrome() {

    

        String original = "race a car";
        String upperString = original.toUpperCase();

       
        int i = 0;
        int j = upperString.length() - 1;
        while (i < j) {

            if (upperString.charAt(i) == upperString.charAt(j)) {
                i++;
                j--;
            }
            else if (!(upperString.charAt(i)>=65 && upperString.charAt(i)<=90) && !(upperString.charAt(i) >=48 && upperString.charAt(i) <=57))
            {
                i++;
            }
            else if (!(upperString.charAt(j)>=65 && upperString.charAt(j)<=90) && !(upperString.charAt(j) >=48 && upperString.charAt(j) <=57))
            {
                        j--;
            }
          
            else {
                return false;
            }

        }
        return true;

    }

    public static void main(String[] args) {
        boolean res = validPalindrome();
        System.out.println(res);

    }
}
