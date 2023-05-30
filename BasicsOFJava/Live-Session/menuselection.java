import java.util.Scanner;

public class menuselection {
    
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        char choice = 'y';
        do {
            System.out.println("Enter your choice ?");
            choice = sc.nextLine().charAt(0);
        } while(choice == 'Y' || choice == 'y');
        sc.close();
 
    }
}
