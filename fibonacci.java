import java.util.Scanner;

public class fibonacci {
    public static void main(String[] args) {
//        index beginning from 0
        Scanner in = new Scanner(System.in);
        int a=0;
        int b=1;
        System.out.println("enter up till which term sequence is required?");
        int n = in.nextInt();
        System.out.println("Sequence is:");
        System.out.println(a);
        System.out.println(b);
        int count = 2;
//        incrementing b and giving previous value of b to a
        while(count<=n){
            int temp = b;
            b= b+a;
            a=temp;
            count++;
            System.out.println(b);
        }

    }
}
