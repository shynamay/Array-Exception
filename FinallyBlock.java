public class FinallyBlock
{
    public static void main(String args[])
    {
        try
        {
            int number = 5/0;
        }
        
        catch (ArithmeticException e)
        {
            System.out.println(" The Exception is:" + e.getMessage());
            System.out.println(" Ang Exception eto:" + e);
        }
        
        finally
        {
            System.out.println("This Statement is Finally Block");
        }
    }
}