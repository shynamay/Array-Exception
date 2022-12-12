public class JExcep
{
    public static void main(String args[])
    {
     int [] MyArray = {2,3,5,7,23,45};
              //index  0,1,2,3,4, 5  
     try
     {
         System.out.println(MyArray[7]);    
     }
     
     catch(Exception e)
     
     {
         System.out.println("The Error is:" + e);
     }
     
        
    }
}
