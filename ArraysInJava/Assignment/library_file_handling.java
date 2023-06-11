import java.io.BufferedWriter;
import java.io.FileWriter;
import java.util.Arrays;
import java.util.Scanner;

public class library_file_handling {
    public static void main(String[] args) {
        Scanner sc  = new Scanner(System.in);
         try (BufferedWriter wr = new BufferedWriter(new FileWriter("Library.csv", true))) {
        String line = ("Book Id, Book Title, Author, Availability, Issue Date");  
         wr.write(line);
            wr.newLine(); 
            }catch (Exception e){
        e.printStackTrace();
    }


        System.out.print("Enter the enteries you want to insert in Catalog: ");
          int entry = sc.nextInt();
          sc.nextLine();
          String id,title1,author,avl,issuedate;

        for( int i=0;i<entry;i++)
        {
          System.out.print("Enter Book ID: ");
          id = sc.nextLine();

          System.out.print("Enter Book Title: ");
          title1 = sc.nextLine();

          System.out.print("Enter Author Name: ");
          author = sc.nextLine();

          System.out.print("Avaiable/Not Available: ");
          avl = sc.nextLine();

          System.out.print("Issue Date ");
          issuedate = sc.nextLine();

          String[] Data = {
                            id,
                            title1,
                            author,avl,issuedate};

  //System.out.println(Arrays.toString(Data));

      try (BufferedWriter wr = new BufferedWriter(new FileWriter("Library.csv", true))) {
        
        String line = String.join(",", Data);
            wr.write(line);
            wr.newLine();

    }catch (Exception e){
        e.printStackTrace();
    }
  
  }
        sc.close();  }  
            

         


    }

