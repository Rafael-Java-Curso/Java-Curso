public class Main{

    public static class Cancion{
        private String titulo;
        private String artista;
        private int duracionSegundos;
        private int numeroReproduccioens;
        private boolean esExplicita;

        public Cancion(){
            this.titulo = "NaN";
            this.artista = "NaN";
            this.duracionSegundos = 0;
            this.numeroReproduccioens = 0;
            this.esExplicita = false;
        }

        public Cancion(String titulo, String artista, int duracionSegundos, int numeroReproduccioens, boolean esExplicita){
            this.titulo = titulo;
            this.artista = artista;
            this.duracionSegundos = duracionSegundos;
            this.numeroReproduccioens = numeroReproduccioens;
            this.esExplicita = esExplicita;
        }

        public String getTitulo(){return this.titulo;}
        public String getArtista(){return this.artista;}
        public int getDuracionSegundos(){return this.duracionSegundos;}
        public String getEsExplicita(){ return (this.esExplicita) ? "Si" : "No";}
        public int getNumeroReproducciones(){return this.numeroReproduccioens;}

        public void mostrarCancion(){
            System.out.printf("Titulo : %s %nArtista : %s %nDuracion Seg : %d %n Es Explicita : %s %nReproducciones : %d %n", getTitulo(), getArtista(), getDuracionSegundos(), getEsExplicita(), getNumeroReproducciones());
        }
        

    }

    public static void main(String[] args){
        for(int i = 1; i <= 4; i++){
            boolean esExplicita = (i % 2 == 0) ? true : false;
            Cancion c = new Cancion("Titulo " + i, "Artista " + i, 120 + i, 111 + i, esExplicita);
            c.mostrarCancion();
            System.out.println(" = = = = = = = = = = = = = = = = =");
        }
    }

}