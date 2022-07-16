package co.edu.utp.misiontic2022.c2;
import java.util.Scanner;

public class ejercicio2 {
    
    public static void main (String[] args){

        Scanner sc = new Scanner(System.in);
        double cantidadProductos, iva, precioUnidad, totalIva, precioSinIva;

        System.out.print("Introduzca el precio por unidad del producto: ");
        precioUnidad = sc.nextDouble();

        System.out.print("Introduzca el número de productos vendidos: ");
        cantidadProductos = sc.nextDouble();

        System.out.print("Introduzca Iva aplicado: ");
        iva = sc.nextDouble();

        precioSinIva = precioUnidad * cantidadProductos;
        totalIva = precioSinIva * iva /100;

        System.out.print("El precio de venta final es: " + (precioSinIva + totalIva));

    }
    
}
