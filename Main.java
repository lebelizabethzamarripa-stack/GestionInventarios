// Clase principal que ejecuta el sistema de inventarios.
public class Main {
    public static void main(String[] args) {
        // Creacion del inventario.
        Inventario inventario = new Inventario();
        // Registro de productos de diferentes categorias.
        inventario.agregarProducto(new
                Electronico("001", "Laptop", 15000, 5));
        inventario.agregarProducto(new
                Alimento("A001", "Leche", 30, 20));
        inventario.agregarProducto(new
                Ropa("R001", "Camisa", 500, 10));
        // Visualizacion de los productos registrados.
        inventario.mostrarInventario();
        // Prueba de busqueda y actualizacion de existencias.
        Producto encontrado =
                inventario.buscarProducto("001");
        if (encontrado != null) {
    System.out.println(encontrado.getNombre());
    encontrado.agregarExistencias(3);
    encontrado.retirarExistencias(2);
    System.out.println(encontrado.getExistencias());
        }
    }
}
