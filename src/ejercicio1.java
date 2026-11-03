public class ejercicio1 {
    public static void main(String[] args) {
        String nombreProducto = "Capuchino";
        double precioUnitario = 5500.0;
        int cantidadInventario = 25;
        boolean disponibleHoy = true;
        char codigoProducto = 'C';

        System.out.println(String.format("Nombre del producto: %s", nombreProducto));
        System.out.println(String.format("Precio unitario: $%.2f", precioUnitario));
        System.out.println(String.format("Cantidad en inventario: %d", cantidadInventario));
        System.out.println(String.format("Disponible hoy: %b", disponibleHoy));
        System.out.println(String.format("Código del producto: %c", codigoProducto));
    }
}