
import java.util.Scanner;
public class third {
    public static void main(String[] args) {
        byte b1, b2, b3, b4, b5, b6, b7;
        b1 = 111; // "int" literal and implicit casting
        System.out.println("b1: "+b1);
        b2 = 0x0000006F; // "int" literal and implicit casting
        System.out.println("b2: "+b2);
        b3 = (byte) 111; // "int" literal and explicit casting
        System.out.println("b3: "+b3);
        b4 = (byte) 0x0000006F; // literal and explicit casting
        System.out.println("b4: "+b4);
        b5 = 222/2; // "int" expression and implicit casting
        System.out.println("b5: "+b5);
        b6 = (byte) 111.14157; // "float" literal and explicit casting
        System.out.println("b6: "+b6);
        b7 = (byte) 'A'; // "char" literal and explicit casting
        System.out.println("b7: "+b7);

    }
}
