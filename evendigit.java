import java.util.Arrays;
import java.util.Scanner;

public class evendigit {
    public static void main(String[] args) {
//        given an array of numbers , return how many of them contains even number of digits
        Scanner in = new Scanner(System.in);
        System.out.println("enter length of array");
        int l=in.nextInt();
        int[] arr = new int[l];
        System.out.println("enter elements of array");
        for (int i=0;i<l;i++)
            arr[i]=in.nextInt();
        System.out.println(Arrays.toString(arr));
        System.out.println("Number of even digit elemests: "+evencount(arr));
    }
//    FUNCTION TO COUNT EVEN NUMBER OF DIGITS IN ELEMENTS OF ARRAY
    static int evencount(int[] arr){
        int count=0;
        for (int num:arr){
            if (even(num))
                count++;
        }
        return count;
    }
    //    FUNCTION THAT TELLS IF NUMBER HAS EVEN DIGITS OR NOT
    private static boolean even(int num) {
        if (num<0)                        //in case array has negative number
            num=num*(-1);
        if (num==0)
            return false;
        int count=0;
        while (num>0){
            count++;
            num=num/10;
        }
        if (count%2==0)
            return true;
        return false;
    }




}
