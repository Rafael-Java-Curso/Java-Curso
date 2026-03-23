
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

        void setPrecio(double precio){
            if(precio > 0){
                this.precio = precio;
            }else{
                System.out.printf("%.3f No es un precio valido.%n", precio);
            }
        }

        public void mostrarInformacion(){
            System.out.printf("Nombre Libro : %s %n Precio Libro : %.3f %n ISBN Libro : %s %nAutor Libro : %s %n", this.titulo, this.precio, this.isbn, this.autor);
        }

    }


    public static void main(String[] args){

        for(int i = 1; i <= 3; i++){
            String titulo = "Libro " + i, autor = "Autor " + i, isbn = "ISBN " + i;
            double precio = 23.000 * (i * 1.0);
            Libro librox = new Libro(titulo, autor, isbn, precio);
            librox.mostrarInformacion();
            System.out.println("= = = = = = = = = = = = ");
        }

    }
}