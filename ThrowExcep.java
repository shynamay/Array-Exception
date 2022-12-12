public class ThrowExcep
{
    public static void main(String args[])
    {
        int [] MyArray =  {1,2,3,4,5,6};
        int index = 8;
        
        if (index<0 || index>5)
        {
            throw new ArrayIndexOutOfBoundsException ("Invalid Array Index");
        }
        System.out.println(MyArray[index]);
        
    }
}
