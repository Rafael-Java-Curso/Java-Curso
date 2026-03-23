public class Main{

    public static class Duracion{
        private int horas, minutos, segundos;
        
        public Duracion(int horas, int minutos, int segundos){
            this.horas = horas;
            this.minutos = minutos;
            this.segundos = segundos;
        }

        public int getHoras(){
            return this.horas;
        }

        public int getMinutos(){
            return this.minutos;
        }
        
        public int getSegundos(){
            return this.segundos;
        }

        public void mostrarDuracion(){
            System.out.printf("%d:%d:%d %n", getHoras(), getMinutos(), getSegundos());
        }   

    }

    public static class Video{
        private String titulo, canal;
        private Duracion duracion;
        private int cantidadLikes;
        private int cantidadVisualizaciones;

        public Video(){
            this.titulo = "NaN";
            this.canal = "NaN";
            Duracion x = new Duracion(0 , 0, 0);
            this.duracion = x;
            this.cantidadVisualizaciones = 0;
        }

        public Video(String titulo, String canal, Duracion duracion, int cantidadLikes, int cantidadVisualizaciones){
            this.titulo = titulo;
            this.canal = canal;
            this.duracion = duracion;
            this.cantidadLikes = cantidadLikes;
            this.cantidadVisualizaciones = cantidadVisualizaciones;
        }

        public void setCantidadLikes(int cantidadLikes){
            this.cantidadLikes = cantidadLikes;
        }

        public void setCantidadDeVisualizaciones(int cantidad){
            if(cantidadVisualizaciones > 0){
                this.cantidadVisualizaciones = cantidad;
            }else{
                System.out.println("Cantidad de visualizaciones debe ser entero positivo");
            }
        }

        public int getCantidadLikes(){return this.cantidadLikes;}
        public int getCantidadVisualizaciones(){return this.cantidadVisualizaciones;}
        public Duracion getDuracion(){return this.duracion;}
        public String getTitulo(){return this.titulo;}
        public String getCanal(){return this.canal;}

        public void mostrarVideo(){
            System.out.printf("Titulo : %s %nCanal : %s %nCantidad Likes : %d %nCantidad Visualizaciones : %d %n", getTitulo(), getCanal(), getCantidadLikes(), getCantidadVisualizaciones());
            System.out.print("Duracion : ");
            Duracion x = getDuracion();
            x.mostrarDuracion();
        }


    }

    public static void main(String[] args){
        Duracion duracion1 = new Duracion(1, 20, 12);
        Duracion duracion2 = new Duracion(0, 0, 59);

        Video video1 = new Video("Como instalar VS", "Tutos 3000", duracion1, 1257, 1533434);
        Video video2 = new Video("Git hub ", "Todo git", duracion2, 34257, 133434);

        video1.mostrarVideo();
        System.out.println("= = = = = = = = ");
        video2.mostrarVideo();



    }

}