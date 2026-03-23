public class Main {

    public static class Personaje{
        private String nombre, tipo;
        private int vida, nivel, experiencia;

        public Personaje(String nombre, String tipo, int vida, int nivel){
            vida = Math.max(vida, 0);
            nivel = Math.max(nivel, 0);
            this.nombre = nombre;
            this.tipo = tipo;
            this.vida = vida;
            this.nivel = nivel;
            this.experiencia = 0;
        }

        public void recibirDanhio(int danhioRecibido){
            danhioRecibido = Math.max(danhioRecibido, 0);
            if(getVida() == 0){
                System.out.printf("El personaje %s ya esta muerto, no lo puedes atacar %n", getNombre());
            }else if(getVida() - danhioRecibido <= 0){
                System.out.printf("Personaje %s ha muerto con tu ataque %n", getNombre());
                this.vida = 0;
            }else{
                this.vida -= danhioRecibido;
                System.out.printf("El Personaje %s ahora cuenta con %d puntos de vida %n", getNombre(), getVida());
            }
        }


        public String getNombre(){return this.nombre;}
        public String getTipo(){return this.tipo;}
        public int getVida(){return this.vida;}
        public int getNivel(){return this.nivel;}
        public int getExperiencia(){return this.experiencia;}

    }
    public static void main(String[] args){
        Personaje p1 = new Personaje("Gladiador", "Soldado", 100, 10);
        System.out.println(p1.getVida());
        p1.recibirDanhio((101));
        System.out.println(p1.getVida());
        p1.recibirDanhio(100);
        Personaje p2 = new Personaje("Gladiador", "Soldado", 100, 10);
        p2.recibirDanhio(50);
        p2.getVida();
        p2.recibirDanhio(49);
        p2.getVida();
        p2.recibirDanhio(1);
        p2.getVida();
        p2.recibirDanhio(1);

    }
}
