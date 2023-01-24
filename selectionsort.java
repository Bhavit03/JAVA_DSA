

import java.util.Arrays;
public class selectionsort {
    public static void main(String[] args) {
        int[] arr={3,1,5,4,2};
        selection(arr);
        System.out.println(Arrays.toString(arr));

    }
    static void selection(int [] arr){
        for (int i = 0; i < arr.length; i++) {
//   find max element in remaining and swap with correct index
            int last= arr.length-i-1;
            int maxindex= getmaxindex(arr,0,last);
            swap(arr,maxindex,last);
        }
    }
    private static int getmaxindex(int[] arr, int start, int end) {
        int max=start;
        for (int i = 0; i <= end; i++) {
            if (arr[max]<arr[i]){
                max=i;
            }
        }
        return max;
    }
    static void swap(int[] arr,int first,int second){
        int temp=arr[first];
        arr[first]=arr[second];
        arr[second]=temp;
    }
}
