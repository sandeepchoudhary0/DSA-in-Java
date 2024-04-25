import java.util.*;
public class main {
    public static void main(String[] args) {
        ArrayList ar = new ArrayList(Arrays.asList(13,12,12));
        System.out.println(ar);
        //Insertion
        ar.add(2,3);
        System.out.println(ar);
        //Accessing
        System.out.println(ar.get(0));
        System.out.println(ar.get(1));
        //Traversing
        for (int i = 0; i <ar.size(); i++) {
            System.out.println( ar.get(i));}
        ArrayList<String> stringlist = new ArrayList<String>(Arrays.asList("A","B","C","D"));
        for(String letters:stringlist){
            if (letters.equals("A")) {
                System.out.println("It is present in the LIST");
                break;
                
            }
            System.out.println(letters.indexOf("A"));
        }
        //Deletion
        stringlist.remove("A");
        System.out.println(stringlist);
        stringlist.remove(1);
        System.out.println(stringlist);
        stringlist.remove(2);
        System.out.println(stringlist);
        }
    }
