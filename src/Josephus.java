public class Josephus {

    public static void main(String[] args) {

        int ans = jos(5,3);
        System.out.print(ans);

    }

    static  int jos(int n , int k){


        if (n == 1){
            return  0;
        }

        return (jos(n-1,k) + k) % n;
    }
}
