import java.util.Arrays;

/**
 * Sorter
 */
public class Sorter {

    public static void main(String[] args) {
      int[] arr1 = {5, 7, 3, 13, 2};
      int[] arr2 = {12, 18, 2, 9, 5};
      System.out.println("Array 1 BEFORE INSERTION SORT");
      System.out.println(Arrays.toString(arr1));
      arr1 = sortInsertion(arr1);
      System.out.println("Array 1 AFTER INESRTION SORT");
      System.out.println(Arrays.toString(arr1));
      System.out.println("Array 2 BEFORE SELECTION SORT: " + Arrays.toString(arr2));
      selectionSort(arr2);
      System.out.println("Array 2 AFTER SELECTION SORT: " + Arrays.toString(arr2));
    }
     public static int[] sortInsertion(int [] sort_arr){

        for(int i=0;i<sort_arr.length;++i){
  
          int j = i;
          
          while(j > 0 && sort_arr[j-1]>sort_arr[j]){
  
            int key = sort_arr[j];
            sort_arr[j] = sort_arr[j-1];
            sort_arr[j-1] = key;
            j = j-1; 
  
          }
        }
        return sort_arr;
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