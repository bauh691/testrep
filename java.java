import java.util.Arrays;

public class MatrixSorting {
    
    // Method 1: Sort by row
    public static void sortByRow(double[][] matrix) {
        for (double[] row : matrix) {
            Arrays.sort(row);
        }
    }
    
    // Method 2: Sort by column
    public static void sortByColumn(double[][] matrix) {
        for (int i = 0; i < matrix[0].length; i++) {
            double[] column = new double[matrix.length];
            for (int j = 0; j < matrix.length; j++) {
                column[j] = matrix[j][i];
            }
            Arrays.sort(column);
            for (int j = 0; j < matrix.length; j++) {
                matrix[j][i] = column[j];
            }
        }
    }
    
    // Method 3: Sort by element
    public static void sortByElement(double[][] matrix) {
        double[] array = new double[matrix.length * matrix[0].length];
        int k = 0;
        for (double[] row : matrix) {
            for (double element : row) {
                array[k++] = element;
            }
        }
        Arrays.sort(array);
        k = 0;
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                matrix[i][j] = array[k++];
            }
        }
    }

    // Main method for testing
    public static void main(String[] args) {
        double[][] matrix = {{3.2, 1.0, 2.5}, {2.8, 1.5, 0.9}, {0.8, 2.7, 1.3}};
        System.out.println("Original matrix:");
        printMatrix(matrix);
        sortByRow(matrix);
        System.out.println("Sorted by row:");
        printMatrix(matrix);
        sortByColumn(matrix);
        System.out.println("Sorted by column:");
        printMatrix(matrix);
        sortByElement(matrix);
        System.out.println("Sorted by element:");
        printMatrix(matrix);
    }
    
    // Helper method for printing matrix
    public static void printMatrix(double[][] matrix) {
        for (double[] row : matrix) {
            for (double element : row) {
                System.out.print(element
