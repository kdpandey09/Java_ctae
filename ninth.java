/*implement string class using built-in string class method (Kaustub Dutt Pandey)*/
public class ninth {

    public static void main (String[] args){

        String str1 = "paradox";
        System.out.println("String length = " + str1.length());
        System.out.println("Changing to upper Case " + str1.toUpperCase());
        
        String str2 = "ILLUSION";
        System.out.println("Changing to lower Case " + str2.toLowerCase());
        System.out.println("Concatenated string  = " + str1.concat(str2));

        String str3 = "   penrose hawking singularity theorems  ";
        System.out.println("String before trimming = "+ str3);
        System.out.println("String after trimming = "+ str3.trim());
        
        Boolean out = "Supernova".equals("supernova");
        System.out.println("Checking Equality  " + out);
        out = "Supernova".equals("Supernova");
        System.out.println("Checking Equality  " + out);
         
        out = "Supernova".equalsIgnoreCase("supernova");
        System.out.println("Checking Equality " + out);

    }
    
}
