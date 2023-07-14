import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MatrixTest {
    private Matrix newMatrix=new Matrix();
    @Test
    void isSquareMatrix() {
        int[][] matrix1 = new int[5][5];
        assertTrue(newMatrix.isSquareMatrix(matrix1));
    }
    @Test
    void isSquareMatrix2() {
        int[][] matrix4 = new int[5][6];
        assertFalse(newMatrix.isSquareMatrix(matrix4));
    }
    @Test
    void isSquareMatrix3() {
        int[][] matrix3 = new int[][]{{1,2,3,4,5}, {1,2,3,4}, {1,2,3,4,5}, {1,2,3,4,5}, {1,2,3,4,5}};
        assertFalse(newMatrix.isSquareMatrix(matrix3));
    }
    @Test
    void isSquareMatrixNotNull() {
        int[][] array = null;
        assertNotNull(newMatrix);
    }

    @Test
    void getAverageCountArray() {
        int[] array ={1,2,3,4,5};
        assertEquals(3.0,newMatrix.getAverageCountArray(array));

    }
}