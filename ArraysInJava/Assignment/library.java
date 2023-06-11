import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class library {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int choice ;
        String [] library= {"Book1","Book2","Book3","Book4","Book5","Book6"};
        int price=80;
        String [] borrowed={};
        do {
            System.out.println("======================");
            System.out.println("WELCOME TO OUR LIBRARY");
            System.out.println("======================");
            System.out.println("WHAT YOU WANT TO DO:");
            System.out.println("1. DISPLAY ALL BOOK?");
            System.out.println("2. ISSUE A BOOK");
            System.out.println("3. RETURN A BOOK");
            System.out.println("4. EXIT");
            System.out.print("Enter your choice (1-4): ");
            choice = sc.nextInt();
            if(choice==1)
            {
                int index =-1;
                Scanner s2=new Scanner(System.in);
                System.out.print("Enter the book name you want to see: ");
                String name  = s2.nextLine();
                System.out.println("Here is the list of all books in library: "+ Arrays.toString(library));
                for(int i=0; i<library.length;i++)
                {
                    
                    if(name.equals(library[i]))
                    {
                        index=i;
                        break;
                    }
                }

                    if(index!=-1)
                    {
                        System.out.println("Requested book is in the library as "+ library[index]);
                    }else
                    {
                        System.out.println("Requested book is not in the library");
                    }
                
               
            }
            else if(choice==2)
            {
                int index =-1;
                Scanner s2=new Scanner(System.in);
                System.out.println("Here are the list of all books in library: "+ Arrays.toString(library));
                System.out.print(" Kindly enter the book name you want to borrow: ");
                String borrowbook  = s2.nextLine();
                for(int i=0; i<library.length;i++)
                {
                    
                    if(borrowbook.equals(library[i]))
                    {
                        index=i;
                        break;
                    }
                }

                    if(index!=-1)
                    {
                        System.out.println("The Requested book is in the library as "+ library[index]);
                    }else
                    {
                        System.out.println("Requested book is not in the library. Kindly repeat the process.");
                        break;
                    }

                System.out.print("Kindly enter the number of days you want to borrow a book: ");
                int days  = s2.nextInt();
                int total  = days*price;
                List<String> arr= new ArrayList<>(Arrays.asList(library));
                List<String> bor= new ArrayList<>(Arrays.asList(borrowed));
                arr.remove(borrowbook);
                bor.add(borrowbook);
                borrowed=bor.toArray(new String[0]);
              //  System.out.println(arr);
                library=arr.toArray(new String[0]);
                System.out.println("Thanks for borrowing a "+ borrowbook +" for "+days+" days at Rs. "+total);
                System.out.println("Updated Books in library are as follows: "+Arrays.toString(library));
                System.out.println("Books Borrowed: "+Arrays.toString(borrowed));
            }
            else if(choice==3)
            {
                int index =-1;
                Scanner s2=new Scanner(System.in);
                System.out.println("Here are the list of all borrowed book : "+ Arrays.toString(borrowed));
                System.out.println("Which one you want to return? Kindly enter the name: ");
                String returnBook = s2.nextLine();
                for(int i=0; i<borrowed.length;i++)
                {
                    
                    if(returnBook.equals(borrowed[i]))
                    {
                        index=i;
                        break;
                    }
                }
                if(index!=-1)
                {
                    System.out.println("The Requested book is in the borrowed list books as "+ borrowed[index]);
                }else
                {
                    System.out.println("Requested book is not in the borrowed list. Kindly repeat the process.");
                    break;
                }
                List<String> arr= new ArrayList<>(Arrays.asList(library));
                List<String> bor= new ArrayList<>(Arrays.asList(borrowed));
                bor.remove(returnBook);
                arr.add(returnBook);
                borrowed=bor.toArray(new String[0]);
                library=arr.toArray(new String[0]);
                System.out.println("Book Returned Succesffuly. The book "+ returnBook+ " is added back in library");
                System.out.println("Updated Books in library are as follows: "+Arrays.toString(library));
                System.out.println("Books Borrowed: "+Arrays.toString(borrowed));


                
                
            }
            else if(choice==4)
            {
                System.out.println("Thanks for visiting the library.");
                break;
            }


        } while(choice == 1 || choice == 2 || choice == 3 || choice == 4);
        sc.close();

    }
}
