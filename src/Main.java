import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int eleccion = 1;
        int eleccion2 = 0;
        int eleccion3 = 0;
        Inventario Inventario = new Inventario();
        Producto iphone = new Producto("1", "iPhone", 1000.00, 20, Categorias.categorias.ACCESORIOS);
        Producto macbook = new Producto("2", "MacBook", 2000.00, 15, Categorias.categorias.PORTATIL);
        Producto raton = new Producto("3", "Raton", 50.00, 100, Categorias.categorias.ACCESORIOS);
        Producto ipad = new Producto("4", "iPad", 800.00, 30, Categorias.categorias.TABLET);
        Producto teclado = new Producto("5", "Teclado", 70.00, 80, Categorias.categorias.ACCESORIOS);
        Producto surface = new Producto("6", "Surface", 1500.00, 10, Categorias.categorias.TABLET);
        Producto asus = new Producto("7", "Asus", 1200.00, 25, Categorias.categorias.PORTATIL);
        Inventario.add(iphone);
        Inventario.add(macbook);
        Inventario.add(raton);
        Inventario.add(ipad);
        Inventario.add(teclado);
        Inventario.add(surface);
        Inventario.add(asus);
        while(eleccion != 0){
            System.out.println("Elige una opcion:");
            System.out.println("1. Buscar productos");
            System.out.println("2. Cambiar valores de un producto");
            System.out.println("3. Vender producto");
            System.out.println("0. Salir");
            eleccion = sc.nextInt();
            switch(eleccion){
                case 1:
                    System.out.println("Elige una opcion:");
                    System.out.println("1. Listar todos los productos");
                    System.out.println("2. Listar productos por categoria");
                    System.out.println("3. Buscar producto por nombre");
                    eleccion2 = sc.nextInt();
                    switch(eleccion2) {
                        case 1:
                            Inventario.ListatoString();
                            break;
                        case 2:
                            System.out.println("Elige una categoria:");
                            System.out.println("1. PORTATIL");
                            System.out.println("2. TABLET");
                            System.out.println("3. ACCESORIOS");
                            eleccion3 = sc.nextInt();
                            switch (eleccion3) {
                                case 1:
                                    Inventario.PorCategoriaToString(Categorias.categorias.PORTATIL);
                                    break;
                                case 2:
                                    Inventario.PorCategoriaToString(Categorias.categorias.TABLET);
                                    break;
                                case 3:
                                    Inventario.PorCategoriaToString(Categorias.categorias.ACCESORIOS);
                                    break;
                                default:
                                    System.out.println("Opcion no valida");
                                    break;
                            }
                            break;
                        case 3:
                            System.out.println("Introduce el nombre del producto:");
                            String nombre = sc.next();
                            Inventario.BuscarProducto(nombre);
                            break;
                    }
                    break;
                case 2:
                    System.out.println("1. Stock");
                    System.out.println("2. Precio");
                    eleccion2 = sc.nextInt();
                    switch (eleccion2) {
                        case 1:
                            System.out.println("Introduce el codigo del producto:");
                            String codigo = sc.next();
                            System.out.println("Introduce el nuevo stock:");
                            int stock = sc.nextInt();
                            Inventario.cambioStock(codigo, stock);
                            break;
                        case 2:
                            System.out.println("Introduce el codigo del producto:");
                            String codigo2 = sc.next();
                            System.out.println("Introduce el nuevo precio:");
                            double precio = sc.nextDouble();
                            Inventario.cambioPrecio(codigo2, precio);
                            break;
                    }
                    break;
                case 3:
                    System.out.println("Introduce el nombre del producto:");
                    String nombre = sc.next();
                    System.out.println("Introduce la cantidad a vender:");
                    int cantidad = sc.nextInt();
                    Inventario.venderProducto(nombre, cantidad);
                    break;
                case 0:
                    System.out.println("Saliendo...");
                    break;
                default:
                    System.out.println("Opcion no valida");
                    break;
            }
        }
    }
}