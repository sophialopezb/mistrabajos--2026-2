//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        int[][] matriz = {{8, 4, 3},
                         {4, 2, 1},
                         {7, 5, 9}
                };

         // 1. Imprimir matriz
        imprimirMatriz(matriz);

        // 2. Sumar todos los números
        int suma = sumarMatriz(matriz);
        System.out.println("Suma: " + suma);

        // 3. Sumar diagonal
        int sumaDiagonal = sumarDiagonal(matriz);
        System.out.println("Suma diagonal: " + sumaDiagonal);

        // 4. Crear espiral
        int[][] espiral = crearEspiral(4, 4);
        System.out.println("Espiral:");
        imprimirMatriz(espiral);
    }
    public static void imprimirMatriz(int[][] matriz) {
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                System.out.print(matriz[i][j] + " ");
            }
            System.out.println();
        }
    }
    public static int sumarMatriz(int[][] matriz) {
        int suma = 0;
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                suma = suma + matriz[i][j];
            }
        }
        return suma;
    }

    public static int sumarDiagonal(int[][] matriz) {
        int sumaDiagonal= 0;
        for (int i = 0; i < matriz.length; i++) {
            sumaDiagonal = sumaDiagonal + matriz[i][i];
        }
        return sumaDiagonal;
    }
    public static int[][] crearEspiral(int filas, int columnas) {
        int[][] matriz = new int[filas][columnas];
        int numero = 1;
        int inicio = 0;
        int fin = filas - 1;

        for (int vuelta = 0; vuelta < filas; vuelta++) {
            for (int j = inicio; j <= fin; j++) {
                matriz[inicio][j] = numero;
                numero++;
            }

            for (int i = inicio + 1; i <= fin; i++) {
                matriz[i][fin] = numero;
                numero++;
            }

            for (int j = fin - 1; j >= inicio; j--) {
                matriz[fin][j] = numero;
                numero++;
            }

            for (int i = fin - 1; i > inicio; i--) {
                matriz[i][inicio] = numero;
                numero++;
            }

            inicio++;
            fin--;
        }

        return matriz;
    }
}

