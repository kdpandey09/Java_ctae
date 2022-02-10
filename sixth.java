/* Program showing properties of interface (Kaustub Dutt Pandey)*/
import java.util.Scanner;
public class sixth {
   
// this interface surves as a blueprint of a vending machine
    interface vending{
        void input(int i);
        int total();
    }
    static class chocolate implements vending{
        int number;
        public void input(int i){
            number = i;
        }
        // considering price of a chocolate is Rs. 20
        public int total(){
            int price;
            price = number*20;
            return price;
        }
    }
    static class Cold_Drink implements vending{
        int number;
        public void input(int i){
            number = i;
        }
        // considering price of a Cold Drink is Rs. 30
        public int total(){
            int price;
            price = number*30;
            return price;
        }
    }
    static class Chips implements vending{
        int number;
        public void input(int i){
            number = i;
        }
        // considering price of a chocolate is Rs. 10
        public int total(){
            int price;
            price = number*10;
            return price;
        }
    }
    public static void main(String[] args) {
        System.out.println("WELCOME TO VENDING MACHINE\n\n CHOCOLATE IS OF RS.20 EACH\n COLD DRINK IS OF RS.30 EACH\n CHIPS IS RS.10 EACH");
        Scanner sc =new Scanner(System.in);
        int number;
        chocolate choco = new chocolate();
        Cold_Drink drink = new Cold_Drink();
        Chips chips = new Chips();
        System.out.println("\nEnter the number of chocolates:- ");
        number = sc.nextInt();
        choco.input(number);
        System.out.println("\nEnter the number of Cold drinks:- ");
        number = sc.nextInt();
        drink.input(number);
        System.out.println("\nEnter the number of Chips:- ");
        number = sc.nextInt();
        chips.input(number);
        int Total = choco.total() + drink.total() + chips.total();
        System.out.println("\n\nTOTAL AMOUNT TO BE PAID = "+Total);
    }
}
