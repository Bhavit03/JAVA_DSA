public class minelement {
    public static void main(String[] args) {
        int[] arr ={1,2,4,6,9,-6};
        System.out.println(minimum(arr));
    }
    static int minimum(int[] arr){
        if (arr.length==0)
            return -1;
        int min = arr[0];
        for (int i=0;i<arr.length;i++){
            if (arr[i]<min)
                min=arr[i];
        }
        return min;
    }
}
