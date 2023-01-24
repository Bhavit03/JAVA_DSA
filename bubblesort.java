import java.util.Arrays;

public class bubblesort {
    public static void main(String[] args) {
        int[] arr={23,34,43,0,0,-1,-2,-78};
        bubblesort(arr);
        System.out.println(Arrays.toString(arr));
    }
    static void bubblesort(int[] arr){
        boolean swapped;
        for (int i=0;i< arr.length;i++){   //RUNNING STEPS N-1 TIMES
            swapped=false;
            for (int j=1;j< arr.length-i;j++){  // for each steps max element will come to last
                // Swap if element is smaller than previous
                if (arr[j]<arr[j-1]){
                    int temp = arr[j];
                    arr[j] = arr[j-1];
                    arr[j-1]=temp;
                    swapped=true;
                }
            }
//    if you did not swap for particular value of i, the array is sorted, break the program
            if (swapped==false){
                break;
            }
        }
    }
}
