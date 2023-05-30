public class strlength {
   

    public static void main(String[] args) {
        
        String s1= new String("Hello");
        String s2= new String("HELLO");

         // String length
        System.out.println(s1.length());

        // Add 2 strings together
        System.out.println(s1+" "+s2);

        //Compare 2 strings 
        System.out.println(s1.equals(s2));
            //Ignore case
        System.out.println(s1.equalsIgnoreCase(s2));
            //Compare case - difference between ascii value. if answer is -ve then s3 is greater then s4 & different is +ve then s4 is greater then s3
        String s3= new String("aaaa");
        String s4= new String("baaa");
        System.out.println(s3.compareTo(s4));

        //Searches character/substring in String
        String s5= "Gurpreet";
        String s6= new String("Singh");
        System.out.println(s5.contains("rt"));

        //Check Index of character in string
         System.out.println(s5.indexOf("r")); // first occurence
         System.out.println(s5.lastIndexOf("r")); // last occurence
        System.out.println(s5.indexOf("z")); //-1 is representation of false.

        // Fetch substring from one index to another index
        String s7= "Gurpreet Singh Sandhu";
        System.out.println(s7.substring(2, 9));

        // Replace character in string
        String s8= "Gorpreet";
        System.out.println(s8.replace("o","u"));
        System.out.println(s8.replace("o","u"));
        System.out.println(s8.replaceAll("e","u"));

        //Uppercase
        String s9= "Gurpreet";
        System.out.println(s8.toUpperCase());

        //Lowercase
        System.out.println(s8.toLowerCase());

        //Trim - remove front space or trailing space
        String s10= "  Gurp r e e t  ";
        System.out.println(s10);
        System.out.println(s10.trim());

        //convert to string
        int i=10;
        System.out.println(Integer.toString(i));
        System.out.println(s9+i);

        //convert string to int
        String j="10";
        int k=10;
        System.out.println(Integer.parseInt(j));
        int kk=Integer.parseInt(j);
        System.out.println(k+kk);

        //Split the String based on ,
        String s11= "Gurpreet,Singh,Sandhu";
        String[]a11  = s11.split(","); 
        System.out.println(a11);

        // Check datatype
        System.out.println(j.getClass().getSimpleName());

        
    }
}
