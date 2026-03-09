public class Cliente{
    private int id;
    private String nombre;
    private String ciudad;

    public Cliente(int id, String nombre, String ciudad) {
        this.id = id;
        this.nombre = nombre;
        this.ciudad = ciudad;
    }

    public String toString() {
        return id + "," + nombre + "," + ciudad;
    }
}