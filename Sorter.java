/**
 * Sorter
 */
public class Sorter {

    public static void main(String[] args) {
        
    }
     public static void sortInsertion(int [] sort_arr){

        for(int i=0;i<sort_arr.length;++i){
  
          int j = i;
          
          while(j > 0 && sort_arr[j-1]>sort_arr[j]){
  
            int key = sort_arr[j];
            sort_arr[j] = sort_arr[j-1];
            sort_arr[j-1] = key;
            j = j-1; 
  
          }
        }
      }
    public static void selectionSort(int[] array) { 
        int n = array.length; 
        for (int i = 0; i < n-1; i++) 
        { 
            int index = i; 
            for (int j = i+1; j < n; j++) 
                if (array[j] < array[index]) 
                    index = j; 

            int temp = array[index]; 
            array[index] = array[i]; 
            array[i] = temp; 
        }
    }
}