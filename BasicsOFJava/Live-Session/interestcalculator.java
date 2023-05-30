import java.util.Scanner;
// P x R x (1+R)^N / [(1+R)^N-1] where-
// P = Principal loan amount
// N = Loan tenure in months
// R = Monthly interest rate
// The rate of interest (R) on your loan is calculated per month.
// R = Annual Rate of interest/12/100

public class interestcalculator {
    public static void main(String[] args) {
        Scanner s= new Scanner(System.in);

        System.out.println("Enter loan amount to be Taken: ");
        int l=s.nextInt();    
        System.out.println("Enter loan Interest (yearly): ");
        double i=s.nextDouble();
        System.out.println("Enter loan tenure to be Taken(yearly): ");
        int t=s.nextInt();    

        
        //Calculate monthy tenure
        int mt= t*12;
        System.out.println("Monthly tenure: "+mt);
        //calculate monthly interest
        double im= i/12/100;
        System.out.println("Monthly Interest: "+im);

        //Calculate (1+R)^N using power
        double pw= Math.pow(1+im, mt);

        //Calculate total
        double emi = (l*im*pw)/(pw-1);

        System.out.println("Total EMI to be paid: "+ emi);

        System.out.println("Total Loan Amount : "+l);
        //Calculate Total Interest
        double total= emi*mt-l;
        System.out.println("Total Interest to be paid during tenure: "+ total);
    }
}
