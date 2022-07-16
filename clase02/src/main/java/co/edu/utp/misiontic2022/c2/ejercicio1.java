package co.edu.utp.misiontic2022.c2;
import java.util.Scanner;

public class ejercicio1 {
    public static void main (String[] args){
        Scanner sc = new Scanner(System.in);
        int dia, mes, año, suma, suerte, calc1, calc2, calc3, calc4;

        System.out.println("Por favor introduzca su fecha de nacimiento para saber su número de suerte");
        System.out.print("día: ");
        dia = sc.nextInt();
        System.out.print("mes: ");
        mes = sc.nextInt();
        System.out.print("año: ");
        año = sc.nextInt();

        suma = dia + mes + año;

        calc1 = suma/1000;
        calc2 = suma/100%10;
        calc3 = suma/10%10;
        calc4 = suma%10;

        suerte = calc1 + calc2 + calc3 + calc4;

        System.out.println("Su número de la suerte es: " + suerte);

    }
}
