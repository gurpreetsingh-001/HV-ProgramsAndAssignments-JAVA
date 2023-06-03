import java.util.ArrayList;
import java.util.Arrays;

public class ascendescenorderques3 {
    
    public static void main(String[] args) {
        int[] arrNum = {31, 42, 25, 21, 56,  61, 13, 45, 76, 55};
        int ascen = arrNum[0];
        int descen=arrNum[0];
        for(int i=0;i<arrNum.length;i++)
        {
            for(int j=0;j<arrNum.length-i-1;j++)
            {
                if(arrNum[j]>arrNum[j+1])
                {
                    ascen=arrNum[j];
                    arrNum[j]=arrNum[j+1];
                    arrNum[j+1]=ascen;
                }
            }      
        }
        System.out.println(Arrays.toString(arrNum));
        // for(int i: arrNum)
        // {
        //     System.out.println(i);
        // }

        //Descending Order
        for(int i=0;i<arrNum.length;i++)
        {
            for(int j=0;j<arrNum.length-i-1;j++)
            {
                if(arrNum[j]<arrNum[j+1])
                {
                    descen=arrNum[j];
                    arrNum[j]=arrNum[j+1];
                    arrNum[j+1]=descen;
                }
            }      
        }
        System.out.println(Arrays.toString(arrNum));

        
    }
}
