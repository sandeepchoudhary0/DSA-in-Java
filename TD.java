
//Constructor for a Two Dimentional Array
public class TD {
    int arr[][]=null;

    public TD (int row, int column){
        arr = new int[row][column];
        for (int r=0; r <arr.length; r++){
            for(int col=0; col<arr.length; col++){
                arr[r][col]=Integer.MIN_VALUE;
            }

    }
    }
    //Insertion Of Value in a Two Dimentional Array
    public void insertValueInTheArray(int row, int column, int value) {
        try {if(arr[row][column] == Integer.MIN_VALUE){
            arr[row][column]= value;
            System.out.println("Value added succesfully. ");
            }
            
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Invalid Index. ");
        }
    }
    //Searching Value In a Two Dimentional Array
    public void ValuetoSearch(int value){
        try {for (int i = 0; i < arr.length; i++)
            for (int j = 0; j < arr.length; j++) {
                if (arr[i][j]==value)
                {
                   System.out.println("Value Found Successfully. ");
                   
               }
                
            }
            
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Invalid . ");
        }
    }
    //Accesing In a Two Dimentional Array
    public void ValueToAccess(int row, int column) {
        try {System.out.println("The Value at row "+row+" and Column "+column+" Is, "+arr[row][column]);
            
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Invalid Index. ");
        }
        
        
    }
    //Traversing In a Two Dimentional Array
    public void TraversingOfArray(){
        try {for (int i = 0; i < arr.length; i++)
            for (int j = 0; j < arr.length; j++) {
                {
                   System.out.println(arr[i][j]);
                   
               }
                
            }
            
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Invalid . ");
        }
    }
    //Deletion of Value From a Two Dimentional Array
    public void ValueToDelete(int value){
        try {for (int i = 0; i < arr.length; i++)
            for (int j = 0; j < arr.length; j++) {
                if (arr[i][j]==value)
                {arr[i][j]=Integer.MIN_VALUE;
                   System.out.println("Value Deleted Succesfully ");
                   
               }
                
            }
            
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Invalid . ");
        }
    }
        public static void main(String[] args) {
            TD tda= new TD(3, 3);
            tda.insertValueInTheArray(0, 0, 1);
            tda.ValuetoSearch(1);
            tda.ValueToAccess(0, 0);
            tda.TraversingOfArray();
            tda.ValueToDelete(1);
        } }
        
    
