public class agnosticbinarysearch {
    public static void main(String[] args) {
        int arr[] = {123,120,98,87,78,40,30,23,14,0,-3};
        int target = 78;
        int ans = binarysearchfun(arr, target);
        System.out.println(ans);
    }

    //    RETURNS INDEX OF TARGET AND -1 IF DOSEN'T EXISTS
//    FOR ARRAY SORTED IN ASCENDING ORDER
    static int binarysearchfun(int[] arr, int target) {
        int start = 0;
        int end = arr.length - 1;
        boolean isasc = arr[start] < arr[end];
        if (isasc) {
            while (start <= end) {   //FOR ASCENDING SORTED ARRAY
//                int mid = (start+end)/2;  FOR LARGE NUMBERS IT MAY EXCEED THE RANGE OF INTEGER IN JAVA
                int mid = start + (end - start) / 2;
                if (target < arr[mid]) {
                    end = mid - 1;
                } else if (target > arr[mid]) {
                    start = mid + 1;
                } else {
                    return mid;
                }
            }
            return -1;
        }
        else{
            while (start<=end){
                int mid = start+(end-start)/2;
                if (target>arr[mid])
                    end=mid-1;
                else if (target<arr[mid]) {
                    start=mid+1;
                }
                else
                    return mid;
            }
            return -1;
        }
    }
}
