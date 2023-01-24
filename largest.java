import java.util.Scanner;

public class largest {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
//        taking input of 3 numbers
        System.out.println("Input 3 numbers:");
        int n1 = in.nextInt();
        int n2 = in.nextInt();
        int n3 = in.nextInt();
//        conditional body
        int max = n1 ;
        if (n2 > max ){
            max = n2;
        }
        if (n3 > max){
            max = n3;
        }
        System.out.println("Largest number is " + max);
//        ALTERNATE CODE FOR MAX
//        int max = Math.max(n3 , Math.max(n1,n2));
//        System.out.println("Largest number is " + max);
    }
}
