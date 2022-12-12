public class ProgException
{
    public static void main(String args[])
    {
        int x = 5;
        int y = 0;
        try
        {
            int ans = x/y;
            System.out.println(ans);    
        }
        
        catch(ArithmeticException e)
        {
            System.out.println("Invalid Calculation");
        }
        
    }
}
