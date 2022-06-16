package ArrTest;

public class ArrayTest {
//    int[] numbers = new int[] {10, 20, 30};
//    int[] numsbers = {10, 20, 30};

    public static void main(String[] args) {

        int[] arr = new int[10]; //0으로 초기화
        int total = 0;

        for(int i=0; i<arr.length; i++) {
            arr[i] = i+1;
        }

        for(int n : arr) {
            total += n;
        }

        System.out.println(total);
    }

}
