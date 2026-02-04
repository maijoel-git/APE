import java.util.Scanner;

public class OperacionesMatrices {

    public static void main(String[] args) {
        int filas = 2;
        int columnas = 3;
        
        // Definimos las matrizes A y B
        int[][] matrizA = new int[filas][columnas];
        int[][] matrizB = new int[filas][columnas];

        // Ingresamos los numeros para cada matriz
        System.out.println("Ingreso de Datos Matriz A ");
        completarMatrices(matrizA);
        
        System.out.println("Ingreso de Datos Matriz B ");
        completarMatrices(matrizB);
        
        System.out.println("Suma (A + B): \n");
        mostrarResultado(sumaMatriz(matrizA, matrizB));

        System.out.println("Resta (A - B): \n");
        mostrarResultado(restaMatriz(matrizA, matrizB));

        System.out.println("Multiplicacion (Elemento por Elemento): \n");
        mostrarResultado(multiplicacionMatriz(matrizA, matrizB));
    }

    // Para ubicar los numeros ingresados en cada posicion de la matriz
    public static void completarMatrices(int[][] matriz) {
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[0].length; j++) {
                System.out.print("Ingrese valor [" + i + "][" + j + "]: ");
                matriz[i][j] = sc.nextInt();
            }
        }
    }

    // Sistema 1 donde se hace la suma de la matriz
    public static int[][] sumaMatriz(int[][] a, int[][] b) {
        int[][] res = new int[2][3];
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 3; j++) {
                res[i][j] = a[i][j] + b[i][j];
            }
        }
        return res;
    }

    // Se hace la resta de la matriz
    public static int[][] restaMatriz(int[][] a, int[][] b) {
        int[][] res = new int[2][3];
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 3; j++) {
                res[i][j] = a[i][j] - b[i][j];
            }
        }
        return res;
    }

    // La multiplicaion de la matriz
    public static int[][] multiplicacionMatriz(int[][] a, int[][] b) {
        int[][] res = new int[2][3];
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 3; j++) {
                res[i][j] = a[i][j] * b[i][j];
            }
        }
        return res;
    }

    //Para mostrar el resulato de las operaciones
    public static void mostrarResultado(int[][] matriz) {
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[0].length; j++) {
                System.out.print(matriz[i][j] + "\t");
            }
            System.out.println();
        }
    }
}
