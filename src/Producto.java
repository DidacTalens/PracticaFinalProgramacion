import java.io.*;

public class Producto {
    protected String tipoProducto;
    protected String nombre;
    protected double precio;

    public Producto(String tipoProducto, String nombre, double precio) {
        this.tipoProducto=tipoProducto;
        this.nombre = nombre;
        this.precio = precio;
    }

    public String getTipoProducto() {
        return tipoProducto;
    }

    public void setTipoProducto(String tipoProducto) {
        this.tipoProducto = tipoProducto;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    @Override
    public String toString() {
        return "Objeto{" +
                "tipoProducto='" + tipoProducto + '\'' +
                ", nombre='" + nombre + '\'' +
                ", precio=" + precio +
                '}';
    }

    public static void main(String[] args) {
        try {
            ObjectInputStream ois = new ObjectInputStream(new FileInputStream("datosObjeto.txt"));
            Object aux = ois.readObject();
            while (aux!=null){
                if (aux instanceof Producto)
                    System.out.println(aux);
                aux = ois.readObject();
            }
            ois.close();
        } catch (IOException | ClassNotFoundException e) {
            System.out.println("No existe el ficherito");
        }

    }
}
