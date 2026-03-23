import java.util.Scanner;

public class CalculadoraCompra {

    public static void main(String[] args){
        Scanner r = new Scanner(System.in);
        final double TASA_IMPUESTO = 0.15d;
        System.out.println("Precio articulo : ");
        double precioArticulo = r.nextDouble();
        System.out.println("Cantidad de articulos comprados : ");
        int cantidadArticulos = r.nextInt();
        r.nextLine();
        System.out.println("Cantidad de dinero : ");
        double cantidadDinero = r.nextDouble();
        double subTotal = precioArticulo *  cantidadArticulos;
        double totalCompra = subTotal + (subTotal * TASA_IMPUESTO);
        if(totalCompra > cantidadDinero){
            System.out.println("Fondos insuficientes");
        }else{
            double cambio = cantidadDinero - totalCompra;
            System.out.printf("Subtotal : %.3f %n total compra mas impuesto : %.3f %n Cambio : %.3f pesos", subTotal, totalCompra, cambio);
        }
    }

}