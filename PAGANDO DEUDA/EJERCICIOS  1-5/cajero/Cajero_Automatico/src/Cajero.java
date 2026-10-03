import java.util.Scanner;
public class Cajero {
    public static void main(String[] args) throws Exception {
        Scanner teclado = new Scanner(System.in);
        int saldo = 100000;
        byte tecla=0;


        System.out.println("Bienvenido al cajero ATM del Banco Santi");
        System.out.println();
        while (tecla!=4) {
            System.out.println("---------------");
            System.out.println("1. Ver Saldo");
            System.out.println("2. Retirar");
            System.out.println("3. Depositar");
            System.out.println("4. salir");
            System.out.println("---------------");
            System.out.println("");
            tecla = teclado.nextByte();
            int retiro;
            int deposito;

            switch (tecla) {
                case 1:
                    System.out.println("--Usted tiene "+saldo+"--");
                    System.out.println("");
                    break;

                case 2:
                    System.out.println("--Cuanto desea retirar.--");
                    retiro = teclado.nextInt();
                    if (retiro>saldo){
                        System.out.println("--Saldo insufuciente.--");
                        System.out.println("");
                    } else {
                        saldo = saldo - retiro;
                        System.out.println("--Retiro realizado.--");
                        System.out.println("");
                    }
                    break;



                case 3:
                    System.out.println("--Ingrese cantidad deposito--");
                    deposito = teclado.nextInt();
                    if (deposito<=0) {
                        System.out.println("--No puede hacer recargas negativas--");
                        System.out.println("");
                    } else {
                        saldo = saldo + deposito;
                        System.out.println("--Deposito realizado.--");

                    }
                    break;

                case 4:
                    System.out.println("--Usted acaba de salir--");
                    break;

                default:
                    System.out.println("no sabe leer?");

                    break;




            }

            

        }
        
























        teclado.close();
    }
}
