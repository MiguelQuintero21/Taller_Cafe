public class Ejercicio7 {
    public static void main(String[] args) {
        int cantidadVendida = 5; // aqui quitó el uso de comillas dobles era String y se asignó como int.
        double precioUnitario = 4500.0; //  Faltaba el signo igual (=).
        double total = cantidadVendida * precioUnitario; //  Faltaba el signo igual =.
        boolean aplicaDescuento = (total > 20000);

        if (aplicaDescuento) { // Corrección de Sintaxis del if mal formada, sobraba el "true)" suelto.
            total = total - (total * 0.10); // aqui faltaban operadores de asignación y resta.
        }
        System.out.println("Total: " + total); // Faltaba cerrar comillas de la cadena.
    }
}