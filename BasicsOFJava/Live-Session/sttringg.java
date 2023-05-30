public class sttringg {
    
    public static void main(String[] args) {
        // Literal - String store in string memory pool, string is define by its value, agar 10 string aur hain aur value same hai to unki memory same hogi.
    
        String s1="hello";
        String s2="hello";
        if(s1==s2)
        {
            System.out.println("Its Same because of String memory pool");
        }
        else{
            System.out.println("Its Different because of String memory pool");
        }
        // New Instance Created - stored in different places
        String s3= new String("Hello");
        String s4= new String("Hello");
        if(s3==s4)
        {
            System.out.println("Its Same");
        }
        else{
            System.out.println("Its Different because of instance is created in different memory");
        }
    }
}
