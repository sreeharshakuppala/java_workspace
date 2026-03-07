



public class lastwordlength {
   

    public static int  wordlength()
     {
        String s = new String();
          s = "hello dog   boy ";
                 int length_last_word = 0;
          int j = s.length()-1;
           while(j >= 0)
           {
              
               if(s.charAt(j) != ' ')
               {
                   
                   length_last_word++;
               }
               else if (s.charAt(j) == ' ' && length_last_word != 0)
               {
                   break;
               }
               j--;
           }



           return length_last_word;




     }
    public static void main(String[] args) {
        int res = wordlength();
        System.out.println(res);

    }

}

