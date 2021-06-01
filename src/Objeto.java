public class Objeto {
    protected String tipoProducto;
    protected String nombre;
    protected double precio;

    public Objeto(String tipoProducto,String nombre, double precio) {
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
}
