import java.util.*;
public class best {
    public static int[] findTopTwoScores(int[] array){
      int first= Integer.MIN_VALUE;
      int second= Integer.MIN_VALUE;
      for (int score : array) {
        if (score>first) {
          second=first;
          first=score;
        } else if (score>second && score<first){
          first=second;
          
        }
      }
      return new int[]{first+second};
        System.out.println(first+second);
    }
  
  }
