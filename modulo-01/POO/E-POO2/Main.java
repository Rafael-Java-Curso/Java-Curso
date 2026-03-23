public class Main{

    public static class Perfil{
        private String nombreUsuario;
        private String juegoFavorito;
        private int cantidadPartidasGanadas;

        public Perfil(){
            this.nombreUsuario = "NaN";
            this.juegoFavorito = "NaN";
            this.cantidadPartidasGanadas = 0;
        }

        public Perfil(String nombreUsuario, String juegoFavorito, int cantidadPartidasGanadas){
            this.nombreUsuario = nombreUsuario;
            this.juegoFavorito = juegoFavorito;
            this.cantidadPartidasGanadas = cantidadPartidasGanadas;
        }

        public String getNombreUsuario(){
            return this.nombreUsuario;
        }

        public String getJuegoFavorito(){
            return this.juegoFavorito;
        }

        public int getCantidadPartidasGanadas(){
            return this.cantidadPartidasGanadas;
        }

        public void mostrarDatos(){
            System.out.printf("Nombre Usuario = %s %nJuego Favorito = %s %nCantidad Partidas Ganadas = %d %n", this.nombreUsuario, this.juegoFavorito, this.cantidadPartidasGanadas);
        }



    }

    public static void main(String[] args){

        for(int i = 1; i <= 3; i++){
            Perfil p = new Perfil("Usuario" + i, "Juego " + i, i);
            p.mostrarDatos();
            System.err.println("=========");
        }

    }
}