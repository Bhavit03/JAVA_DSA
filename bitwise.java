public class bitwise {
    public static void main(String[] args) {
        int[] arr={1,3,5,7,5,2,2,1,3};
        int num = 45;
        System.out.println();
    }
    private static boolean isodd(int num) {
        if ((num&1)==1)
            return true;
        return false;
    }
    static int nonrepno(int[] arr){
//  finding number that occurs only once in array, [1,3,4,6,4,1,3] ans =6 HINT USE XOR
        int ans=0;
        for (int n:arr) {
            ans^=n;
        }
        return ans;
    }
}
