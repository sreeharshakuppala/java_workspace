
class reverseString
{
  public static char[] reverse(char[] s,int i,int j)
    {
        
        // if(i>=j)
        // {
        //     return s;
        // }
        // char c = s[i];
        // s[i] = s[j];
        // s[j] = c;
        
        // return rev(s,i+1,j-1);
          while(i < j)
        {
            char copy = s[i];
            
            s[i] = s[j];
             s[j] = copy;
             i++;
             j--;
        }
     return s;
        
        
    }
  

    public static void main(String[] args) 
    {

        char[] s = {'H','a','n','n','a','h'};
         int i = 0;
        int j = s.length - 1;
        System.out.println(reverse(s,i,j));
     
    }

}