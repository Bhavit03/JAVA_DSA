import java.util.Arrays;
import java.util.Scanner;

public class onedarray {
    public static void main(String[] args) {
//        1D array
        int[] arr1 = {1,5,9};
        System.out.println(Arrays.toString(arr1));
//        inputting and outputting 1d array
        Scanner in = new Scanner(System.in);
        int[] arri = new int[5];
        for (int i=0;i<arri.length; i++){
            arri[i]= in.nextInt();
        }
        System.out.println(Arrays.toString(arri));
//          Mutability of arrays
        arr1[0] = 12;
        arr1[2]= 0;
        System.out.println(Arrays.toString(arr1));
    }
}
