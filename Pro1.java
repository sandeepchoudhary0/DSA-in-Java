import java.util.*;

public class Pro1 {
    public static void main(String[] args) {
        int sum=0;
        Scanner input= new Scanner(System.in);
        System.out.println("Enter the number of Days: ");
        int Days= input.nextInt();
        for (int i = 0; i < Days; i++) {
            Scanner consol = new Scanner(System.in);
            System.out.println("The Temperature of day "+(i+1)+ " is: ");
            int Temp= consol.nextInt();
            sum=sum+Temp;
            
        }
        System.out.println("The total temperature is "+sum);
    }
}
