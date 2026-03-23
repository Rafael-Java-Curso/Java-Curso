
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

        String getIsbn(){
            return this.isbn;
        }
        
        double getPrecio(){
            return this.precio;
        }

    }


    public static void main(String[] args){

        for(int i = 1; i <= 3; i++){
            String titulo = "Libro " + i, autor = "Autor " + i, isbn = "ISBN " + i;
            double precio = 23.000 * (i * 1.0);
            Libro librox = new Libro(titulo, autor, isbn, precio);
            System.out.printf("Nombre Libro : %s %n Precio Libro : %.3f %n ISBN Libro : %s %nAutor Libro : %s %n", librox.getTitulo(), librox.getPrecio(), librox.getIsbn(), librox.getAutor());
            System.out.println("= = = = = = = = = = = = ");
        }

    }
}