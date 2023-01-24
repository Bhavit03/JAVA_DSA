import java.util.Scanner;

public class occurrence {
    public static void main(String[] args) {
//        concept is to check the remainder every time we divide the number by 10, as it gives the last number
        Scanner in = new Scanner(System.in);
        System.out.println("Enter number");
        int n = in.nextInt();
        System.out.println("enter digit whose number of occurrences to be checked");
        int d = in.nextInt();
        int count = 0;
        while(n>0){
            int rem = n%10;
            if(rem == d){
                count++;
            }
            n/=10;
        }
        System.out.println("number of occurrences is" + count);
    }
}
