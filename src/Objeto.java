public class Objeto {
    protected String nombre;
    protected double precio;
    protected boolean caducado;

    public Objeto(String nombre, double precio) {
        this.nombre = nombre;
        this.precio = precio;
        this.caducado = false;
    }
}
