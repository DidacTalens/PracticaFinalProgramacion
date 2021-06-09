import java.io.*;

/**
 * @author Dídac Talens
 * @version 1.0
 */
public class Producto {
    protected String tipoProducto;
    protected String nombre;
    protected double precio;

    /**
     * Constructor del Producto
     * @param tipoProducto el tipo de producto que es
     * @param nombre nombre del producto
     * @param precio precio del producto
     */
    public Producto(String tipoProducto, String nombre, double precio) {
        this.tipoProducto=tipoProducto;
        this.nombre = nombre;
        this.precio = precio;
    }

    /**
     * Devuelve el tipo de producto
     * @return tipo de producto
     */
    public String getTipoProducto() {
        return tipoProducto;
    }

    /**
     * Cambia el tipo de producto
     * @param tipoProducto el tipo de producto que es
     */
    public void setTipoProducto(String tipoProducto) {
        this.tipoProducto = tipoProducto;
    }

    /**
     * Devuelve el tipo de producto
     * @return nombre del producto
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * Cambia el nombre del producto
     * @param nombre nuevo nombre para producto
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * Devuelve el precio de un producto
     * @return precio del producto
     */
    public double getPrecio() {
        return precio;
    }

    /**
     * Cambia el precio de un objeto
     * @param precio nuevo precio del producto
     */
    public void setPrecio(double precio) {
        this.precio = precio;
    }

}
