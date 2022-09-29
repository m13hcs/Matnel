import java.util.Scanner;

public class multiplyMatrix {
    public static void main(String[]args){
    int base;
    Scanner input = new Scanner(System.in);
    System.out.println("Enter the base of squared matrices: ");
    base = input.nextInt();
    float[][] array1 = new float[base][base];
    float[][] array2 = new float[base][base];
    int[][] array_result = new float[base][base];
        System.out.print("Enter the elements of Matrix1 row wise: \n");
        for (int i = 0; i < n; i++){
           for (int j = 0; j < n; j++){
            array1[i][j] = input.nextInt();
        }
    }
        System.out.print("Enter the elements of Matrix2 row wise:  \n");
        for (int i = 0; i < n; i++){
          for (int j = 0; j < n; j++){
            array2[i][j] = input.nextInt();
        }
    }
        for (int i = 0; i < n; i++){
            for (int j = 0; j < n; j++){
                 for (int k = 0; k < n; k++){
                array_result[i][j] = array_result[i][j] + array1[i][k] * array2[k][j];
            }
        }
    }
        System.out.println("Matrix Multiplication of Matrix1 and Matrix1 is :");
        for (int i = 0; i < n; i++){
            for (int j = 0; j < n; j++) {
            System.out.print(c[i][j] + " ");
        }
   
    }
     
}
}
