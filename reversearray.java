import java.util.Arrays;

public class reversearray {
    public static void main(String[] args) {
        int[] array = {1,2,3,4,5};
        System.out.println(Arrays.toString(rev(array)));
    }
//    FUNCTION GOES HERE
//    LOGIC: SWAP NUMBERS FROM EXTREMES,INCREASE START AND DECREASE END
    static int[] rev(int[] arr){
        int start =0;
        int end = arr.length-1;
        while (start<end){
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
        return arr;
    }
}
