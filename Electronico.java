// Clases que representa un producto electronico.
public class Electronico extends Producto {
     public Electronico(String codigo, String nombre,
                        double precioBase,
     int existencias) {
         super(codigo, nombre, precioBase,
     existencias);
     }
// Calcula el precio final aplicando un incremento del 6%
     @Override
     public double calcularPrecioFinal() {
         return getPrecioBase() * 1.06;
     }
}


