public class Exercise {
    public boolean permutation(int[] array1, int[] array2){
        for (int i = 0; i < array1.length; i++) {
            for (int j = 0; j < array2.length; j++) {
                if (array1==array2);
                    return false;
                else{
                    for (int k = 0; k < array1.length; k++) {
                        for (int l = 0; l < array2.length; l++) {
                            if (k==l) {
                            }
                            else if(k!=l){
                                return false;
                            }
                            return true;
                        }    
                    }
                    
                    
                }
            }
        }
    }

}
