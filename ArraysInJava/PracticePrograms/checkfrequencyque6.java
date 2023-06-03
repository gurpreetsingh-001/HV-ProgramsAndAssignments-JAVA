import java.util.ArrayList;

public class checkfrequencyque6 {
    public static void main(String[] args) {
        int [] arrSuperSet = {3, 1, 3, 4, 1, 2, 1, 8, 3, 2, 1, 1, 3, 2, 3, 3, 4};

        int[] arrSubSet = {1, 2, 3, 5, 9};

        int [] num= new int[arrSubSet.length];

        
        for(int i=0; i<arrSuperSet.length;i++)
        {
            for(int j=0;j<arrSubSet.length;j++)
            {
                if(arrSubSet[j]==arrSuperSet[i])
                {
                   num[j]=num[j]+1;
                   break;
                }
            }
        }
        for (int i = 0; i < arrSubSet.length; i++) {
            System.out.println("Frequency of " + arrSubSet[i] + ": " + num[i]);
        }


    }
}
