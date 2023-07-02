import java.util.ArrayList;
import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        Product pr = new Product(1,"abc",100.0,5,"gjsgsdgdd","mobile");
        //System.out.println(pr);

        Product pr1 = new Product(2,"xyz",1000.0,15,"Details ","laptop");
        Product pr2 = new Product(3,"sas",10.0,50,"Description","desktop");
        Product pr3 = new Product(4,"kkl",20.0,500,"More Description","tablet");

        ArrayList<Product> arr = new ArrayList<>();
        arr.add(pr);
        arr.add(pr1);
        arr.add(pr2);
        arr.add(pr3);
        Scanner sc = new Scanner(System.in);
        int choice ;

        do {
            System.out.println("======================");
            System.out.println("WELCOME TO OUR INVENTORY MANAGEMENT SYSTEM");
            System.out.println("======================");
            System.out.println("WHAT YOU WANT TO DO:");
            System.out.println("1. View list of all Products");
            System.out.println("2. View number of quantities available for a specific Product");
            System.out.println("3. View Product details");
            System.out.println("4. Edit Product");
            System.out.println("5. Update Inventory");
            System.out.println("6. Exit");
            System.out.print("Enter your choice (1-6): ");
            choice = sc.nextInt();
            sc.nextLine();
            if(choice==1) {
                System.out.println("Product Details are as follows: ");
                for (Product obj : arr) {
                    System.out.println(obj.toString());
                }
            }
            else if(choice==2) {
                int id=0;
                System.out.print("Enter the product id: ");
                id = sc.nextInt();
                int qu=0;
                for (Product obj : arr) {
                    if(id==obj.getId())
                    {
                        qu=obj.getQuantity();
                        System.out.println("Quantity for product id "+id+" is: "+qu);
                        break;
                    }else {
                        int k=0;
                    }
                }

            }
            else if(choice==3)
            {
                int id=0;
                System.out.print("Enter the product id: ");
                id = sc.nextInt();

                for (Product obj : arr) {
                    if(id==obj.getId())
                    {

                        System.out.println("Details for product id "+id+" are follows:" );
                        System.out.println(obj.toString());
                        break;
                    }else {
                        int k=0;
                    }
                }

            }
            else if(choice==4)
            {
                int id=0;
                String nam;
                System.out.print("Enter the product id: ");
                id = sc.nextInt();
                sc.nextLine();
                System.out.print("Enter the Product name to be edited for id "+id+" : ");
                nam = sc.nextLine();

                for (Product obj : arr) {
                    if(id==obj.getId()) {
                        obj.setName(nam);
                        break;
                    }
                    else{
                        int k=0;
                    }
                    }
            }
            else if(choice==5)
            {
                int id=0;
                int qty=0;
                System.out.print("Enter the product id: ");
                id = sc.nextInt();
                sc.nextLine();
                System.out.print("Enter the Quantity to be edited for id "+id+" : ");
                qty = sc.nextInt();
                sc.nextLine();

                for (Product obj : arr) {
                    if(id==obj.getId()) {
                        obj.setQuantity(qty);
                        break;
                    }
                    else{
                        int k=0;
                    }
                }
            }
            else if(choice==6)
            {
                System.out.println("Thanks for visiting the Inventory Management System.");
                break;
            }
        }while(choice == 1 || choice == 2 || choice == 3 || choice == 4 || choice == 5 || choice == 6);



    }
}