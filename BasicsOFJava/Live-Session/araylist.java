import java.util.ArrayList;

public class araylist {
    
    public static void main(String[] args) {
        ArrayList<String> arr= new ArrayList<>();
        //Add Value in array list -add()
        arr.add("A");
        arr.add("B");
        System.out.println(arr);

        //Remove value in array list - remove()
        arr.remove(0); //arr.remove("A");
        System.out.println(arr);
        //
        arr.add("C");
        arr.add("Z");
        //
        System.out.println(arr);
        //Modify a value in array list :set()
        arr.set(0,"A");
        System.out.println(arr);
    }
}
