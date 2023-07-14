import java.util.Arrays;

public class Program {
    public static void main(String[] args) {
        int[][] matrix1 = new int[5][5];
        int[][] matrix4 = new int[5][6];
        showMatrix(matrix1);

        int[][] matrix3 = new int[][]{{1,2,3,4,5}, {1,2,3,4}, {1,2,3,4,5}, {1,2,3,4,5}, {1,2,3,4,5}};
        Matrix matrix2 = new Matrix();
        System.out.println(matrix2.isSquareMatrix(matrix1));

        showMatrix(matrix3);
        System.out.println(matrix2.isSquareMatrix(matrix3));

        showMatrix(matrix4);
        System.out.println(matrix2.isSquareMatrix(matrix4));
    }

    public static void showMatrix(int[][] matrix){
        for (int i = 0; i < matrix.length; i++) {
            System.out.println(Arrays.toString(matrix[i]));
        }
    }
}
