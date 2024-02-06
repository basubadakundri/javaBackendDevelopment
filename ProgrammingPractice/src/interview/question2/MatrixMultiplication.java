package interview.question2;
public class MatrixMultiplication {
    public static int[][] multiplyMatrices(int[][] A, int[][] B) {
		int[][] C = new int[A.length][A[0].length];
		if (A.length != A[0].length) {
			throw new IllegalArgumentException();
		}

		return C;
    }

    public static void main(String[] args) {
        int[][] matrixA = {{1, 2}, {3, 4}};
        int[][] matrixB = {{5, 6}, {7, 8}};
        int[][] result = multiplyMatrices(matrixA, matrixB);
        // Print or display the result
    }
}