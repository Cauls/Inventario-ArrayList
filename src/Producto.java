public class Producto {
    private String codigo;
    private String nombre;
    private double precio;
    private int stock;
    private Categorias.categorias categoria;

    /**
     * Constructor
     * @param codigo
     * @param nombre
     * @param precio
     * @param stock
     * @param categoria
     */
    public Producto(String codigo, String nombre, double precio, int stock,  Categorias.categorias categoria) {
        this.codigo = codigo;
        this.nombre = nombre;
        this.precio = precio;
        this.stock = stock;
        this.categoria = categoria;
    }

    /**
     * Getter de codigo
     * @return
     */
    public String getCodigo() {
        return codigo;
    }

    /**
     * Getter de nombre
     * @return
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * Getter de precio
     * @return
     */
    public double getPrecio() {
        return precio;
    }

    /**
     * Getter de stock
     * @return
     */
    public int getStock() {
        return stock;
    }

    /**
     * Getter de categoria
     * @return
     */
    public Categorias.categorias getCategoria() {
        return categoria;
    }

    /**
     * Setter de precio
     * @param precio
     */
    public void setPrecio(double precio) {
        this.precio = precio;
    }

    /**
     * Setter de stock
     * @param stock
     */
    public void setStock(int stock) {
        this.stock = stock;
    }

    /**
     * Metodo que escribe por consola la informacion del objeto
     * @return
     */
    public String productoToString(){ //Complejidad O(1)
        return "Codigo: " + codigo + " |Nombre: " + nombre + " |Precio: " + Double.toString(precio) + " |Stock: " + Integer.toString(stock) + "|Categoria: " + categoria;
    }
}
