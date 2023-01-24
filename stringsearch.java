public class stringsearch {
    public static void main(String[] args) {
        String name = "bhavit";
        char target = 'a';
        System.out.println(search(name, target));

    }

    static boolean search(String str, char target) {
        if (str.length() == 0)
            return false;
        for (int i = 0; i < str.length(); i++) {
            if (target == str.charAt(i)) {
                System.out.println("at index "+i);
                return true;
            }

        }
        return false;
    }
}
