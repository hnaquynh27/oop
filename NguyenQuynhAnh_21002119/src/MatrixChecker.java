import java.util.Scanner;
public class MatrixChecker {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        int[][] mat = inputMatrix(sc);
        int[][] newMat = zeroMat(mat);
        System.out.println("New matrix is : ");
        printMat(newMat);
    }
    public static int[][] inputMatrix(Scanner sc){
        System.out.println("Enter matrix's rows :");
        int rows = sc.nextInt();
        System.out.println("Enter matrix's cols :");
        int cols = sc.nextInt();
        int[][] matrix = new int[rows][cols];
        System.out.println("Enter array : ");
        for(int i = 0; i < rows; i++) {
            for(int j = 0; j < cols; j++) {
                matrix[i][j] = sc.nextInt();
            }
        }
        return matrix;
    }
    public static int[][] zeroMat(int[][] mat) {
        for(int i = 0; i < mat.length;i++) {
            for(int j = 0; j < mat[0].length;j++) {
                if (mat[i][j] == 0) {
                    for(int k = 0; k < mat[0].length; k++) {
                        mat[i][k] = 0;
                    }
                    for(int l = 0; l < mat.length; l++) {
                        mat[l][j] = 0;
                    }
                }
            }
        }
        return mat;
    }
    public static void printMat(int[][] mat) {
        for (int i = 0; i < mat.length; i++) {
            for (int j = 0; j < mat[0].length; j++) {
                System.out.print(mat[i][j]+" ");
            }
            System.out.println();
        }
    }

}