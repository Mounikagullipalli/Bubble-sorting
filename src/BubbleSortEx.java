import java.lang.reflect.Array;
import java.util.Arrays;

public class BubbleSortEx {
    public static void main(String[] args) {
        int[] arr= {2, 1, 0, 7, 8, 89, 67};
        System.out.println("array before sorting"+ Arrays.toString(arr));
        int n = arr.length;
        int temp = 0;
        for(int i = 0;i<n-1;i++){ // iteration for each pass
            for(int j=0;j<n-1;j++){ // checking for each pass
                if (arr[j]>arr[j+1]){
                    // swap elements
                    temp =arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]= temp;
                }
            }
        }
        System.out.println("array after sorting"+Arrays.toString(arr));
    }
}
