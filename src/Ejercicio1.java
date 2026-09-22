import java.util.Scanner;

public class Ejercicio1 {
    public static void main(String[] args) throws Exception {
        // creacion del vector unidimencional
        byte [] sector = new byte[10];
        //definir todas las variables necesarias
        byte cantidad=10;
        int SumaTotal= 0;
        int Mayor = 0;
        int PosMay=0;
        int cantidadSuperProm=0;
        Scanner teclado = new Scanner(System.in);
        //mostrar mensaje a usuario
        System.out.println("");
        System.out.println("Bienvenido al software CalcuAgua desarrollado por SANTINDUSTRY");
        System.out.println("");
        System.out.println("La empresa Emcar necesita calcular el consumo de agua en 10 sectores");
        System.out.println("Por favor ingrese el consumo del agua, desde el sector 1 hasta el 10");
        System.out.println("");
       
        //rellenar la matriz

        for (byte i = 0; i < cantidad; i++) {
            //no pude hacer que muestre mensaje de error al usar valores menores a 0
            sector[i]=teclado.nextByte();
            //suma del total
            SumaTotal= SumaTotal+sector[i];
            //posicion y numero mayor
            if (sector[i]> Mayor) {
                Mayor = sector[i];
                PosMay = (i+1);
            }



        }
        //calcular promedio
        int Promedio = (SumaTotal/cantidad);
        
        


       for (int i = 0; i < cantidad; i++) {
        if (Promedio<sector[i]) {
            cantidadSuperProm++;
        }
       }
       
      for (int i = 0; i < sector.length; i++) {
        System.out.println("Sector "+(i+1)+":  ");
      }





















    }
}
