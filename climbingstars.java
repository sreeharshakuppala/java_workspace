

public class climbingstars
{
    public static int climbing()
    {
        int x = 6;
        int a = 1;
        int b = 2;
        int c = 1;
        int num = 0;
        for (int i = 1; i <= x; i++) 
        {
            num = a;
            c = a + b;
            a = b;
            b = c;

        }

        return num;
    }
    
    public static void main(String[] args) {
        int res = climbing();
        System.err.println(res);
    }
}