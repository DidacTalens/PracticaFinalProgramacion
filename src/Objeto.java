public class Objeto {
    protected String nombre;
    protected double precio;
    protected boolean caducado;

    public Objeto(String nombre, double precio) {
        this.nombre = nombre;
        this.precio = precio;
        this.caducado = false;
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

    public boolean isCaducado() {
        return caducado;
    }

    public void setCaducado(boolean caducado) {
        this.caducado = caducado;
    }
}
