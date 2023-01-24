import java.util.Arrays;
import java.util.Scanner;

public class twodarray {
    public static void main(String[] args) {
//        2D array
        int[][] arr = new int[][]{
                {3, 5, 7},
                {6, 8, 9},
                {7, 3, 6}
        };
        for (int[]a : arr){
            System.out.println((Arrays.toString(a)));
        }
//        inputing and outputting 2D array
        Scanner in = new Scanner(System.in);
        int[][] arr2 = new int[3][3];
        for (int row=0; row< arr2.length;row++ ){
            for (int col = 0; col< arr2[row].length;col++){
                arr2[row][col] = in.nextInt();
            }
        }
//        outputt
        for (int[]a : arr2){
            System.out.println(Arrays.toString(a));
        }
    }
}
