public class linsearch {
    public static void main(String[] args) {
        int[] array = {2,3,4,5,6,8};
        int targetnp = 9;
        int ans =linearsearch(array,targetnp);
        System.out.println(ans);
    }
    static int linearsearch(int[] arr, int target){
        if (arr.length == 0)
            return -1;
        for (int i=0;i<arr.length;i++){
            if (arr[i]==target)
                return i;
        }
        return -1;
    }
}
