import java.util.Scanner;

public class reversing_number {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the number");
        int num = in.nextInt();
        int res =0;
        while (num>0){
            int rem = num%10;
            num/=10;
            res = res*10 + rem;
        }
        System.out.println("reversed number of input is "+res);
    }
}
