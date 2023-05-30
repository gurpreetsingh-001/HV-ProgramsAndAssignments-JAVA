public class loops {
    
    public static void main(String[] args) {
      //For Loop
        for(int i=1; i<=10;i++)
        {
            if(i%2==0)
            {
                System.out.println("Prime Number using for: "+i);
            }
        }
       // while loop
       int i=1;
       while(i<=10)
       {
        if(i%2==0)
        {
            System.out.println("Prime Number using while: "+i);
        }
        i++;
       }

       //factorial of a numeber
       int fact=1;
       for(int k=5;k>=1;k--)
       {
         fact=fact * k;  
       }
       System.out.println("Factorial: "+ fact);

       //do while
       int g=5;
       int fac=1;
       do
       {
        fac=fac * g;  
        g--;
       }while(g>=10);
       System.out.println("Factorial: "+ fac);

    }
}
