package com.luv2code;

import java.util.Random;

public class MatrixTask {
    public static void main(String[] args) {
        try {
            int rows = 3;
            int cols = 4;

            byte[][] B = new byte[rows][cols];
            fillMatrix(B);

            System.out.println("Matrix B:");
            printMatrix(B);

            byte[][] C = transpose(B);

            System.out.println("\nMatrix C = BT:");
            printMatrix(C);

            int sumMin = sumOfRowMins(C);
            System.out.println("\nSum of minimum elements of each row in matrix C: " + sumMin);

        } catch (NegativeArraySizeException e) {
            System.err.println("Error: invalid matrix size.");
        } catch (ArrayIndexOutOfBoundsException e) {
            System.err.println("Error: array index out of bounds.");
        } catch (Exception e) {
            System.err.println("Unexpected error: " + e.getMessage());
        }
    }

    private static void fillMatrix(byte[][] matrix) {
        Random rand = new Random();
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                matrix[i][j] = (byte) (rand.nextInt(41) - 20);
            }
        }
    }

    private static void printMatrix(byte[][] matrix) {
        for (byte[] row : matrix) {
            for (byte val : row) {
                System.out.printf("%4d", val);
            }
            System.out.println();
        }
    }

    private static byte[][] transpose(byte[][] matrix) {
        int rows = matrix.length;
        int cols = matrix[0].length;
        byte[][] transposed = new byte[cols][rows];
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                transposed[j][i] = matrix[i][j];
            }
        }
        return transposed;
    }

    private static int sumOfRowMins(byte[][] matrix) {
        int sum = 0;
        for (byte[] row : matrix) {
            byte min = row[0];
            for (byte val : row) {
                if (val < min) {
                    min = val;
                }
            }
            sum += min;
        }
        return sum;
    }
}

