import java.util.*;
public class Exercise {
    public static void main(String[] args) {
        
        Scanner input= new Scanner(System.in);
        System.out.println("Enter the Length of array:");
        int length= input.nextInt();
        int[] MyArray=new MyArray[length];
        for (int i = 0; i < length; i++) {
            System.out.println(length);
            Scanner console= new Scanner(System.in);
            
            System.out.println("Print the element of array :");
            MyArray[i]= console.nextInt();
            
            
        }
        for (int i = 0; i < 2; i++) {
            int[] mid;
            mid[i]=MyArray[i+1];
            System.out.println(MyArray);
        }
            
        }
    }

