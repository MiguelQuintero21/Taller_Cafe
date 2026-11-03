public class ejercicio6 {
    public static void main(String[] args) {
        String[] productos = {"cafe", "huevos", "caldos", "tamales", "pan"};
        double[] precios = {2000, 5000, 5000, 6500, 5000};

        double sumaPrecios = 0;

        System.out.println("Menu");
        for (int i = 0; i < productos.length; i++) {
            System.out.println((i + 1) + ". " + productos[i] + " - $" + precios[i]);
            sumaPrecios += precios[i];
        }

        double precioPromedio = sumaPrecios / precios.length;
        System.out.println("---------------------");
        System.out.printf("Precio promedio del menú: $%.2f%n", precioPromedio);
    }
}