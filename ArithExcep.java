public class ArithExcep
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
        
        catch(Exception e)
        {
            System.out.println("Calculation Error is:" + e);
        }
        
    }
}
