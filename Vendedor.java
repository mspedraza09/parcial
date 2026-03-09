public class Vendedor{
    private int id;
    private String nombre;
    private String ciudad; 

    public Vendedor(int id, String nombre, String ciudad) {
        this.id = id;
        this.nombre = nombre;
        this.ciudad = ciudad;
        

    }

    public String toString() {
        return id + "," + nombre+","+ciudad;
    }
}