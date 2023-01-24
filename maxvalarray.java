import java.util.Arrays;
import java.util.Scanner;

public class maxvalarray {
    public static void main(String[] args) {
//        Take array from user and return maximum value of array
        Scanner in = new Scanner(System.in);
        System.out.println("enter length of array");
        int l = in.nextInt();
        int[] arr = new int[l];
        System.out.println("Enter elements of array");
        for (int i = 0; i < l; i++) {
            arr[i] = in.nextInt();
        }
        System.out.println(Arrays.toString(arr));
        System.out.println(maxval(arr));
    }
//          FUNCTION GOES HERE
    static int maxval(int arr[]) {
        if (arr.length==0)
            return -1;
        int max = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }
        return max;
    }
}
