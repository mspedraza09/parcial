

public class Producto{
    private int id;
    private String nombre;
    private String categoria;
    private float precio;
    private int vendedor_id; 

    public Producto(int id, String nombre, String categoria, float precio, int vendedor_id) {
        this.id = id;
        this.nombre = nombre;
        this.categoria = categoria;
        this.precio = precio;
        this.vendedor_id = vendedor_id;

    }

    public String toString() {
        return id + "," + nombre +","+categoria+","+precio+","+vendedor_id;
    }
}