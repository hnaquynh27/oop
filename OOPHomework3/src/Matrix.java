import java.util.Scanner;

public class Matrix {

    public static void main(String[] args) {
        System.out.println("Enter the row and column: ");
        int row1 = sc.nextInt();
        int col1 = sc.nextInt();
        int[][] mat1 = createRandomMatrix(row1, col1);

        System.out.println("Enter the row and column: ");
        int row2 = sc.nextInt();
        int col2 = sc.nextInt();
        int[][] mat2 = createRandomMatrix(row2, col2);
        sc.close();

        if (haveSameDimension(mat1, mat2)) {
            System.out.println("Two matrixs have same dimension.");
        } else {
            System.out.println("Two matrixs don't have same dimension.");
        }

        System.out.println("The sum matrix of two matrixs is: ");
        add(mat1, mat2);

        System.out.println("The subtract matrix of two matrixs is: ");
        subtract(mat1, mat2);

        System.out.println("The product matrix of two matrixs is: ");
        multify(mat1, mat2);
    }

    static Scanner sc = new Scanner(System.in);

    static void createRandomMatrix(int[][] matrix) {
        for (int row = 0; row < matrix.length; row++) {
            for (int col = 0; col < matrix[0].length; col++) {
                matrix[row][col] = sc.nextInt();
            }
        }
    }

    static void createRandomMatrix(double[][] matrix) {
        for (int row = 0; row < matrix.length; row++) {
            for (int col = 0; col < matrix[0].length; col++) {
                matrix[row][col] = sc.nextInt();
            }
        }
    }

    static int[][] createRandomMatrix(int rows, int cols) {
        int[][] mat = new int[rows][cols];
        for (int row = 0; row < mat.length; row++) {
            for (int col = 0; col < mat[0].length; col++) {
                mat[row][col] = sc.nextInt();
            }
        }
        return mat;
    }

    static void printMat(int[][] mat) {
        for (int row = 0; row < mat.length; row++) {
            for (int col = 0; col < mat[0].length; col++) {
                System.out.print(mat[row][col] + " ");
            }
            System.out.println();
        }
    }

    static void printMat(double[][] mat) {
        for (int row = 0; row < mat.length; row++) {
            for (int col = 0; col < mat[0].length; col++) {
                System.out.println(mat[row][col]);
            }
        }
    }

    static boolean haveSameDimension(int[][] mat1, int[][] mat2) {
        if (mat1.length != mat2.length) {
            return false;
        }
        for (int row = 0; row < mat1.length; row++) {
            if (mat1[row].length == mat2[row].length) {
                continue;
            }
            return false;
        }
        return true;
    }

    static boolean haveSameDimension(double[][] mat1, double[][] mat2) {
        if (mat1.length != mat2.length) {
            return false;
        }
        for (int row = 0; row < mat1.length; row++) {
            if (mat1[row].length == mat2[row].length) {
                continue;
            }
            return false;
        }
        return true;
    }

    static void add(int[][] mat1, int[][] mat2) {
        if (!haveSameDimension(mat1, mat2)) {
            System.out.println("Cann't sum");
        } else {
            int[][] sumMat = new int[mat1.length][mat1[0].length];
            for (int row = 0; row < mat1.length; row++) {
                for (int col = 0; col < mat1[0].length; col++) {
                    sumMat[row][col] = mat1[row][col] + mat2[row][col];
                }
            }
            printMat(sumMat);
        }
    }

    static void add(double[][] mat1, double[][] mat2) {
        if (!haveSameDimension(mat1, mat2)) {
            System.out.println("Cann't sum");
        } else {
            double[][] sumMat = new double[mat1.length][mat1[0].length];
            for (int row = 0; row < mat1.length; row++) {
                for (int col = 0; col < mat1[0].length; col++) {
                    sumMat[row][col] = mat1[row][col] + mat2[row][col];
                }
            }
            printMat(sumMat);
        }
    }


    static void subtract(int[][] mat1, int[][] mat2) {
        if (!haveSameDimension(mat1, mat2)) {
            System.out.println("Cann't subtract");
        } else {
            int[][] resMat = new int[mat1.length][mat1[0].length];
            for (int row = 0; row < mat1.length; row++) {
                for (int col = 0; col < mat1[0].length; col++) {
                    resMat[row][col] = mat1[row][col] - mat2[row][col];
                }
            }
            printMat(resMat);
        }
    }

    static void subtract(double[][] mat1, double[][] mat2) {
        if (!haveSameDimension(mat1, mat2)) {
            System.out.println("Cann't subtract");
        } else {
            double[][] resMat = new double[mat1.length][mat1[0].length];
            for (int row = 0; row < mat1.length; row++) {
                for (int col = 0; col < mat1[0].length; col++) {
                    resMat[row][col] = mat1[row][col] - mat2[row][col];
                }
            }
            printMat(resMat);
        }
    }

    static void multify(int[][] mat1, int[][] mat2) {
        if (mat1[0].length != mat2.length) {
            System.out.println("Cann't multify");
        } else {
            int[][] resMat = new int[mat1.length][mat2[0].length];
            for (int row = 0; row < mat1.length; row++) {
                for (int col = 0; col < mat1[0].length; col++) {
                    resMat[row][col] = 0;
                    for (int k = 0; k < mat1[0].length; k++) {
                        resMat[row][col] += mat1[row][k] * mat2[k][col];
                    }
                }
            }
            printMat(resMat);
        }
    }

    static void multify(double[][] mat1, double[][] mat2) {
        if (mat1[0].length != mat2.length) {
            System.out.println("Cann't multify");
        } else {
            double[][] resMat = new double[mat1.length][mat2[0].length];
            for (int row = 0; row < mat1.length; row++) {
                for (int col = 0; col < mat1[0].length; col++) {
                    resMat[row][col] = 0;
                    for (int k = 0; k < mat1[0].length; k++) {
                        resMat[row][col] += mat1[row][k] * mat2[k][col];
                    }
                }
            }
            printMat(resMat);
        }
    }
}
