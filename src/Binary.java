public class Binary {

    public static void main(String[] args) {

        binary(5);



    }

    static  void binary(int num){
       int ans = num % 2;

        System.out.println(ans);

        int nine = 6;
        int five = 3;

        System.out.println(nine << five);

        if ((nine & 1) == 0){

            System.out.println("Even");
        }else{
            System.out.println("Odd");
        }

        int a = 500;
        int b = 1000;

       a = a^b;
        System.out.println(" a = "+ a+ " "+"b = "+ b);
       b = a^b;
        System.out.println(" a = "+ a+ " "+"b = "+ b);
       a = a^b;

        System.out.println(" a = "+ a+ " "+"b = "+ b);

        int ab = ~5;

        System.out.println("anand"+ ab);


    }
}
