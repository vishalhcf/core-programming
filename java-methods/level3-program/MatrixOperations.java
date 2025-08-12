import java.util.Random;

public class MatrixOperations {

    static Random rand = new Random();

    // Method to generate random matrix
    public static double[][] generateMatrix(int rows, int cols) {
        double[][] matrix = new double[rows][cols];
        for(int i = 0; i < rows; i++)
            for(int j = 0; j < cols; j++)
                matrix[i][j] = rand.nextInt(10) + 1; // random 1 to 10
        return matrix;
    }

    // Method to add two matrices
    public static double[][] add(double[][] A, double[][] B) {
        int rows = A.length, cols = A[0].length;
        double[][] result = new double[rows][cols];
        for(int i = 0; i < rows; i++)
            for(int j = 0; j < cols; j++)
                result[i][j] = A[i][j] + B[i][j];
        return result;
    }

    // Method to subtract two matrices
    public static double[][] subtract(double[][] A, double[][] B) {
        int rows = A.length, cols = A[0].length;
        double[][] result = new double[rows][cols];
        for(int i = 0; i < rows; i++)
            for(int j = 0; j < cols; j++)
                result[i][j] = A[i][j] - B[i][j];
        return result;
    }

    // Method to multiply two matrices
    public static double[][] multiply(double[][] A, double[][] B) {
        int r1 = A.length, c1 = A[0].length, c2 = B[0].length;
        double[][] result = new double[r1][c2];
        for(int i = 0; i < r1; i++)
            for(int j = 0; j < c2; j++)
                for(int k = 0; k < c1; k++)
                    result[i][j] += A[i][k] * B[k][j];
        return result;
    }

    // Method to find transpose
    public static double[][] transpose(double[][] matrix) {
        int rows = matrix.length, cols = matrix[0].length;
        double[][] transposed = new double[cols][rows];
        for(int i = 0; i < rows; i++)
            for(int j = 0; j < cols; j++)
                transposed[j][i] = matrix[i][j];
        return transposed;
    }

    // Determinant of 2x2
    public static double determinant2x2(double[][] m) {
        return m[0][0]*m[1][1] - m[0][1]*m[1][0];
    }

    // Determinant of 3x3
    public static double determinant3x3(double[][] m) {
        return m[0][0]*(m[1][1]*m[2][2] - m[1][2]*m[2][1])
             - m[0][1]*(m[1][0]*m[2][2] - m[1][2]*m[2][0])
             + m[0][2]*(m[1][0]*m[2][1] - m[1][1]*m[2][0]);
    }

    // Inverse of 2x2
    public static double[][] inverse2x2(double[][] m) {
        double det = determinant2x2(m);
        if(det == 0) return null;
        double[][] inv = {
            { m[1][1]/det, -m[0][1]/det },
            { -m[1][0]/det, m[0][0]/det }
        };
        return inv;
    }

    // Inverse of 3x3
    public static double[][] inverse3x3(double[][] m) {
        double det = determinant3x3(m);
        if(det == 0) return null;

        double[][] cofactor = new double[3][3];
        cofactor[0][0] =  m[1][1]*m[2][2] - m[1][2]*m[2][1];
        cofactor[0][1] = -(m[1][0]*m[2][2] - m[1][2]*m[2][0]);
        cofactor[0][2] =  m[1][0]*m[2][1] - m[1][1]*m[2][0];
        cofactor[1][0] = -(m[0][1]*m[2][2] - m[0][2]*m[2][1]);
        cofactor[1][1] =  m[0][0]*m[2][2] - m[0][2]*m[2][0];
        cofactor[1][2] = -(m[0][0]*m[2][1] - m[0][1]*m[2][0]);
        cofactor[2][0] =  m[0][1]*m[1][2] - m[0][2]*m[1][1];
        cofactor[2][1] = -(m[0][0]*m[1][2] - m[0][2]*m[1][0]);
        cofactor[2][2] =  m[0][0]*m[1][1] - m[0][1]*m[1][0];

        double[][] adjugate = transpose(cofactor);
        double[][] inverse = new double[3][3];

        for(int i = 0; i < 3; i++)
            for(int j = 0; j < 3; j++)
                inverse[i][j] = adjugate[i][j] / det;

        return inverse;
    }

    // Display matrix
    public static void displayMatrix(double[][] matrix) {
        for(double[] row : matrix) {
            for(double val : row)
                System.out.print(Math.round(val * 100.0) / 100.0 + "\t");
            System.out.println();
        }
    }

    // Main method
    public static void main(String[] args) {
        // 3x3 Matrix Examples
        double[][] A = generateMatrix(3, 3);
        double[][] B = generateMatrix(3, 3);

        System.out.println("Matrix A:");
        displayMatrix(A);
        System.out.println("Matrix B:");
        displayMatrix(B);

        System.out.println("\nAddition (A + B):");
        displayMatrix(add(A, B));

        System.out.println("\nSubtraction (A - B):");
        displayMatrix(subtract(A, B));

        System.out.println("\nMultiplication (A x B):");
        displayMatrix(multiply(A, B));

        System.out.println("\nTranspose of A:");
        displayMatrix(transpose(A));

        System.out.println("\nDeterminant of A:");
        System.out.println(Math.round(determinant3x3(A) * 100.0) / 100.0);

        System.out.println("\nInverse of A:");
        double[][] inv = inverse3x3(A);
        if (inv == null)
            System.out.println("Matrix A is non-invertible.");
        else
            displayMatrix(inv);
    }
}