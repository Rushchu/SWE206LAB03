/**
 * Sorter
 */
public class Sorter {

    public static void main(String[] args) {
        
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