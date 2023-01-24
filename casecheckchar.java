import java.util.Scanner;

public class casecheckchar {
    public static void main(String[] args) {
//        this program will check for only the first character, even if you enter a word of line
        Scanner in = new Scanner(System.in);
        System.out.println("Enter character");
        char ch = in.next().trim().charAt(0);
        if (ch>='a' && ch<='z'){
            System.out.println("Lowercase");
        }else {
            System.out.println("Uppercase");
        }
    }
}
