import java.util.Scanner;

public class table_practice {
    
    public static void main(String[] args) {
        
        Scanner s1 =new Scanner(System.in);
        System.out.println("Enter the Number to print the table");
        int t=s1.nextInt();
        int table=t;
        for(int i=1;i<=10;i++)
        {
            table=t*i;
            System.out.println(t+"x"+i+"="+table);   
        }
        
    }
}
