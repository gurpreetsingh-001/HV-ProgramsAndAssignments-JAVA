import java.util.ArrayList;
import java.util.Arrays;

public class reversearraypracticeques2 {
    public static void main(String[] args) {
        int[] arrNum = {31, 42, 25, 21, 56,  61, 13, 45, 76, 55};
        ArrayList<Integer>num= new ArrayList<>();
        for(int i=arrNum.length-1;i>0;i--)
        {
            num.add(arrNum[i]);
        }
        System.out.println(num);
        int[] reversedArr = new int[num.size()];
        for (int i = 0; i < num.size(); i++) {
            reversedArr[i] = num.get(i);
        }
        
        arrNum = reversedArr;
        System.out.println(Arrays.toString(arrNum));
    }
}
