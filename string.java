public class string {
    public static void main(String[] args) {
//        String name="Bhavit";  // class name string, ref variable name, object "Bhavit"
        String a ="cat";
        String b ="cat";
        System.out.println(a==b);  // both a and b points towards same object
        String c=new String("Bhavit");
        String d=new String(("Bhavit"));
        System.out.println(c==d);   //both c and d points towards different objects
        System.out.println(c.equals(d));  // .equals only checks value of c and d
//     ' ' means character, " " means strings
        System.out.println('a'+'b');   // returns sum of ascii values of characters a and b
        System.out.println("a"+"b");   // concatenates strings
        System.out.println("a"+1);
//        TO PRINT SERIES OF ALPHABETS
        String series="";
        for (int i = 0; i < 26; i++) {
            char ch=(char)('a'+i);
            System.out.println(ch);
            series=series+ch+" ";
        }
        System.out.println(series);
//        USING STRING BUILDER
        StringBuilder builder = new StringBuilder();
        for (int i = 0; i < 26; i++) {
            char ch=(char)('a'+i);
            builder.append(ch);
        }
        System.out.println(builder.toString());

    }
}
