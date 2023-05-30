public class stringchallenges {
    
    public static void main(String[] args) {

        //Finding number of words in a string
         String s1="This is a string and we are testing how many words are there in it";

        String s2[]  = s1.split(" ");
        int count = s2.length;
        System.out.println("Number of Words in string are: "+count);

        //Count Number of characters
        System.out.println("Number of characters in string are: "+ s1.length());

        //Removing space and counting
        String s3= s1.replace(" ", "");
        System.out.println(s3);
        System.out.println("Number of characters in string are: "+ s3.length());

        //Reverse a String using string builder class
        StringBuilder revered = new StringBuilder(s1);
        revered.reverse();
        String output= revered.toString();
        System.out.println(output);

        //Reverse a String using string formatter class
        

        //Palendrom Check
        String s5= "Madam";
        StringBuilder revered1 = new StringBuilder(s5);
        revered1.reverse();
        String output1= revered1.toString();
        if(s5.equalsIgnoreCase(output1))
        {
            System.out.println("String is pelendrome");
        }
        else
        {
            System.out.println("String is not pelendrome");  
        }

        //Palendrom Check with space
        String s51= "Mad am";
        
        StringBuilder revered11 = new StringBuilder(s51);
        revered11.reverse();
        String output11= revered11.toString();
        if(s5.equalsIgnoreCase(output11))
        {
            System.out.println("The String is pelendrome");
        }
        else
        {
            System.out.println("The String is not pelendrome");  
        }

        //count the number of vowels

        byte num = 127;

        num++;
        
        System.out.print(++num);


        //count the number of duplicates & their frequency


    }


}
