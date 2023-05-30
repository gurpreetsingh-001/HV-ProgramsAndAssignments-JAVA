import java.util.Arrays;
import java.util.Comparator;

public class araymethod {
    public static void main(String[] args) {
        int[] s2 = {1,3,5,7,9,11,13,15,17};
        int[] s22 = {1,3,5,7,9,11,13,15,17};
        Integer[] s222 = {1,3,5,7,9,11,13,15,17};
        //SORT METHOD
        Arrays.sort(s2);
       // System.out.println(Arrays.sort(s2));
        System.out.println(Arrays.toString(s2));
    
        System.out.println(Arrays.binarySearch(s2,3));

        //Fill an array with same value
        int[] s3=new int[10];
        Arrays.fill(s3, 20);
        System.out.println(Arrays.toString(s3));
        for( int k:s3)
        {
            System.out.println(k);
        }

        //Two Arrays are equal or not
        System.out.println(Arrays.equals(s22,s2));

        //Reverese a array
        Arrays.sort(s222,Comparator.reverseOrder());
        System.out.println(Arrays.toString(s222));


    }
}
