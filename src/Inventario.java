import java.util.ArrayList;

public class Inventario {
    public ArrayList<Producto> productos;

    public Inventario() {
        productos = new ArrayList<>();
    }

    /**
     * Metodo para agregar productos al arraylist
     * @param producto
     */
    public void add(Producto producto) { //Complejidad O(1)
        if(!productos.contains(producto)) {
            System.out.println("Producto " + producto.getNombre() + " añadido al inventario.");
            productos.add(producto);
        } else {
            System.out.println("El producto " + producto.getNombre() + " ya existe en el inventario.");
        }
    }

    /**
     * Metodo para escribir todos los elementos del arraylist por consola
     */
    public void ListatoString(){ //Complejidad O(n)
        for(Producto p: productos){
            System.out.println(p.getNombre());
            System.out.println(p.productoToString());
        }
    }

    /**
     * Metodo que escribe por consola el elemento que tenga el nombre que se le da
     * @param nombre
     */
    public void BuscarProducto(String nombre){ //Complejidad O(n)
        boolean existe = false;
        for (Producto p: productos){
            if(p.getNombre().equals(nombre)) {
                System.out.println(p.productoToString());
                existe = true;
            }
        }
        if(!existe){
            System.out.println("No existe un producto con el nombre " + nombre);
        }
    }

    /**
     * Metodo que escribe por consola los elementos que tengan la categoria otorgada
     * @param categoria
     */
    public void PorCategoriaToString(Categorias.categorias categoria){ //Complejidad O(n)
        for(Producto producto: productos){
            if(producto.getCategoria().equals(categoria)){
                System.out.println(producto.productoToString());
            }
        }
    }

    /**
     * Metodo que cambia el stock al valor que se le dé del elemento cuyo codigo cuadre con el dado
     * @param codigo
     * @param stock
     */
    public void cambioStock(String codigo, int stock){ //Complejidad O(n)
        boolean existe = false;
        int i = 0;
        while(!existe && i < productos.size()){
            if(productos.get(i).getCodigo().equals(codigo)){
                productos.get(i).setStock(stock);
                System.out.println("Stock cambiado a " + stock + " del producto " + productos.get(i).getNombre());
                existe = true;
            }
            i++;
        }
        if(!existe){
            System.out.println("No existe un producto con el codigo " + codigo);
        }
    }

    /**
     * Metodo que cambia el precio de un elemento dado según su código
     * @param codigo
     * @param precio
     */
    public void cambioPrecio(String codigo, double precio){ //Complejidad O(n)
        boolean existe = false;
        for(Producto producto: productos){
            if(producto.getCodigo().equals(codigo)){
                producto.setPrecio(precio);
                System.out.println("Stock cambiado a " + precio + " del producto " + producto.getNombre());
                existe = true;
            }
        }
        if(!existe){
            System.out.println("No existe un producto con el codigo " + codigo);
        }
    }


    /**
     * Metodo que vende la cantidad de productos que se den según el código de este
     * @param nombre
     * @param cantidad
     */
    public void venderProducto(String nombre, int cantidad){ //Complejidad O(n)
        for(Producto producto: productos){
            if(producto.getNombre().equals(nombre)){
                if(producto.getStock() >= cantidad){
                    producto.setStock(producto.getStock() - cantidad);
                    System.out.println("Vendidas " + cantidad + " unidades del producto " + nombre + ". Stock restante: " + producto.getStock());
                } else {
                    System.out.println("No hay suficiente stock para vender " + cantidad + " unidades de " + nombre);
                }
            }
        }
    }

    /**
     * Metodo que escribe por consola el precio de todos los productos que hay sumados
     */
    public void precioTotal(){ //Complejidad O(n)
        double total = 0.00;
        for(Producto producto: productos){
            total += producto.getPrecio() * producto.getStock();
            System.out.println("El precio total de los productos es: " + total);
        }
    }

    /**
     * Metodo que escribe el precio total de a
     * @param categoria
     */
    public void precioCategoria(Categorias.categorias categoria){ //Complejidad O(n)
        double total = 0.00;
        for(Producto producto: productos){
            if(producto.getCategoria().equals(categoria)){
                total += producto.getPrecio() * producto.getStock();
            }
        }
        System.out.println("El precio total de los productos de la categoria " + categoria + " es: " + total);
    }
}
