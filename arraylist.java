import java.util.ArrayList;
import java.util.Scanner;

public class arraylist {
    public static void main(String[] args) {
//        new arraylist created
        ArrayList<Integer> list = new ArrayList<>();
//        adding an element and output
        list.add(67);
        System.out.println(list);
//        taking n entries in arraylist
        ArrayList<Integer> list2 = new ArrayList<>();
        Scanner in = new Scanner(System.in);
        System.out.println("Enter  how many elements in arraylist");
        int n= in.nextInt();
        for (int i=0;i<n;i++){
            int entry = in.nextInt();
            list2.add(entry);
        }
        System.out.println(list2);


    }
}
