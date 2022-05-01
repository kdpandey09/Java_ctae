/*Java program to show the use of "extends" keyword (Kaustub Dutt Pandey)*/
public class vehicle {
    public void Display() {
        System.out.println("This is a method of Car class");
    }

    public static void main(String[] args) {
        car obj = new car();
        obj.Display();
        obj.Display1();
    }

}

public class car extends vehicle {
    public void Display1() {
        System.out.println("This is a method of vehicle class");
    }
}
