import java.util.Scanner;

public class methodsbasic {
    public static void main(String[] args) {
//        String g =greet();
//        System.out.println(g);
        greet1();
    }
    static String greet(){
        Scanner in = new Scanner(System.in);
        String name = in.next();
        return ("Hello "+name);
    }
    static void greet1(){
        Scanner in = new Scanner(System.in);
        String name = in.next();
        System.out.println("Hello " + name );

    }

}
