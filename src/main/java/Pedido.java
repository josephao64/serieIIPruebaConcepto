import java.util.PriorityQueue;

class Pedido implements Comparable<Pedido> {
    private int id;
    private String descripcion;
    private int prioridad;

    public Pedido(int id, String descripcion, int prioridad) {
        this.id = id;
        this.descripcion = descripcion;
        this.prioridad = prioridad;
    }


    @Override
    public int compareTo(Pedido otro) {
        return Integer.compare(this.prioridad, otro.prioridad);
    }

    @Override
    public String toString() {
        return "Pedido{" +
                "id=" + id +
                ", descripcion='" + descripcion + '\'' +
                ", prioridad=" + prioridad +
                '}';
    }

    // Getters para acceder a los atributos de la clase Pedido
    public int getId() {
        return id;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public int getPrioridad() {
        return prioridad;
    }
}

