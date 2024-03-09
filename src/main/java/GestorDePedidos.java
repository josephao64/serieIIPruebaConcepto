import java.util.PriorityQueue;

public class GestorDePedidos {
    public static void main(String[] args) {
        PriorityQueue<Pedido> colaDePedidos = new PriorityQueue<>();

        // Agregar algunos pedidos a la cola con diferentes prioridades
        colaDePedidos.offer(new Pedido(1, "Lavadora", 5));
        colaDePedidos.offer(new Pedido(2, "Televisor", 2));
        colaDePedidos.offer(new Pedido(3, "Refrigerador", 4));
        colaDePedidos.offer(new Pedido(4, "Microondas", 1));
        colaDePedidos.offer(new Pedido(5, "Licuadora", 3));

        // Procesar los pedidos en orden de prioridad
        System.out.println("Procesando pedidos por prioridad:");
        while (!colaDePedidos.isEmpty()) {
            Pedido pedidoActual = colaDePedidos.poll(); // Obtiene y elimina el elemento con mayor prioridad
            System.out.println("Procesando: " + pedidoActual);
        }
    }
}