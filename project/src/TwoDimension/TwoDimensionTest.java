package TwoDimension;

public class TwoDimensionTest {
    public static void main(String[] args) {

        int[][] arr1 = {{1, 2, 3}, {4, 5, 6}};
        int[][] arr2 = new int[2][2];

        int i, j;

        for(i=0; i<arr1.length; i++) {
            for (j=0; j<arr1[0].length; j++) {
                System.out.print(arr1[i][j] + " ");
            }
            System.out.println("\t");
        }
    }
}


