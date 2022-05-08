
import  java.util.Arrays;
import java.util.Scanner;

public class Swap {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
int factorialfindnumber;
long  factorial = 1;
System.out.print("Please Enter The Number For Find The Factorial : ");
factorialfindnumber = input.nextInt();



for (int index=1;index<=factorialfindnumber;index++){
    factorial = factorial *  index;


}
        System.out.print("The Factorial of "+ factorialfindnumber+ " is : "+ factorial );






    }
}