import java.util.*;
public class OD {
    int arr[] = null;
  
    public OD(int sizeOfArray) {
      arr = new int[sizeOfArray];
      for (int i=0; i<arr.length; i++) {
        arr[i] = Integer.MIN_VALUE;
      }
    }
  
    public void insert(int location, int valueToBeInserted){
      try {
        if (arr[location]==Integer.MIN_VALUE)
          {arr[location]= valueToBeInserted;
          System.err.println("Value successfully inserted. ");}
        else {
          System.err.println("This location is already filled.");
          }
      } catch (ArrayIndexOutOfBoundsException e) {
        System.err.println("This index Does not exist. ");
      }
    }
    
    public void traverseArray() {
      try {for(int i=0; i<arr.length ;i++){
        System.out.print(arr[i]+" ");
      }  
      } catch (Exception e) {
        System.out.println("Array no longer exist!");
      }
    }
    public void searchInArray(int valueToSearch) {
      for(int i=0; i<arr.length;i++){
        if (arr[i]==valueToSearch){System.out.println(" "+"\n"+"Value is present!");
        
      }
        else {System.out.println("\n"+"Value isn't present!");
      } 
      }
    }
    public void deleteValue(int valueToDeleteIndex) {
      for(int i=0; i<arr.length;i++){
        if (arr[i]==valueToDeleteIndex){
        arr[i]=Integer.MIN_VALUE;
        System.out.println("\n"+"Value Deleted");
      }
        else {System.out.println("\n"+"Value isn't present!");
      } 
      }
    }
    public static void main(String[]args) {
    OD oda=new OD(3) ;
        oda.insert(0, 1);
        oda.insert(1, 2);
        oda.traverseArray();
        oda.searchInArray(2);
        oda.deleteValue(2);
        oda.traverseArray();
    }
    
}
    
