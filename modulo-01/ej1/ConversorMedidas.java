import java.util.Scanner;

public class ConversorMedidas{ 

    public static void main(String[] args){
        Scanner r = new Scanner(System.in);
        final double CM_PORT_METRO = 100.0;
        final double LIBRAS_POR_KG = 2.20462;
        final double FACTOR_CELSIUS_FAHRENHEIT = 32.0;
        System.out.println("Metros : ");
        double x = r.nextDouble();
        double centimetros = x * CM_PORT_METRO;
        System.out.printf("%.2f Metros a centimeros = %.2f cm %n", x, centimetros);
        System.out.println("Kilogramos : ");
        x = r.nextDouble();
        double libras = x * LIBRAS_POR_KG;
        System.out.printf("%.2f kilogramos a libras = %.2f kilogramos %n", x, libras);
        System.out.println("Grados Celcius : ");
        x = r.nextDouble();
        double fahrenheit = x * 1.8 + FACTOR_CELSIUS_FAHRENHEIT;
        System.out.printf("%.1f Grados Celcius a Grados Fahrenheit = %.1f  grados fahrenheit%n", x, fahrenheit);
        
    }

}
