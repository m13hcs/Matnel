import java.util.Scanner;

public class matrixPlusMinus {

        public static void main(String args[]) {

            Scanner sc = new Scanner(System.in);
            int n;

            System.out.print("Enter the base of squared matrices: ");
            n = sc.nextInt();
            int[][] arr1 = new int[n][n];
            int[][] arr2 = new int[n][n];
            int[][] arr3 = new int[n][n];

            //USER ENTERS THE 1ST MATRIX
            System.out.print("Enter the elements of 1st martix row wise \n");
            for (int i = 0; i < n; i++) {
                for (int j = 0; j < n; j++) {

                    arr1[i][j] = sc.nextInt();
                }
            }

            //USER ENTERS THE 2ND MATRIX
            System.out.print("Enter the elements of 2nd martix row wise \n");
            for (int i = 0; i < n; i++) {
                for (int j = 0; j < n; j++) {
                    arr2[i][j] = sc.nextInt();
                }
            }

            //SUM OF TWO MATRICES
            for (int i = 0; i < n; i++) {
                for (int j = 0; j < 3; j++) {
                    arr3[i][j] = arr1[i][j] + arr2[i][j];
                    System.out.print(arr3[i][j] + " ");
                }
                System.out.println();
            }

            //DIFFERENCE OF TWO MATRICES
            for (int i = 0; i < n; i++) {
                for (int j = 0; j < 3; j++) {
                    arr3[i][j] = arr1[i][j] - arr2[i][j];
                    System.out.print(arr3[i][j] + " ");
                }
                System.out.println();


            }

        }}