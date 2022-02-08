/*Program for prime and non-prime no.s and factoial of numbers in a array (KAUSTUB DUTT PANDEY)*/
import java.util.Scanner;
public class fifth_a {
    public static boolean isPrime(int a)
    {
        // Corner case
        if (a <= 1)
            return false;
      
        // Check from 2 to a-1
        for (int i = 2; i < a; i++)
            if (a % i == 0)
                return false;
      
        return true;
    }
    public static void factorial(int b)
    {
        if(b==0)
        {
            System.out.println("Factorial of "+ b + " is = 1");
        }
        else
        {
            int temp = 1;
            for(int i=1;i<=b;i++){
                temp=temp*i;
            }
            System.out.println("The Factorial of "+ b + " is = "+ temp);
     
        }
    }
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        int []a = new int[50];
        int n ;
        System.out.println("Enter the size of array:- ");
        n=sc.nextInt();
        System.out.println("Enter the elements of array");
        for (int i = 0; i <n ; i++) {
            a[i]=sc.nextInt();
        }
        System.out.println("\nThe prime numbers in the given array are:-"); 
        for(int i=0; i<n;i++){
            if(isPrime(a[i])== true){
              System.out.print(a[i]+",");

            }

        }
        System.out.println("\n\nThe Non-prime numbers in the given array are:-"); 
        for(int i=0; i<n;i++){
            if(isPrime(a[i])== false){
              System.out.print(a[i]+",");

            }

        }
        System.out.println("\n\nThe factorials of all elements are as follows:- ");
        for(int i=0;i<n;i++){
            factorial(a[i]);
        }

    }
    
}
