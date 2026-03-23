import java.util.*;

public class Main{

    public static class Producto{
        private String nombre;
        private int precio;
        private int stock;
        private String categoria;

        public Producto(String nombre, int precio, int stock, String categoria){
            this.nombre = nombre;
            this.precio = precio;
            this.stock = stock;
            this.categoria = categoria;
        }

        public String getNombre(){return this.nombre;}
        public int getPrecio(){return this.precio;}
        public int getStock(){return this.stock;}
        public String getCategoria(){return this.categoria;}

        public void mostrarProducto(){
            System.out.printf("Nombre Producto : %s %nPrecio Producto : %d %nStock Producto : %d %nCategoria : %s %n", getNombre(), getPrecio(), getStock(), getCategoria());
        }

        public void reducirStock(){
            if(getStock() >= 1){
                this.stock--;
            }else{
                System.out.printf("No hay suficiente stock del item %s %n", getNombre());
            }
        }
    }

    public static class Tienda{
        private String nombre;
        private List<Producto> productos = new ArrayList<Producto>();

        public Tienda(String nombre){
            this.nombre = nombre;
        }

        public String getNombre(){return this.nombre;}

        public void agregarProducto(Producto p){
            productos.add(p);
        }

        public void reducirStockItem(String nombreItem){
            for(int i = 0; i < productos.size(); i++){
                Producto p = productos.get(i);
                if(p.getNombre().equalsIgnoreCase(nombreItem)){
                    p.reducirStock();
                    return;
                }
            }
            System.out.println("Item no encontrado");
        }

        public void mostrarProductos(){
            if(productos.size() > 0){
                for(int i = 0; i < productos.size(); i++){
                    Producto x = productos.get(i);
                    x.mostrarProducto();
                    System.err.println("= = = = = = = ");
                }
            }else{
                System.out.println("Tienda no creo productos");
            }
        }
    }
    public static void main(String[] args){
        Tienda tienda1 = new Tienda("Tienda 1");

        Producto p1 = new Producto("Teclado", 25500, 10, "Gamer");
        Producto p2 = new Producto("Microfono", 65500,2, "Gamer");

        tienda1.mostrarProductos();
        System.out.println("= = = = = = = = = = = ");
        tienda1.agregarProducto(p1);
        tienda1.mostrarProductos();
        System.out.println("= = = = = = = = = = = ");
        tienda1.reducirStockItem("Teclado");
        tienda1.mostrarProductos();
        tienda1.agregarProducto(p2);
        System.out.println("= = = = = = = = = = = ");
        tienda1.mostrarProductos();
        tienda1.reducirStockItem("Microfono");
        System.out.println("= = = = = = = = = = = ");
        tienda1.mostrarProductos();
        tienda1.reducirStockItem("Microfono");
        System.out.println("= = = = = = = = = = = ");
        tienda1.mostrarProductos();
        tienda1.reducirStockItem("Microfono");
        System.out.println("= = = = = = = = = = = ");
        tienda1.mostrarProductos();








    }
}