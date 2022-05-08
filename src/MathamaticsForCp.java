import java.util.Arrays;

public class MathamaticsForCp {

    public static void main(String[] args) {
int n = 3000;
      boolean[] isPrime = seiveeratosthanes(n);
        for (int i=0;i<=n;i++){
            System.out.println(i + " "+ isPrime[i]);
        }

    }

    static  boolean[] seiveeratosthanes(int n) {

        boolean[] isPrime = new boolean[n + 1];
        Arrays.fill(isPrime,true);
        isPrime[0] = false;
        isPrime[1] = false;

        for (int i = 2;i * i <= n; i++){

            for (int j=2*i;j<=n;j+=i){

                isPrime[j] = false;
            }


        }


        return isPrime;
    }
}
