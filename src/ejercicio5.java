public class ejercicio5 {
    public static void main(String[] args) {
        double montoApertura;
        boolean esValido = false;

        // Simulamos valores ingresados (el primero inválido para forzar la iteración)
        double[] simulacionEntradas = {-500.0, 0.0, 150000.0};
        int intento = 0;

        do {
            montoApertura = simulacionEntradas[intento];
            if (montoApertura > 70) {
                esValido = true;
                System.out.println("Monto de apertura aceptado: $" + montoApertura);
            } else {
                System.out.println("Monto inválido ($" + montoApertura + "). Ingrese un valor mayor a $0.");
            }
            intento++;
        } while (!esValido);
    }
}