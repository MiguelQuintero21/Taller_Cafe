public class cafeteria {
    public static void main(String[] args) {
        // Datos fijos del menú y pedidos proporcionados por el contexto
        String[] nombres = {"Cafe", "pan", "tamal", "caldos", "Brownie"};
        double[] precios = {3500, 5000, 4000, 4500, 6000};
        char[] categorias = {'B', 'C', 'C', 'P', 'P'}; // B=Bebida caliente, F=Fría, C=Comida,

        int[] pedidoProducto = {0, 2, 1, 4, 0, 3}; // Índice del producto en cada pedido
        int[] pedidoCantidad = {2, 1, 3, 1, 1, 2};  // Unidades por pedido

        // TAREA 4: Apertura de turno con do-while
        double montoApertura = -100.0; // Valor inválido inicial para forzar la iteración
        boolean cajaAbierta = false;

        do {
            if (montoApertura > 0) {
                cajaAbierta = true;
            } else {
                // Simulamos la corrección del monto en la siguiente validación ficticia o fija mayor a 0
                montoApertura = 50000.0;
            }
        } while (!cajaAbierta);

        System.out.println("Apertura de turno");
        System.out.println("Monto inicial en caja: $" + montoApertura);
        System.out.println("-----------------------------------\n");

        // Variables para el reporte de cierre
        int totalPedidosProcesados = 0;
        double totalRecaudado = 0.0;
        double mayorValorPedido = -1.0;
        int numeroPedidoMayorValor = -1;

        // Inventario inicial de Brownie, índice 4
        int inventarioBrownie = 10;

        // TAREA 1 y TAREA 2: Procesamiento de pedidos mediante ciclo for
        for (int i = 0; i < pedidoProducto.length; i++) {
            int indiceProducto = pedidoProducto[i];
            int cantidadSolicitada = pedidoCantidad[i];
            String nombreProd = nombres[indiceProducto];
            double precioProd = precios[indiceProducto];
            char catProd = categorias[indiceProducto];

            // Validación de inventario para el Brownie, índice 4, tarea 3
            if (indiceProducto == 4) {
                if (inventarioBrownie < cantidadSolicitada) {
                    System.out.println("Pedido #" + (i + 1) + ": agotado, No hay suficiente inventario de Brownie. Pedido omitido.");
                    continue; // No se cobra ni se procesa
                } else {
                    inventarioBrownie -= cantidadSolicitada; // Descuenta del inventario
                }
            }

            // Cálculo del subtotal
            double subtotalPedido = precioProd * cantidadSolicitada;

            // Descuento por pedido si supera $12.000 esta es la tarea 2
            boolean aplicaDto = subtotalPedido > 12000;
            double valorFinalPedido = aplicaDto ? subtotalPedido - (subtotalPedido * 0.10) : subtotalPedido;

            // Descripción detallada de la categoría usando switch
            String descripcionCat = "";
            switch (catProd) {
                case 'B':
                    descripcionCat = "Bebida caliente";
                    break;
                case 'F':
                    descripcionCat = "panes";
                    break;
                case 'C':
                    descripcionCat = "Comida";
                    break;
                case 'P':
                    descripcionCat = "caldos";
                    break;
                default:
                    descripcionCat = "postres";
                    break;
            }

            // Impresión del pedido
            System.out.println("Pedido número: " + (i + 1));
            System.out.println("- Producto: " + nombreProd);
            System.out.println("- Cantidad: " + cantidadSolicitada);
            System.out.println("- Categoría: " + descripcionCat);
            System.out.println("- Subtotal: $" + subtotalPedido);
            System.out.println("- ¿Aplicó descuento del 10%?: " + (aplicaDto ? "Sí" : "No"));
            System.out.println("- Valor final del pedido: $" + valorFinalPedido);
            System.out.println("---------------------------------");

            // Acumuladores y métricas para el reporte final
            totalPedidosProcesados++;
            totalRecaudado += valorFinalPedido;

            // Evaluar si es el pedido con mayor valor
            if (valorFinalPedido > mayorValorPedido) {
                mayorValorPedido = valorFinalPedido;
                numeroPedidoMayorValor = i + 1;
            }
        }

        // TAREA 5: Reporte de cierre
        System.out.println("\n Cierre de turno");
        System.out.println("Total de pedidos procesados exitosamente: " + totalPedidosProcesados);
        System.out.println("Total recaudado en caja: $" + totalRecaudado);
        System.out.println("El pedido con mayor valor fue el pedido# " + numeroPedidoMayorValor + " con un total de $" + mayorValorPedido);
        System.out.println("=======================================");
    }
}