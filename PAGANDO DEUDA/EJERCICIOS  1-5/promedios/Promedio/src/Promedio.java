import java.util.Scanner;
public class Promedio {
    public static void main(String[] args) throws Exception {
       
        Scanner teclado = new Scanner(System.in);

        System.out.println("I.E Santi");
        System.out.println("El grado 8°A solo cuenta con 5 estudiantes");
        System.out.println("Ingrese sus notas");
        double suma = 0;
        String[] estudiante = {
            "Marcos", "Sara", "Daniela", "Sebastian", "Camilo"
        };
        double [] notas = new double[5];
        int longitud = estudiante.length;
        double promedio ;
    
        for (int i = 0; i < longitud; i++) {
            System.out.print(estudiante[i]+"  ");
            notas[i] = teclado.nextDouble();
        }
        System.out.println("");
        for (int i = 0; i < notas.length; i++) {
            
            System.out.println(estudiante[i]+" saco: "+notas[i]);
            suma = suma + notas[i];
            if (notas[i]>=3) {
                System.out.println("Aprobado");
            } else {
                System.out.println("Desaprobado");
            }

        }
        promedio = suma / (longitud);
        System.out.println("El promedio del salon es: "+promedio);

        teclado.close();
    }
}
