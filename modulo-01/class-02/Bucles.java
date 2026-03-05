import java.util.Scanner;

public class Bucles {
    public static void main (String[] args){
        int selOpcion;
        final float PI = 3.1416f;

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
                    System.out.printf(
                        """
                            Selecciona la figura
                            1. Circulo
                            2. Rectangulo
                        """);
                        int opcionUno = r.nextInt();
                        if(opcionUno == 1){
                            System.out.println("Ingrese el radio del circulo: ");
                            float radioCirculo = r.nextFloat();
                            float areaCirculo = (float) PI * radioCirculo * radioCirculo;
                            System.out.printf("Area del Circulo = %.3f %n", areaCirculo);
                        }else{
                            System.out.println("Ingrese la base del rectangulo : ");
                            float base = r.nextFloat();
                            System.out.println("Ingrese la altura del rectangulo");
                            float altura = r.nextFloat();
                            float areaRectangulo = base * altura;
                            System.out.printf("El area del rectangulo es de : %.3f %n", areaRectangulo);
                        }
                    break;

                case 2:

                    break;
                
                case 3:
                    System.out.println("Digite un numero : ");
                    int selectNumber = r.nextInt();
                    boolean ok = true;
                    if(selectNumber == 1){
                        ok = false;
                    }
                    for(int i = 2; i * i <= selectNumber; i++){
                        if(selectNumber % i == 0){
                            ok = false;
                            break;
                        }
                    }
                    if(ok){
                        System.out.printf("el numero %d es primo", selectNumber);
                    }else{
                        System.out.printf("El numero %d no es primo", selectNumber);
                    }
                    
                    break;
                
                case 4:

                    break;
                
            }

        }while(selOpcion != 4);
    }
}