import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class inventorymgmt {
    public static void main(String[] args) {
         String [] pname = {"Product 1", "Product 2", "Product 3","Product 4","Product 5"};
        String [] specifications = {"Spec 1", "Spec 2", "Spec 3", "Spec 4", "Spec 5"};
        double [] costs = {10.99, 20.99, 15.99, 20.01, 55.33};
        int [] quantities = {5, 10, 8, 42, 45};
        int [] prdId = {1, 2, 3, 4, 5};
        Scanner sc = new Scanner(System.in);
        int choice;

        do{
            System.out.println("----------------------------------------");
            System.out.println("Welcome to the SmartPoint Electronics Store");
            System.out.println("----------------------------------------");
            System.out.println("1. View the complete list of our products");
            System.out.println("2. Check the available count for a specific product");
            System.out.println("3. View the specifications and details of a specific product");
            System.out.println("4. Modify the details of a specific product");
            System.out.println("5. Update the inventory for a specific product");
            System.out.println("0. Exit");
            System.out.print("Enter your choice: ");
            choice = sc.nextInt();
            sc.nextLine(); 
            switch (choice) {
                case 1:{
                    displayProductList(pname,prdId);
                    break;
                }
                case 2:{
                    getProductCount(pname,quantities,prdId);
                    break;}
                case 3:{
                    viewProductDetails(pname,quantities,prdId,specifications,costs);
                    break;}
                case 4:{
                    editProduct(pname,quantities,prdId,specifications,costs);
                    break;}
                case 5:{
                    updateInventory(pname,quantities,prdId,specifications,costs);
                    break;}
                case 0:{
                    System.out.println("Exiting...");
                    break;}
                default:{
                    System.out.println("Invalid choice! Please try again.");}
                    System.out.println();
                }
        }while(choice!=0);
        sc.close();
    }

    
    public static void displayProductList(String [] pname, int [] prdId)
    {
        System.out.println("Product List:");
        
        System.out.println("Product ID      Product Name");
        for(int i=0; i<pname.length; i++)
        {
            System.out.println(prdId[i]+"                  "+pname[i]);
        }
    }

    public static void getProductCount(String [] pname, int[] quantities,int [] prdId)
    {
        Scanner s2=new Scanner(System.in);
        System.out.println("Enter the Product Id:");
        int id = s2.nextInt();
        s2.nextLine();
        int index= -1;
        for(int i=0; i<prdId.length; i++)
        {
           if(prdId[i]==id)
           {
             index=i;
           }
        }
        System.out.println("Product associated with id "+id+" is: "+pname[index]+" having inventory : " +quantities[index]);

    }

    public static void viewProductDetails(String [] pname, int[] quantities,int [] prdId, String[] specifications, double[] costs)
    {
        Scanner s2=new Scanner(System.in);
        System.out.println("Enter the Product Id:");
        int id = s2.nextInt();
        s2.nextLine();
        int index= -1;
        for(int i=0; i<prdId.length; i++)
        {
           if(prdId[i]==id)
           {
             index=i;
           }
        } 
        System.out.println("Details for Prodcut Id "+id+" as follows:");
        System.out.println("Product Name: "+pname[index]);
        System.out.println("Product Inventory: "+quantities[index]);
        System.out.println("Product Specification: "+specifications[index]);
        System.out.println("Product Cost: "+costs[index]);
    }

    public static void editProduct(String [] pname, int[] quantities,int [] prdId, String[] specifications, double[] costs)
    {
        Scanner s2=new Scanner(System.in);
        System.out.println("Enter the Product Id:");
        int id = s2.nextInt();
        s2.nextLine();
        int index= -1;
        for(int i=0; i<prdId.length; i++)
        {
           if(prdId[i]==id)
           {
             index=i;
           }
        }
            System.out.println("Enter the Product Name to be edited for peoduct id:"+id);
             String name = s2.nextLine();
            List<String> arr= new ArrayList<>(Arrays.asList(pname));
            System.out.println("Old Product Names:"+Arrays.toString(pname));
            System.out.println("index"+index);
            arr.set(index,name);
            pname=arr.toArray(new String [0]);
            System.out.println("Updated Product Names:"+Arrays.toString(pname));
        
        
    }
    public static void updateInventory(String [] pname, int[] quantities,int [] prdId, String[] specifications, double[] costs)
    {
        Scanner s2=new Scanner(System.in);
        System.out.println("Enter the Product Id:");
        int id = s2.nextInt();
        int index= -1;
        for(int i=0; i<prdId.length; i++)
        {
           if(prdId[i]==id)
           {
             index=i;
           }
        }
        System.out.println("Enter the Product Quantity to be updated for product id:"+id);
        int qty = s2.nextInt();
        System.out.println("Old Product Names:"+Arrays.toString(quantities));  
        quantities[index]=qty;
        System.out.println("Updated Product Names:"+Arrays.toString(quantities));

        

    }

    

}
