import java.util.*;

public class Pro1 {
    public static void main(String[] args) {
        int sum=0;
        Scanner input= new Scanner(System.in);
        System.out.println("Enter the number of Days: ");
        int Days= input.nextInt();
        int[] Temp= new int[Days];
        for (int i = 0; i < Days; i++) {
            Scanner consol = new Scanner(System.in);
            System.out.println("The Temperature of day "+(i+1)+ " is: ");
            Temp[i]= consol.nextInt();
            sum=sum+Temp[i];
            
        }
        int average= sum/Days;
        System.out.println("The average temperature of all days is :"+average);
        for (int i = 0;  i < Temp.length; i++) {
            if (Temp[i]>average) {
                System.out.println("The temperature more then average temperature is "+Temp[i]+", on Day "+(i+1)+".");
                
            }
            
        }
        //System.out.println("The total temperature is "+sum);
    }
}
