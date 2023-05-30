import java.util.Scanner;

public class pyramidprinting {
    public static void main(String[] args) {
        Scanner s= new Scanner(System.in);
        System.out.println("Select a pattern to print:");
        System.out.println("1. Pyramid");
        System.out.println("2. Diamond");
        System.out.println("3. Number Pattern");
        System.out.println("4. Floyd Triangle");

        System.out.print("Enter your choice (1-4): ");
        int choice = s.nextInt();

        switch(choice){
            case 1:{
            System.out.println("1. Pyramid Pattern");
            printPyramid();
            break;
            }
            case 2:{
                System.out.println("2. Diamond Pattern");
                printDiamond();
                break;  
            }
            case 3:{
                  System.out.println("3. Number Pattern");
                  printNumPat();
                  break;
                }  
            case 4:{
                    System.out.println("4. Floyd Pattern");
                    printFloyd();
                    break;
                } 
            default:
            {
                System.out.println("Invalid Choice");
                break;
            }           
        }
       

s.close();
    }
    public static void printPyramid()
    {
        int rows=7;
        for(int i=1;i<=rows;i++)
        {
            for(int j=1;j<=(rows-i);j++ )
            {
                System.out.print(" ");
            }
            for(int k=1;k<=2*i-1;k++)
            {
                System.out.print("*");
            }
            System.out.println("");
        }
        
    }
    public static void printDiamond()
    {
        int rows=7;
        for(int i=1;i<=rows;i++)
        {
            for(int j=1;j<=(rows-i);j++ )
            {
                System.out.print("  ");
            }
            for(int k=1;k<=2*i-1;k++)
            {
                System.out.print("* ");
            }
            System.out.println("");
        }
        //bottom part
        for(int i=rows-1;i>=1;i--)
        {
            for(int j=rows-1;j>=i;j-- )
            {
                System.out.print("  ");
            }
            for(int k=1;k<=2*i-1;k++)
            {
                System.out.print("* ");
            }
            System.out.println("");
        }

        
    }
    public static void printNumPat()
    {
        int rows=7;
        for(int i=1;i<=rows;i++)
        {
            for(int j=1;j<=i;j++ )
            {
            System.out.print(j+" ");
           
        }
        System.out.println("");
    }
}

    public static void printFloyd()
    { int ab=1;
        int rows=5;
        for(int i=0;i<=rows;i++)
        {
            
            for(int j=1;j<=i;j++ )
            {
                ab++;
            System.out.print(ab);
        }
        System.out.println("");
    }


    
}
}
