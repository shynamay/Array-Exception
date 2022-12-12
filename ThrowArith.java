public class ThrowArith
{
    public static void main(String args[])
    {
        int x = 5;
        int y = 0;
        if (y<1)
        {
            throw new ArithmeticException ("Error");
        }
        else
             System.out.println(x/y);
    }
}
