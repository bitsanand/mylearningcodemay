import java.util.Arrays;
import java.util.Scanner;

public class StringPalindrom {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
      strinpalindrom("yuotube.com");

      plindrome2("earth");
      System.out.print("Plese Enter Your String : ");
      String str = input.nextLine();
      int right = str.length() - 1;

      System.out.println(right);

      boolean ans = isPlain(str,0,right);
      System.out.println("The Awnser Is : "+ans);

    }

    static  void  strinpalindrom(String name){

        String revers = "";

        for (int index = name.length()-1;index >= 0;index -- ){

         revers = revers + name.charAt(index);

        }

        System.out.println(revers);

    }

    static  void plindrome2(String name2){

        String reverse = "";
        int index = name2.length() -1;
        while (index >= 0){

            reverse = reverse+name2.charAt(index);

            index--;

        }

        System.out.println(reverse);


    }
    static boolean isPlain(String str , int left,int right){

        char[] index = str.toCharArray();
        if (left >= right){
            return true;
        }
        if (index[left] != index[right]){

            return  false;
        }

        return isPlain(str,left +1 ,right -1);
    }
}
