import java.util.Scanner;

public class LOperators {

    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        int n;

        System.out.print("Enter the base of squared matrices: ");
        n = sc.nextInt();
        float[][] array = new float[n][n];
        float[][] arr_result = new float[n][n];

        //USER ENTERS THE MATRIX
        System.out.print("Enter the elements of martix row wise \n");
        for (int i = 0; i < n; i++){
           for (int j = 0; j < n; j++){

                array[i][j] = sc.nextFloat();
            }
        }

        System.out.println("***********LINEAR TRANSFORMATION FROM Rn TO Rn***********");
        int menu;
        int base;
        int angle;

        switch(n){

            case(2):
                System.out.println("SELECT OPTION: ");
                System.out.println("**REFLECTION OPERATORS** \n\n Reflection about: \n 1. y-axis \n 2. x-axis  \n 3. x=y \n ");
                System.out.println("**ORTHOGONAL PROJECTION OPERATORS**\n\n Projection about: \n 4. y-axis\n 5.x-axis \n");
                System.out.println("**ROTATIONAL OPERATORS**\n\n 6.About Angle 'theta'\n ");
                System.out.print("ENTER OPTION: ");
                menu=sc.nextInt();
                break;

            case(3):
                System.out.println("SELECT OPTION: ");
                System.out.println("**REFLECTION OPERATORS** \n\n Reflection about: \n 10. xy-axis \n 20. xz-axis  \n 30. yz \n ");
                System.out.println("**ORTHOGONAL PROJECTION OPERATORS**\n\n Projection about: \n 40. xy-axis \n  50. xz-axis  \n 60. yz \n ");
                System.out.println("**ROTATIONAL OPERATORS**\n\n Counter-Clockwise rotation about\n 70.y-axis\n 80.x-axis\n 90.z-axis\n through angle 'theta'\n");
                System.out.print("ENTER OPTION: ");
                menu=sc.nextInt();
                break;
            default:
                menu=0;
                System.out.println("Transformation can either be two-dimensional or three-dimensional");
                break;
        }


        float[][] arr1 = {{-1,0},{0,1}};
        double[][] arr2 = {{1,0},{0,-1}};
        double[][] arr3 = {{0,1},{1,0}};
        double[][] arr4 = {{0,0},{0,1}};
        double[][] arr5 = {{1,0},{0,0}};

        double[][] arr10 = {{1,0,0},{0,1,0},{0,0,-1}};
        double[][] arr20 = {{1,0,0},{0,-1,0},{0,0,1}};
        double[][] arr30 = {{-1,0,0},{0,1,0},{0,0,1}};
        double[][] arr40 = {{1,0,0},{0,1,0},{0,0,0}};
        double[][] arr50 = {{1,0,0},{0,0,0},{0,0,1}};
        double[][] arr60 = {{0,0,0},{0,1,0},{0,0,1}};


