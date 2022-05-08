import java.util.Arrays;

public class Reversearr {

    public static void main(String[] args) {

        int[] arr = {1,2,3,4,5,6,7,8,9,10};

        changeThePosition(arr,0,6);

        System.out.println(Arrays.toString(arr));
        int[] mynum = {1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20,21,22,23,24,25,26,27,28,29,30};
        reverse(mynum);

        System.out.print(Arrays.toString(mynum));



    }



    static  void changeThePosition(int[] arr,int indexo ,int indext){

        int temp = arr[indexo];
        arr[indexo] = arr[indext];
        arr[indext] = temp;


    }

    static void reverse(int[] mynum){

        int start = 0;
        int end = mynum.length -1;

        while (start <= end){

            changeThePosition(mynum,start,end);

            start++;
            end--;

        }
    }
}
