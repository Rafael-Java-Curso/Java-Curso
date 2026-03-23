
public class Main{

    public static class Libro{
        private String titulo;
        private String autor;
        private String isbn;
        private double precio;

        public Libro(String titulo, String autor, String isbn, double precio){
            this.titulo = titulo;
            this.autor = autor;
            this.isbn = isbn;
            this.precio = precio;
        }

        String getTitulo(){
            return this.titulo;
        }

        String getAutor(){
            return this.autor;
        }

        

    }


    public static void main(String[] args){

    }
}