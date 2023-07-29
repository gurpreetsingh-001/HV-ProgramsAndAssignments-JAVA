import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;
//Requirements:
//
//Password Generation: Implement a method to generate random passwords based on the user's specifications. The user should be able to choose the password length and include different character types, such as uppercase letters, lowercase letters, numbers, and special characters.
//
//Save Passwords: Allow the user to save the generated passwords to a file. The program should prompt the user for a file name and create the file to store the passwords.
//
//Accept User Input: Provide a console-based menu system to prompt the user for password options, such as length and character types.
//
//Error Handling: Handle possible errors, such as invalid password lengths or incorrect file names.
//
//Password Strength: Provide an option for the user to check the strength of a given password and provide feedback on its complexity.

public class PasswordGeneration {
    public static void main(String[] args) {
        int choice;
        String path ="password.txt";
        List<String> l1= new ArrayList<>();
        Scanner sc= new Scanner(System.in);
        do {
            System.out.println("======================");
            System.out.println("WELCOME TO PASSWORD GENERATION");
            System.out.println("======================");
            System.out.println("KINDLY PROVIDE YOUR INPUT:");
            System.out.println("1. GENERATE A PASSWORD");
            System.out.println("2. SAVE A PASSWORD");
            System.out.println("3. PRINT A PASSWORD");
            System.out.println("4. EXIT");
            System.out.print("Enter your choice (1-4): ");
            choice = sc.nextInt();
            if(choice==1)
            {
                generatepassword(sc,l1);

            }
            else if(choice==2)
            {
            savepassword(l1,path);
            }
            else if(choice==3)
            {

                readpassword(path);
            }
            else if(choice==4)
            {
                System.out.println("Thanks for generation .");
                break;
            }


        } while(choice == 1 || choice == 2 || choice == 3 || choice == 4);
        sc.close();



        }
        public static void generatepassword(Scanner sc,List l1)
        {
            int length;
            int alpha,num,spc;
            String charac;

            String ALPHABETS_UPPER = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
            String ALPHABETS_LOWER = ALPHABETS_UPPER.toLowerCase();
            String NUMBERS = "0123456789";
            System.out.println("Enter the length of password: ");
            length=sc.nextInt();
            sc.nextLine();
            System.out.println("Enter the characters to be inserted: ");
            charac= sc.nextLine();

            Random random = new Random();
            StringBuilder br= new StringBuilder();

            if(length>6) {
                num = 2;
                spc = num+2;
                alpha = length - num - spc;

                System.out.println("NUM: "+num +" SPC :"+spc + " ALPHA: "+alpha);
            } else {
                System.out.println("Kindly enter the password length greater then 6");
                return;
            }
            for(int i=0;i<(alpha/2);i++) {
                br.append(ALPHABETS_UPPER.charAt(random.nextInt(ALPHABETS_UPPER.length())));
                br.append(ALPHABETS_LOWER.charAt(random.nextInt(ALPHABETS_LOWER.length())));
            }
            for(int j=0;j<num;j++)
            {
                br.append(NUMBERS.charAt(random.nextInt(NUMBERS.length())));
            }

            for(int k=0;k<spc;k++)
            {
                br.append(charac.charAt(random.nextInt(spc)));
            }
            //System.out.println(br.toString());
            l1.add(br.toString());

        }
        public static void savepassword(List <String> l1, String path)
        {
            try (FileWriter writer = new FileWriter(path)) {
                for (String i : l1) {
                    writer.write(i + "\n");
                }
            }
            catch (Exception e)
            {
                e.printStackTrace();
            }
        }
    public static void readpassword( String path)
    {
        try {
            FileReader fr = new FileReader(path);
            int i;
            while ((i = fr.read()) != -1)
                System.out.print((char) i);
            fr.close();
        }
        catch (Exception e)
        {
            e.printStackTrace();
        }
    }
}
