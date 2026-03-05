import java.util.Scanner;

public class Bucles {
    public static void main (String[] args){
        int selOpcion;
        Scanner r = new Scanner(System.in);
        do{
            System.out.println("Selecciona una opcion : ");
            System.out.printf(
                """
                    1. Calcular el Area de una figura.
                    2. Calcular Edad Futura
                    3. Verificar si un numero es primo
                    4. Salir del programa     
                """
            );
            selOpcion = r.nextInt();
            switch (selOpcion) {
                case 1:
                    System.out.printf("""
                            Selecciona la figura
                            1. Circulo
                            2. Rectangulo
                            """);
                    break;

                case 2:

                    break;
                
                case 3:
                    
                    break;
                
                case 4:

                    break;
                
            }

        }while(selOpcion != 4);
    }
}