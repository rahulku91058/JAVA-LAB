import java.util.Scanner;

public class MatrixMultiplication {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of rows of matrix1: ");
        int rowsA = scanner.nextInt();
        System.out.print("Enter the number of columns of matrix1: ");
        int columnsA = scanner.nextInt();

        System.out.print("Enter the number of rows of matrix2: ");
        int rowsB = scanner.nextInt();
        System.out.print("Enter the number of columns of matrix3: ");
        int columnsB = scanner.nextInt();

        if (columnsA != rowsB) {
            System.out.println("Matrix multiplication is not possible.");
        } else {
            int[][] matrixA = new int[rowsA][columnsA];
            int[][] matrixB = new int[rowsB][columnsB];

            System.out.println("Enter elements of matrix1:");
            inputMatrixElements(scanner, matrixA);

            System.out.println("Enter elements of matrix2:");
            inputMatrixElements(scanner, matrixB);

            int[][] resultMatrix = multiplyMatrices(matrixA, matrixB);

            System.out.println("Result of matrix multiplication:");
            printMatrix(resultMatrix);
        }

        scanner.close();
    }

    public static void inputMatrixElements(Scanner scanner, int[][] matrix) {
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                matrix[i][j] = scanner.nextInt();
            }
        }
    }

    public static int[][] multiplyMatrices(int[][] matrixA, int[][] matrixB) {
        int rowsA = matrixA.length;
        int columnsA = matrixA[0].length;
        int columnsB = matrixB[0].length;

        int[][] resultMatrix = new int[rowsA][columnsB];

        for (int i = 0; i < rowsA; i++) {
            for (int j = 0; j < columnsB; j++) {
                int sum = 0;
                for (int k = 0; k < columnsA; k++) {
                    sum += matrixA[i][k] * matrixB[k][j];
                }
                resultMatrix[i][j] = sum;
            }
        }

        return resultMatrix;
    }

    public static void printMatrix(int[][] matrix) {
        for (int[] row : matrix) {
            for (int element : row) {
                System.out.print(element + " ");
            }
            System.out.println();
        }
    }
}
