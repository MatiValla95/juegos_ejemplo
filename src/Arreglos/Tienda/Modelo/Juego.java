package Arreglos.Tienda.Modelo;

public class Juego {
    private String nombre;
    private String categoria;
    private int tamaño;
    private double precio;
    private int licenciasdisponibles;
    private int licenciasvendidas;

    public Juego(String nombre, String categoria, int tamaño, double precio, int licenciasdisponibles) {
        this.nombre = nombre;
        this.categoria = categoria;
        this.tamaño = tamaño;
        this.precio = precio;
        this.licenciasdisponibles = licenciasdisponibles;
        licenciasvendidas = 0;
    }

    public String getNombre() {
        return nombre;
    }

    public String getCategoria() {
        return categoria;
    }

    public int getTamaño() {
        return tamaño;
    }

    public double getPrecio() {
        return precio;
    }

    public int getLicenciasdisponibles() {
        return licenciasdisponibles;
    }

    public int getLicenciasvendidas() {
        return licenciasvendidas;
    }

    public void setNombre(String nombre) {
        if(nombre != null && !nombre.trim().isEmpty()) {
            this.nombre = nombre;
        }
    }

    public void setCategoria(String categoria) {
        if(categoria != null && !categoria.trim().isEmpty()) {
            this.categoria = categoria;
        }
    }

    public void setTamaño(int tamaño) {
        if(tamaño > 0)
            this.tamaño = tamaño;
    }

    public void setPrecio(double precio) {
        if(precio > 0)
            this.precio = precio;
    }

    public boolean comprar(int cantidad) {
        if(cantidad > 0) {
            licenciasdisponibles += cantidad;
            return true;
        }
        return false;
    }

    public boolean vender(int cantidad) {
        if(cantidad > 0 && cantidad <= licenciasdisponibles) {
            licenciasdisponibles -= cantidad;
            licenciasvendidas += cantidad;
            return true;
        }
        return false;
    }
    // == en objetos compara si son iguales las direcciones de memoria, en cambio con  equals compara el texto de las variables y ver si es igual

    @Override
    public String toString() {
        return "Juego{" +
                "nombre='" + nombre + '\'' +
                ", categoria='" + categoria + '\'' +
                ", tamaño=" + tamaño +
                ", precio=" + precio +
                ", licenciasdisponibles=" + licenciasdisponibles +
                ", licenciasvendidas=" + licenciasvendidas +
                '}';
    }
}
