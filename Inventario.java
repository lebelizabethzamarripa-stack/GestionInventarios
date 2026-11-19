import java.util.ArrayList;
import java.util.List;
// Clase encargada de gestionar los productos del inventario.
public class Inventario {
    private List<Producto> productos =
            new ArrayList<>();
// Agrega un nuevo producto a la lista.
    public void agregarProducto(Producto
                                        producto) {
        productos.add(producto);
    }
// Busca un producto mediante su codigo
    public Producto buscarProducto(String
                                           codigo) {
        for (Producto producto : productos) {
            if
            (producto.getCodigo().equals(codigo)) {
                return producto;
            }
        }
        return null;
    }
// Muestra los productos y sus existencias.
    public void mostrarInventario() {
        for (Producto producto : productos) {
            System.out.println(producto.getNombre());
         System.out.println(producto.getExistencias());
    System.out.println(producto.calcularPrecioFinal());
        }
}
}