
import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class productos_mas_vendidos{

    public static List<Producto> leerProductos() throws IOException{
        String archivo = "producto.csv";
        List<Producto> lista = new ArrayList<>();
        Scanner sc = new Scanner(new File(archivo));

        while (sc.hasNextLine()) {
            String[] datos = sc.nextLine().split(",");
            int id = Integer.parseInt(datos[0]);
            String nombre = datos[1];
            String categoria = datos[2];
            float precio = Float.parseFloat(datos[3]);
            int vendedor_id = Integer.parseInt(datos[4]);
            
            lista.add(new Producto(id, nombre, categoria, precio, vendedor_id));
        }
        sc.close();
        return lista;

    }

    public static List<Pedido> leerPedidos() throws IOException{
        String archivo = "pedidos.csv";
        List<Pedido> lista = new ArrayList<>();
        Scanner sc = new Scanner(new File(archivo));

        while (sc.hasNextLine()) {
            String[] datos = sc.nextLine().split(",");
            int id = Integer.parseInt(datos[0]);
            int cliente_id = Integer.parseInt(datos[1]);
            int producto_id = Integer.parseInt(datos[2]);
            int cantidad = Integer.parseInt(datos[3]);
            String fecha = datos[4];
            
            lista.add(new Pedido(id,cliente_id,producto_id, cantidad, fecha));
        }
        sc.close();
        return lista;

        public void 

    }







    
    
}