public class Matrix {
    public boolean isSquareMatrix(int[][] matrix) {
        if (matrix == null) {
            return false;
        }
        for (int i = 0; i < matrix.length; i++) {
            if(matrix.length != matrix[i].length){
                return false;
            }
        }
        return true;
    }
    public double getAverageCountArray(int[] array){
        double average = 0;
        int sum = 0;
        for (int i = 0; i < array.length; i++) {
            sum += array[i];
        }
        average = (double) sum / array.length;
        return average;
    }
}
