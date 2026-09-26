import java.util.Scanner;

public class Ejercicio2 {
    public static void main(String[] args) throws Exception {
        Scanner teclado = new Scanner(System.in);
        int[][] produccion = new int[4][5];

        //ingresar los datos
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 5; j++) {
                do {
                    System.out.print("Ingrese la producción de la máquina "
                            + (i + 1) + " en el día " + (j + 1) + ": ");
                    produccion[i][j] = teclado.nextInt();
                    if (produccion[i][j] < 0) {
                        System.out.println("la producción no puede ser negativa.");
                    }
                } while (produccion[i][j] < 0);
            }
        }
        //total producido por cada máquina
        System.out.println("--- TOTAL POR MÁQUINA ---");


        for (int i = 0; i < 4; i++) {
            int totalMaquina = 0;
            for (int j = 0; j < 5; j++) {
                totalMaquina=totalMaquina+produccion[i][j];
            }
            System.out.println("Maquina " + (i + 1) + ": " + totalMaquina + " piezas");
        }

        //total producido por día

        System.out.println("--- TOTAL POR DÍA ---");

        for (int j = 0; j < 5; j++) {
            int totalDia = 0;
            for (int i = 0; i < 4; i++) {
                totalDia = totalDia + produccion[i][j];
            }
            System.out.println("Día " + (j + 1) + ": " + totalDia + " piezas");
           
        }

        // contar registros menores a 20
        int menores20 = 0;

        for (int i = 0; i < 4; i++) {

            for (int j = 0; j < 5; j++) {

                if (produccion[i][j] < 20) {
                    menores20++;
                }
            }
        }

        // mostrar resultados
        System.out.println("--- RESULTADOS ---");

        System.out.println("Registros inferiores a 20 piezas: " + menores20);

        // mostrar matriz completa
        System.out.println("--- MATRIZ DE PRODUCCIÓN ---");

        System.out.println("            Día 1  Día 2  Día 3  Día 4  Día 5");

        for (int i = 0; i < 4; i++) {
 
            System.out.print("Máquina " + (i+1) + "     ");

            for (int j = 0; j < 5; j++) {
                System.out.print(produccion[i][j] + "      ");
            }

            System.out.println();
        }

        teclado.close();
    }
}
