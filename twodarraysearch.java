import java.util.Arrays;

public class twodarraysearch {
    public static void main(String[] args) {
        int[][] arr= {
            {2,3,4},
            {3,5,66,9,1},
            {7,3},
            {100}
        };
        int target = 3;
        search(arr,target);
        int ans =maximumm(arr);
        System.out.println(ans);
    }
/**
 * 2D ARRAY LINEAR SEARCH FUNCTION
 * here i used void function to check all occurrences of target, in return the program gets terminated when founds target once
 */
static void search(int[][] arr, int target){
        for (int i=0;i<arr.length;i++){
            for (int j=0;j<arr[i].length;j++){
                if (arr[i][j]==target)
                    System.out.println("row "+i+" column "+j);
            }
            }
        }

//    FUNCTION FOR MAXIMUM ELEMENT IN 2D ARRAY
    static int maximumm(int[][] arr){
        int max= Integer.MIN_VALUE;
        for(int i=0;i<arr.length;i++){
        for (int j=0;j<arr[i].length;j++){
            if (arr[i][j]>max)
                max = arr[i][j];
        }
    }
    return max;
    }
}
