// Clase que representa un producto de vestimenta.
public class Ropa extends Producto {
    public Ropa(String codigo, String nombre,
                double precioBase, int
    existencias) {
        super(codigo, nombre, precioBase,
    existencias);
    }
    // Calcula el precio final aplicando un descuento del 10%
    @Override
   public double calcularPrecioFinal() {
        return getPrecioBase() * 0.90;
   }
}
