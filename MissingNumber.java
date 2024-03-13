public class missing {
    
    static int findMissingNumberInArray(int[] arr) {
        int sum=0;
        int a=arr.length*(arr.length+1)/2;//sum of all natural number to the element here arr.length
        for (int i = 0; i < arr.length; i++) {
            sum=sum+i;    
            }
            int b=a-sum;
            if (b==0) {
                System.out.println();
                
            } else {
                System.out.println(b);
                
            }  
            return b;              
            }

        }
