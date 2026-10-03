import java.util.Scanner;
public class Matriz {
    public static void main(String[] args) throws Exception {
        Scanner teclado = new Scanner(System.in);
        int[][] numeros = new int[3][3];

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print("Ingrese un número: ");
                numeros[i][j] = teclado.nextInt();
            }
        }

        System.out.println("Matriz:");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(numeros[i][j] + " ");
            }
            System.out.println();
        }
        int suma = 0;
        int pares = 0;
        int mayor = numeros[0][0];
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                suma = suma + numeros[i][j];
                if (numeros[i][j] % 2 == 0) {
                    pares++;
                }
                if (numeros[i][j] > mayor) {
                    mayor = numeros[i][j];
                }
            }
        }
        System.out.println("Suma: " + suma);
        System.out.println("Cantidad de pares: " + pares);
        System.out.println("Numero mayor: " + mayor);



        teclado.close();
    }
}
