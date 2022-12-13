import java.util.Arrays;
import java.util.Collections;

public class MaxArray {
    public static void main(String[] args) {

        Integer[] numA = {1,2,3 };
        Integer[] numB = {1,5,2 };
        Integer[] numC = {9,5,2,3, 7 };
      
        int max = Collections.max(Arrays.asList(numA));
        System.out.println("Output: " + max);
        int max1 = Collections.max(Arrays.asList(numB));
        System.out.println("Output: " + max1);
        int max2 = Collections.max(Arrays.asList(numC));
        System.out.println("Output: " + max2);
    }
}