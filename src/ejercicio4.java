public class ejercicio4 {
    public static void main(String[] args) {
        int inventarioCafe = 50;
        int consumoPorPedido = 2; // Valor fijo entre 1 y 3

        while (inventarioCafe >= 10) {
            System.out.println("Inventario antes del pedido: " + inventarioCafe);
            inventarioCafe -= consumoPorPedido;
            System.out.println("Inventario restante: " + inventarioCafe);
        }
    }
}