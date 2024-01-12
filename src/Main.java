import TechApp.Producto;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        Producto libro = new Producto("Libro", 20.5,10);
        Producto revista = new Producto("Revista", 5.99,30);

        System.out.println("***** TIENDA TECHAPP *****");

        libro.realizar_venta(3);
        revista.realizar_venta(8);


    }
}