public class ArrayException
{
    public static void main(String args[])
    {
     int [] MyArray = {2,3,5,7,23,45};
              //index  0,1,2,3,4, 5  
     try
     {
         System.out.println(MyArray[4]);    
     }
     
     catch(ArrayIndexOutOfBoundsException e)
     
     {
         System.out.println("index was not found");
     }
     
        
    }
}
