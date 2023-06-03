import java.util.Arrays;

public class moveallonesques5 {
    
    public static void main(String[] args) {
        int[] arrNum = {3, 1, 4, 1, 2, 1, 8, 3, 2, 1};
        int descen = arrNum[0];
        for(int i=0;i<arrNum.length;i++)
        {
            for(int j=0;j<arrNum.length-i-1;j++)
            {
                if(arrNum[j]==1)
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
