import java.util.Scanner;
public class substringquescodechef {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int t=s.nextInt();
        for(int i=1;i<=t;i++){
            int n=s.nextInt();
            String str=s.next();
            String a=str.substring(0,n/2);
            String b=str.substring(n/2,n);
            if(a.equals(b))
                System.out.print("yes");
            else
                System.out.print("no");

        }
    }
}
