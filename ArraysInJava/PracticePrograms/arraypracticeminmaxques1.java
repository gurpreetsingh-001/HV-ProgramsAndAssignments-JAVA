public class arraypracticeminmaxques1 {
    public static void main(String[] args) {
     
        int[] arrNum = {31, 42, 25, 21, 56,  61, 13, 45, 76, 55};
        int min = arrNum[0];
        int max = arrNum[0];
        int avg=0;
    //Minimum Value
        for(int i=0;i<arrNum.length;i++)
        {
            if(arrNum[i]<min)
            {
               min=arrNum[i];
            }
          
        }
        System.out.println("The minimum value is :"+ min);

       
    //Maximum Value 
    for(int i=0;i<arrNum.length;i++)
    {
        if(arrNum[i]>max)
        {
           max=arrNum[i];
        }
      
    }
    System.out.println("The maximum value is :"+ max);
   
    //Average
    for(int i=0;i<arrNum.length;i++)
    {
        avg+=arrNum[i];
      
    }

    System.out.println("The Average value is :"+ avg/arrNum.length);
    // Total Length
    int len=arrNum.length;
    System.out.println("The Total Elements is :"+ len);
}
}
