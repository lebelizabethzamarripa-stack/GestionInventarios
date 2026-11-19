// Clase que representa un producto alimenticio.
public class Alimento extends Producto {
public Alimento(String codigo, String nombre,
                double precioBase, int
existencias) {
    super(codigo, nombre, precioBase, existencias);
}
// Calcula el precio final aplicando un descuento del 5%
@Override
public double calcularPrecioFinal() {
    return getPrecioBase() * 0.95;
}
}
