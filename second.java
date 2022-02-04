
import java.util.Scanner;
public class second
{
	public static void main(String[] args) {
      // program of average of 5 number with the help of scanner class
        Scanner sc =new Scanner(System.in);
        int []a = new int[5];
        System.out.println("Enter five element of array");
        for (int i = 0; i <5 ; i++) {
            a[i]=sc.nextInt();
        }
        float average;
        float sum=0;
        for (int i = 0; i <5 ; i++) {
            sum = sum+a[i];
        }
        average=sum/5;
        System.out.println("The Avg. of all elements of array is:- "+average);
        // maximum and minimum number
        int x,y;
        System.out.println("\ncomparing two numbers");
        System.out.println("Enter any two number");
        x=sc.nextInt();
        y=sc.nextInt();
        if (x>y){
            System.out.println(x+" is greater than "+y);
        }
        else if(x<y){
            System.out.println(y+" is greater than "+x);
        }
        else {
            System.out.println(x+" and "+y+" are equal");
        }
	}
}
