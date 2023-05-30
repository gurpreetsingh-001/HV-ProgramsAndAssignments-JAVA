import java.util.Arrays;

public class arreg {
    
public static void main(String[] args) {
    // int[] arr  ={2,4,6,8,10};
    // int [] arr2 = new int[4];
    // arr2[0]=11;
    // arr2[1]=12;
    // arr2[2]=13;
    // arr2[3]=14;
    // arr[2]=100;
    // System.out.println(arr2[3]);
    // System.out.println(arr[2]);
    String [] s1= {"A","B","C","D","E","F","G","H"};
    int[] s2 = {1,3,5,7,9,11,13,15,17};

    for(int i=0; i<s1.length;i++)
    {
       // System.out.println(i); // index 
       // System.out.println(s1[i]);
    }

    for(int i :s2) // i is not an index and its a value, so data type should be the same as of array
    {
  //      System.out.println(i);
    }
    for(String i :s1) // i is not an index and its a value, so data type should be the same as of array
    {
    //    System.out.println(i);
    }

    int i=0;
    while(i<s2.length)
    {
    //    System.out.println(s2[i]);
        i++;
    }
   // System.out.println(Arrays.toString(s2));

    // convert array to strings
    String s="Gurpreet";
    char [] c = s.toCharArray();
    for (char ik :c)
    {
    //    System.out.println(ik);
    }
    
    //removing an element from array

    int[] s3 = {1,3,5,7,9,11,13,15,17};
    int removed_value = 9;
    int index = -1; 
    for( int j=0;j<s3.length;j++)
    {
        if(s3[j]==removed_value)
        {
            index=j;
            break;
        }
    }
    if(index!=-1)
    {
        int [] s4= new int[s3.length-1];
        System.arraycopy(s3, 0, s4, 0, index);
        System.arraycopy(s3, index+1, s4, index, s3.length-index-1);
        s3=s4;
    }
    for(int l : s3)
    {
        System.out.println(l);
    }

    


}
}
