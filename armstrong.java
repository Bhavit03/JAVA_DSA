public class armstrong {
    public static void main(String[] args) {
//        System.out.println(isarmstrong(67567));
//   USING FUNCTION CREATED TO DISPLAY ALL 3 DIGIT ARMSTRONG NUMBERS
        for (int i =100;i<1000;i++){
            if (isarmstrong(i)==true){
                System.out.println(i+" is armstrong");
            }
        }
    }
//    CREATING A FUNCTION THAT TELL WEATHER THE NUMBER ENTERED IS ARMSTRONG OR NOT
    static boolean isarmstrong(int n) {
        int orig = n;
        int sum =0;
        while (n > 0) {
            int rem = n % 10;
            sum += rem * rem * rem;
            n = n / 10;
        }
       return sum==orig;

    }
}
