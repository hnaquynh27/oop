import java.util.Scanner;

public class MultiplyMatrix {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args){
        int m = sc.nextInt();
        int n = sc.nextInt();
        int[][] a = inputMatrix(m, n);
        int[][] b = inputMatrix(n, m);
        int[][] c = multiplyMatrix(a, b);
    }

    static void printMatrix(int[][] mat){
        for (int i = 0; i < mat.length; i++){
            for (int j = 0; j < mat[0].length; j++){
                System.out.print(mat[i][j] + " ");
            }
            System.out.println();
        }
    }

    static int[][] inputMatrix(int m, int n){
        int[][] matrix = new int[m][n];

        for (int i = 0; i < m; i++){
            for (int j = 0; j < n; j++){
                matrix[i][j] = sc.nextInt();
            }
        }

        return matrix;
    }

    static int[][] multiplyMatrix(int[][] a, int[][] b){

        int[][] mulMatrix = new int[a.length][b[0].length];

        for (int i = 0; i < a.length; i++){
            for (int j = 0; j < b[0].length; j++){
                for (int k = 0; k < a.length; k++){
                    mulMatrix[i][j] += a [i][k] * b[k][j];
                }
                System.out.print(mulMatrix[i][j] + " ");
            }
            System.out.println();
        }
        return mulMatrix;
    }
}
