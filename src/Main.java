import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        Random ale = new Random();

        int max=3;
        int min=1;
        int d1;
        int Cn;
        int montoInicial;

        System.out.println("Ingrese el monto inicial");
        montoInicial = teclado.nextInt();

        d1 = ale.nextInt((max - min + 1)) + min ;

        while (montoInicial > 0) {
            switch (d1) {
                case 1:
                    montoInicial *= 2;
                    System.out.println("¡SE DUPLICA! SU MONTO ES DE: " + montoInicial);
                    break;
                case 2:
                    montoInicial /= 2;
                    System.out.println("¡PIERDE LA MITAD! SU MONTO ES DE: " + montoInicial);
                    break;
                case 3:
                    montoInicial = 0;
                    System.out.println("¡PERDIO!");
                    break;
            }
            if (montoInicial > 0) {
                System.out.println("¿QUIERES SEGUIR JUGANDO? 1=SI 2=NO");
                Cn = teclado.nextInt();
                if (Cn == 1){
                    System.out.println("JUGANDO");
                    d1 = ale.nextInt((max - min + 1)) + min;
                }else {
                    System.out.println("SE RETIRO CON" + montoInicial);
                    break;
                }

            }
        }
    }
}