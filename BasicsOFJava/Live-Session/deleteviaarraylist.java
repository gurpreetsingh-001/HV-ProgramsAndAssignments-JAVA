import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class deleteviaarraylist {
    
    public static void main(String[] args) {
        int[] s3 = {1,3,5,7,9,11,13,15,17};
        String [] s1= {"A","B","C","D","E","F","G","H"};
        List<String> arr= new ArrayList<>(Arrays.asList(s1));

        System.out.println(arr);
        arr.remove(1);

        s1=arr.toArray(new String[0]);
        for(String i:s1)
        {
            System.out.println(i);
        }
        
        System.out.println(s1.length);
       
        //Display output as an array
        System.out.println(Arrays.toString(s1));
    }
}
