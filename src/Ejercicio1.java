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

        for (int i = 0; i < 10; ) {
            

            do {
                System.out.println("Ingrese el consumo del sector "+(i+1));
                sector[i]=teclado.nextByte();
                if (sector[i]<0) {
                    System.out.println("Error, vuelve a ingresar el numero");
                }


            } while (sector[i]<0);
    

          //suma del total
            SumaTotal= SumaTotal+sector[i];
            //posicion y numero mayor

            if (sector[i]> Mayor) {
                Mayor = sector[i];
                PosMay = (i+1);
            }


            i++;
        }
        //calcular promedio
        double Promedio = (SumaTotal/10);
        
        System.out.println(" ");

        for (int i = 0; i < cantidad; i++) {
           

            if (Promedio<sector[i]) {
              cantidadSuperProm++;

            }

           
            System.out.println("Sector "+(i+1)+":  "+sector[i]);



            



        }


        System.out.println("El sector con mayor consumo es: "+Mayor);
        System.out.println("promedio :"+Promedio);
        System.out.println("suma total "+SumaTotal);



















    }
}