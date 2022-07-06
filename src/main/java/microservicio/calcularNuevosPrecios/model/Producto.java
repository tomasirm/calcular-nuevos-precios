package microservicio.calcularNuevosPrecios.model;

public class Producto {
    private int id;
    private String name;
    private double precio;
    private double precioDolares;
    private double precioEuros;

    public Producto() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public double getPrecioDolares() {
        return precioDolares;
    }

    public void setPrecioDolares(double precioDolares) {
        this.precioDolares = precioDolares;
    }

    public double getPrecioEuros() {
        return precioEuros;
    }

    public void setPrecioEuros(double precioEuros) {
        this.precioEuros = precioEuros;
    }

    @Override
    public String toString() {
        return "Producto{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", precio=" + precio +
                ", precioDolares=" + precioDolares +
                ", precioEuros=" + precioEuros +
                '}';
    }
}
