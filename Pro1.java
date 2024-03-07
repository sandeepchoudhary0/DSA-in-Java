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
            Temp[i]= consol.nextInt();
            sum=sum+Temp[i];
            
        }
        {int average= sum/Days;}
        for (int i = 0;  i < Temp.length; i++) {
            if (Temp[i]>average) {
                System.out.println("The temperature more then average temperature are on "+Temp[i]+". Days "+i+".");
                
            }
            
        }
        System.out.println("The total temperature is "+sum);
    }
}
