import java.util.Scanner;

public class variables {
    public static void main(String[] args) {
//        System.out.println("Hello world!");
        int a = 10;
        float b = 34;
        System.out.println("hello");
//        System.out.println(a+b);
        Scanner input = new Scanner(System.in);
        int c = input.nextInt();
        System.out.println(a*b*c);
        System.out.println("sum of 3 is" + (a+b+c));


    }
}