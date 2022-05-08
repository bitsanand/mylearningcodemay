public class FastPower {
    public static void main(String[] args) {



        int ans = fastpower(5,5);
        System.out.print(ans);

    }
    static  int fastpower(int a, int b){
        int result = 1;

        while (b > 0){
            if ((b & 1) !=0){
                result = result * a;

            }
                a = a * a;
                b = b >> 1;


        }

        return  result;
    }
}
