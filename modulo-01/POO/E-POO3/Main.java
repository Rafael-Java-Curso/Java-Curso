public class Main{

    public static class Usuario{
        private String nombre;
        private int edad;
        private String ciudad;
        private int cantidadSeguidores;
        
        public Usuario(){
            this.nombre = "NaN";
            this.edad = 0;
            this.ciudad = "NaN";
            this.cantidadSeguidores = 0;
        }

        public Usuario(String nombre, int edad, String ciudad, int cantidadSeguidores){
            this.nombre = nombre;
            this.edad = edad;
            this.ciudad = ciudad;
            this.cantidadSeguidores = cantidadSeguidores;
        }

        public String getNombre(){
            return this.nombre;
        }

        public String getCiudad(){
            return this.ciudad;
        }

        public int getEdad(){
            return this.edad;
        }
        
        public int getCantidadSeguidores(){
            return this.cantidadSeguidores;
        }

        public void setCantidadSeguidores(int cantidad){
            if(cantidad >= 0){
                this.cantidadSeguidores = cantidad;
            }else{
                System.err.println("Valor de seguidores incorrecto. Debe ser un entero positivo");
            }
        }

        public void mostrarUsuario(){
            System.out.printf("Usuario : %s %nEdad : %d %nCiudad : %s %nCantidad Seguidores : %d %n",this.nombre, this.edad, this.ciudad, this.cantidadSeguidores);
        }

    }


    public static void main(String[] args){
        for(int i = 1; i <= 3; i++){
            Usuario u = new Usuario("usuario " + i, 20 + i, "Ciudad " + i, 0);
            u.setCantidadSeguidores(i + 10);
            u.mostrarUsuario();
            System.out.println("= = = = = = = = = = = ");
        }
    }

}