


public class findstringfirstoccurance
{

public static int  firstoccurance() 
    {

        String haystack = "hello";
        String needle = "ll";
       
             
          return  haystack.indexOf(needle);       

    }
    
    public static void main(String[] args) {
       
      
      
       int res = firstoccurance();
        System.out.println(res);
    }
}