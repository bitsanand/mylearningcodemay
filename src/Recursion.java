public class Recursion {

    public static void main(String[] args) {

        int ans = count(4,6);
System.out.println(ans);
    }

    static int count(int n , int m){


        if (n == 1 || m == 1){
            return 1;
        }

        return count(n -1 , m) + count(n , m-1);
    }
}
