public class Main {

    public static class Usuario{
        private String nombre, correo;
        private int edad;

        public Usuario(String nombre, String correo, int edad){
            this.nombre = nombre;
            this.correo = correo;
            this.edad = edad;
        }

        public String getNombre(){return this.nombre;}
        public String getCorreo(){return this.correo;}
        public int getEdad(){return this.edad;}
    }

    public static class Cuenta{
        private Usuario titular;
        private int saldo, numeroCuenta;

        public Cuenta(Usuario titular, int saldo, int numeroCuenta){
            this.titular = titular;
            this.saldo = saldo;
            this.numeroCuenta = numeroCuenta;
        }

        public void depositarDinero(int cantidad){
            this.saldo += cantidad;
            System.out.printf("Su cuenta bancaria ahora cuenta con %d  %n", getSaldo());
        }

        public void retirarDinero(int cantidad){
            if(cantidad <= 0){
                System.out.println("Solo puede quitar cantidades positivas");
            }else if(getSaldo() - cantidad < 0){
                System.out.println("No tiene suficiente dinero");
            }else{
                this.saldo -= cantidad;
                System.out.printf("Su cuenta bancaria ahora cuenta con %d %n", getSaldo());
            }
        }

        public void mostrarCuenta(){
            System.out.printf("Titular : %s %nCorreo Titular : %s %nEdad Titular : %d Numero Cuenta : %d %nSaldo Actual : %d %n", getTitular().getNombre(), getTitular().getCorreo(), getTitular().getEdad(), getNumeroCuenta(), getSaldo());
        }

        public Usuario getTitular(){return this.titular;}
        public int getSaldo(){return this.saldo;}
        public int getNumeroCuenta(){return this.numeroCuenta;}
    }

    public static void main(String[] args){
        Usuario u = new Usuario("Rafael", "r@gmail.com", 99);
        Cuenta c = new Cuenta(u, 10000000, 1);
        c.retirarDinero(c.getSaldo() + 1);
        c.retirarDinero(c.getSaldo());
        c.depositarDinero(1000);
        c.retirarDinero(c.getSaldo() - 1);
        c.retirarDinero(4000);


    }
}
