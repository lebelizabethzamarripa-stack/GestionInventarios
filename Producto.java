// Clase abstracta que representa un producto del inventario
public abstract class Producto
implements Inventariable {
    private String codigo;
    private String nombre;
    private double precioBase;
    private int existencias;
// Constructor que inicializa los datos del producto.
    public Producto(String codigo, String
    nombre,
                    double precioBase, int
    existencias) {
        this.codigo = codigo;
        this.nombre = nombre;
        this.precioBase = precioBase;
        this.existencias = existencias;
    }

    public String getCodigo() {
        return codigo;
    }

    public String getNombre() {
        return nombre;
    }

    public double getPrecioBase() {
        return precioBase;
    }

    public int getExistencias() {
        return existencias;
    }
    // Incrementa la cantidad de unidades diponibles.
    public void agregarExistencias(int
    cantidad) {
        if (cantidad > 0) {
            existencias += cantidad;
        }
    }
    // Disminuye la cantidad de unidades disponibles.
    public void retirarExistencias(int
                                           cantidad) {
        if (cantidad > 0 && cantidad <=
                existencias) {
            existencias -= cantidad;
        }
    }
        public abstract double
    // Metodo abstracto para calcular el precio final de cada producto.
        calcularPrecioFinal();
}
