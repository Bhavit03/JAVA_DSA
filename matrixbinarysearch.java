import java.util.Arrays;

public class matrixbinarysearch {
    public static void main(String[] args) {
        int[][] arr = {
                {1,2,3,4},
                {5,6,7,8},
                {9,10,11,12},
                {13,14,15,16}
        };
        int target=12;
        System.out.println(Arrays.toString(search(arr,target)));
    }
    static int[] search(int[][] mat,int target){
        int r=0;
        int c=mat.length-1;
        int[] arr={-1,-1};
        while (r< mat.length && c>=0){
            if (mat[r][c]==target)
                return new int[]{r,c};
            if (mat[r][c]<target)
                r++;
            if (mat[r][c]>target)
                c--;
        }
        return arr;
    }
}
