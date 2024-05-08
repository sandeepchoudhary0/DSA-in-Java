import java.util.*;
import java.util.math;
public class Exercise {
    public static int sumDiagonalElements(int[][] array){

        int sum=0;

        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length; j++) {
                while ( i==j ) 
                {
                    sum=sum+array[i][j];
                    break;
                }
            }
        }
        return sum;
    }
}
{}
