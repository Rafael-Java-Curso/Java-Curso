import java.util.*;

public class Main{
    public static class Usuario{
        private String nombreUsuario;
        private int edadUsuario;
        private String correoUsuario;

        public Usuario(String nombreUsuario, int edadUsuario, String correoUsuario){
            this.nombreUsuario = nombreUsuario;
            this.edadUsuario = edadUsuario;
            this.correoUsuario = correoUsuario;
        }

        public String getNombreUsuario(){return this.nombreUsuario;}
        public int getEdadUsuario(){return this.edadUsuario;}
        public String getCorreoUsuario(){return this.correoUsuario;}
    }

    public static class Comentario{
        private Usuario usuario;
        private String texto;

        public Comentario(Usuario usuario, String texto){
            this.usuario = usuario;
            this.texto = texto;
        }

        public Usuario getUsuario(){return this.usuario;}
        public String getTexto(){return this.texto;}
    }

    public static class Post{
        private Usuario usuario;
        private String contenido;
        private int likes;
        private List<Comentario> comentarios = new ArrayList<Comentario>();

        public Post(Usuario usuario, String contenido, int likes){
            this.usuario = usuario;
            this.contenido = contenido;
            this.likes = likes;
        }

        public void mostrarComentarios(){
            if(comentarios.size() > 0){
                for(int i = 0; i < comentarios.size(); i++){
                    Comentario x = comentarios.get(i);
                    System.out.printf("Usuario : %s Comentario: %s %n", x.getUsuario().getNombreUsuario(), x.getTexto());
                }
            }else{
                System.out.println("No hay comentarios en este post");
            }

        }

        public void agregarComentarios(Comentario c){
            comentarios.add(c);
        }

        public void incrementarLikes(){
            this.likes++;
        }

        public void mostrarPost(){
            System.out.println("Datos Post");
            System.out.printf("Autor Post : %s %nCorreo Autor : %s %nLikes : %d  %nContenido : %s %n", getUsuario().getNombreUsuario(), getUsuario().getCorreoUsuario(), getLikes(), getContenido());
            System.out.println("Comentarios Post");
            mostrarComentarios();
        }


        public String getContenido(){return this.contenido;}
        public Usuario getUsuario(){return this.usuario;}
        public int getLikes(){return this.likes;}

    }

    public static void main(String[] args){
        Usuario usuario1 = new Usuario("Rafael", 99, "rafael@gmail.com");
        Usuario usuario2 = new Usuario("Alejandro", 99, "alejandro@gmail.com");
        Usuario usuario3 = new Usuario("Sebastian", 99, "sebastian@gmail.com");

        Post post1 = new Post(usuario1, "Hola esto es un post de prueba.... Nuevo Post.... Opiniones...", 0);
        post1.mostrarPost();

        System.out.println("== == == == == == == == == == == == == == == ==");

        Comentario c1 = new Comentario(usuario2, "Excelente post");
        Comentario c2 = new  Comentario(usuario3, "Esperando otro post");

        post1.agregarComentarios(c1);
        post1.agregarComentarios(c2);
        for(int i = 0; i < 5; i++){
            post1.incrementarLikes();
        }

        post1.mostrarPost();
        


    }
}