        switch(menu){

            case(1):
                //MULTIPLICATION
                for (int i = 0; i < 2; i++) {
                    for (int j = 0; j < 2; j++) {
                        for (int k = 0; k < 2; k++) {
                            arr_result[i][j] =  (arr_result[i][j] + array[i][k] * arr1[k][j]);
                        }
                    }
                //PRINT
                    for (int a = 0; a < 2; a++) {
                        for (int b = 0; b < 2; b++) {
                            System.out.print(arr_result[a][b]);
                        }
                    }
                break;

                }
            case(2):
                for (int i = 0; i < n; i++) {
                    for (int j = 0; j < n; j++) {
                        for (int k = 0; k < n; k++) {
                            arr_result[i][j] = (float) (arr_result[i][j] + array[i][k] * arr2[k][j]);
                        }
                    }
                }
                    //PRINT
                    for (int a = 0; a < n; a++) {
                        for (int b = 0; b < n; b++) {
                            System.out.print(arr_result[a][b] + " ");
                        }
                        System.out.println();
                    }
                    break;
            case(3):
                for (int i = 0; i < n; i++) {
                    for (int j = 0; j < n; j++) {
                        for (int k = 0; k < n; k++) {
                            arr_result[i][j] = (float) (arr_result[i][j] + array[i][k] * arr3[k][j]);
                        }
                    }
                }
                //PRINT
                for (int a = 0; a < n; a++) {
                    for (int b = 0; b < n; b++) {
                        System.out.print(arr_result[a][b] + " ");
                    }
                    System.out.println();
                }
                break;
            case(4):
                for (int i = 0; i < n; i++) {
                    for (int j = 0; j < n; j++) {
                        for (int k = 0; k < n; k++) {
                            arr_result[i][j] = (float) (arr_result[i][j] + array[i][k] * arr4[k][j]);
                        }
                    }
                }
                //PRINT
                for (int a = 0; a < n; a++) {
                    for (int b = 0; b < n; b++) {
                        System.out.print(arr_result[a][b] + " ");
                    }
                    System.out.println();
                }
                break;
            case(5):
                for (int i = 0; i < n; i++) {
                    for (int j = 0; j < n; j++) {
                        for (int k = 0; k < n; k++) {
                            arr_result[i][j] = (float) (arr_result[i][j] + array[i][k] * arr5[k][j]);
                        }
                    }
                }
                //PRINT
                for (int a = 0; a < n; a++) {
                    for (int b = 0; b < n; b++) {
                        System.out.print(arr_result[a][b] + " ");
                    }
                    System.out.println();
                }
                break;
            case(6):
                System.out.println("Enter the angle 'theta' (in degrees): ");
                angle = sc.nextInt();
                double[][] arr6 = {{Math.sin(angle),-Math.sin(angle)},{Math.sin(angle),Math.cos(angle)}};
                for (int i = 0; i < n; i++) {
                    for (int j = 0; j < n; j++) {
                        for (int k = 0; k < n; k++) {
                            arr_result[i][j] = (float) (arr_result[i][j] + array[i][k] * arr6[k][j]);
                        }
                    }
                }
                //PRINT
                for (int a = 0; a < n; a++) {
                    for (int b = 0; b < n; b++) {
                        System.out.print(arr_result[a][b] + " ");
                    }
                    System.out.println();
                }
                break;
            case(10):
                for (int i = 0; i < 3; i++) {
                    for (int j = 0; j < 3; j++) {
                        for (int k = 0; k < 3; k++) {
                            arr_result[i][j] = (float) (arr_result[i][j] + array[i][k] * arr10[k][j]);
                        }
                    }
                }
                //PRINT
                for (int a = 0; a < n; a++) {
                    for (int b = 0; b < n; b++) {
                        System.out.print(arr_result[a][b] + " ");
                    }
                    System.out.println();
                }
                break;
            case(20):
                for (int i = 0; i < n; i++) {
                    for (int j = 0; j < n; j++) {
                        for (int k = 0; k < n; k++) {
                            arr_result[i][j] = (float) (arr_result[i][j] + array[i][k] * arr20[k][j]);
                        }
                    }
                }
                //PRINT
                for (int a = 0; a < n; a++) {
                    for (int b = 0; b < n; b++) {
                        System.out.print(arr_result[a][b] + " ");
                    }
                    System.out.println();
                }
                break;
            case(30):
                for (int i = 0; i < n; i++) {
                    for (int j = 0; j < n; j++) {
                        for (int k = 0; k < n; k++) {
                            arr_result[i][j] = (float) (arr_result[i][j] + array[i][k] * arr30[k][j]);
                        }
                    }
                }
                //PRINT
                for (int a = 0; a < n; a++) {
                    for (int b = 0; b < n; b++) {
                        System.out.print(arr_result[a][b] + " ");
                    }
                    System.out.println();
                }
                break;
            case(40):
                for (int i = 0; i < n; i++) {
                    for (int j = 0; j < n; j++) {
                        for (int k = 0; k < n; k++) {
                            arr_result[i][j] = (float) (arr_result[i][j] + array[i][k] * arr40[k][j]);
                        }
                    }
                }
                //PRINT
                for (int a = 0; a < n; a++) {
                    for (int b = 0; b < n; b++) {
                        System.out.print(arr_result[a][b] + " ");
                    }
                    System.out.println();
                }
                break;
            case(50):
                for (int i = 0; i < n; i++) {
                    for (int j = 0; j < n; j++) {
                        for (int k = 0; k < n; k++) {
                            arr_result[i][j] = (float) (arr_result[i][j] + array[i][k] * arr50[k][j]);
                        }
                    }
                }
                //PRINT
                for (int a = 0; a < n; a++) {
                    for (int b = 0; b < n; b++) {
                        System.out.print(arr_result[a][b] + " ");
                    }
                    System.out.println();
                }
                break;
            case(60):
                for (int i = 0; i < n; i++) {
                    for (int j = 0; j < n; j++) {
                        for (int k = 0; k < n; k++) {
                            arr_result[i][j] = (float) (arr_result[i][j] + array[i][k] * arr60[k][j]);
                        }
                    }
                }
                //PRINT
                for (int a = 0; a < n; a++) {
                    for (int b = 0; b < n; b++) {
                        System.out.print(arr_result[a][b] + " ");
                    }
                    System.out.println();
                }
                break;
            case(70):
                System.out.println("Enter angle (in degrees): ");
                int theta = sc.nextInt();
                double[][] arr70 = {{Math.cos(theta),0,Math.sin(theta)},{0,1,0},{-Math.sin(theta),0,Math.cos(theta)}};
                for (int i = 0; i < n; i++) {
                    for (int j = 0; j < n; j++) {
                        for (int k = 0; k < n; k++) {
                            arr_result[i][j] = (float) (arr_result[i][j] + array[i][k] * arr70[k][j]);
                        }
                    }
                }
                //PRINT
                for (int a = 0; a < n; a++) {
                    for (int b = 0; b < n; b++) {
                        System.out.print(arr_result[a][b] + " ");
                    }
                    System.out.println();
                }
                break;
            case(80):
                System.out.println("Enter angle (in degrees): ");
                int theta80 = sc.nextInt();
                double[][] arr80 = {{1,0,0},{0,Math.cos(theta80),-Math.sin(theta80)},{0,Math.sin(theta80),Math.cos(theta80)}};
                for (int i = 0; i < n; i++) {
                    for (int j = 0; j < n; j++) {
                        for (int k = 0; k < n; k++) {
                            arr_result[i][j] = (float) (arr_result[i][j] + array[i][k] * arr80[k][j]);
                        }
                    }
                }
                //PRINT
                for (int a = 0; a < n; a++) {
                    for (int b = 0; b < n; b++) {
                        System.out.print(arr_result[a][b] + " ");
                    }
                    System.out.println();
                }
                break;
            case(90):
                System.out.println("Enter angle (in degrees): ");
                int theta90 = sc.nextInt();
                double[][] arr90 = {{Math.cos(theta90),-Math.sin(theta90),0},{Math.sin(theta90),Math.cos(theta90),0},{0,0,1}};
                for (int i = 0; i < n; i++) {
                    for (int j = 0; j < n; j++) {
                        for (int k = 0; k < n; k++) {
                            arr_result[i][j] = (float) (arr_result[i][j] + array[i][k] * arr90[k][j]);
                        }
                    }
                }
                //PRINT
                for (int a = 0; a < n; a++) {
                    for (int b = 0; b < n; b++) {
                        System.out.print(arr_result[a][b] + " ");
                    }
                    System.out.println();
                }
                break;


        }

    }
}
