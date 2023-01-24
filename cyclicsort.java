import java.util.Arrays;

public class cyclicsort {
    public static void main(String[] args) {
        int[] array={4,3,2,1,5,6};
        cyclic(array);
        System.out.println(Arrays.toString(array));
    }
    static void cyclic(int[] arr){
        for (int i = 0; i < arr.length; i++) {
            if (arr[i]-1!=i)
                swap(arr,i,arr[i]-1);
        }
    }
    static void swap(int[] arr,int first,int second){
        int temp=arr[first];
        arr[first]=arr[second];
        arr[second]=temp;
    }
}
