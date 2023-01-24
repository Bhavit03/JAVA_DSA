import java.util.Locale;

public class palindrome {
    public static void main(String[] args) {
        String str="nana";
        System.out.println(ispalindrome(str));
    }
    static boolean ispalindrome(String obj){
        if (obj==null || obj.length()==0)
            return true;
        obj = obj.toLowerCase(Locale.ROOT);
        int l = obj.length();
        for (int i = 0; i <= l/2; i++) {
            if (obj.charAt(i)!=obj.charAt(l-i-1))
                return false;
        }
        return true;
    }
}
