import java.util.Scanner;

public class Mathametic {

    public static void main(String[] args) {

        Scanner input  = new Scanner(System.in);

        System.out.print("Please Enter The Number : ");
        int myno = input.nextInt();

        int temp = myno;
        int reverse = 0;
        int remainder;

        while (temp != 0){

            remainder = temp % 10;
            reverse = reverse *  10 + remainder;

            temp = temp / 10;

            //System.out.println(reverse);

        } // while loop closing tag

        System.out.println("The Number Is "+reverse);


    } //main mathod closing tag

} // public class closing tag