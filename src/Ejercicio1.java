import java.util.Scanner;

public class Ejercicio1 {
    public static void main(String[] args) throws Exception {
        byte [] sector = new byte[10];
        int LONGITUD_SECTORES=sector.length;
        Scanner teclado = new Scanner(System.in);
        System.out.println("");
        System.out.println("Bienvenido al software CalcuAgua desarrollado por SANTINDUSTRY");
        System.out.println("");
        System.out.println("La empresa Emcar necesita calcular el consumo de agua en 10 sectores");
        System.out.println("Por favor ingrese el consumo del agua, desde el sector 1 hasta el 10");
        System.out.println("");



        for (byte i = 0; i < LONGITUD_SECTORES; i++) {
            
            if (teclado.nextByte() >=0) {
                sector[i]= teclado.nextByte();
            }
            else if ((teclado.nextByte()==0) || (teclado.nextByte()<0)) {
                
            }

        
        }

        for (int i = 0; i < sector.length; i++) {
            System.out.print(sector[i]+" ");
        }
       























    }
}
