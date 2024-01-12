package TechApp;

public class Producto {
    private String nombre;
    private double precio;
    private int stock;


    public Producto(String nombre, double precio, int stock) {
        this.nombre = nombre;
        this.precio = precio;
        this.stock = stock;
    }

    public void realizar_venta(int cantidad) {
        if (cantidad <= stock) {
            stock = stock - cantidad;
            System.out.println("Venta realizada con éxito. Se vendieron " + cantidad + " unidades de " + nombre + " por un total de $" + (precio * cantidad) + ".");
        } else {
            System.out.println("No hay suficiente stock para realizar la venta.");
        }
    }


}
