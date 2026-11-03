public class operadores {
    public static void main(String[] args) {
        double subtotal = 42500.0;
        double umbral = 30000.0;
        boolean aplicaDescuento = subtotal > umbral;
        double valorDescuento = aplicaDescuento ? (subtotal * 0.15) : 0.0;
        double totalPagar = subtotal - valorDescuento;

        System.out.printf("¿Tiene derecho a descuento?: %b%n", aplicaDescuento);
        System.out.printf("Valor del descuento: $%.2f%n", valorDescuento);
        System.out.printf("Total a pagar: $%.2f%n", totalPagar);
    }
}