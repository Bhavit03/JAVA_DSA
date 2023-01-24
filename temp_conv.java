import java.util.Scanner;

public class temp_conv {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter temperature in degree celcius");
        float tcel = input.nextFloat();
        float tfer = tcel*(9/5) + 32;
        System.out.println("temperature in farehniet is " + tfer);
    }
}
