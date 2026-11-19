// Interfaz para gestionar las existencias de los productos.
public interface Inventariable {
    // Agrega unidades al inventario.
    void agregarExistencias(int
cantidad);
//Retira unidades del inventario.
    void retirarExistencias(int cantidad);

    int getExistencias();
}
