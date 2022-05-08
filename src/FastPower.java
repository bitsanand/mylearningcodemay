public class FastPower {
    public static void main(String[] args) {



        long ans = fastpower(3978432,5,100000000);
        System.out.print(ans);



    }


    static  long fastpower(long a, long b,int n){
        long result = 1;

        while (b > 0){
            if ((b & 1) !=0){
                result = (result * a %n) % n;

            }
                a = (a % n * a % n) % n ;
                b = b >> 1;


        }

        return  result;
    }
}
