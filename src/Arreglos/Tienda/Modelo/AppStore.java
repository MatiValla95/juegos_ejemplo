package Arreglos.Tienda.Modelo;

public class AppStore {
    private Juego juegos[];
    private int indice;
    private static final int MAX = 4;

    public AppStore() {
        juegos = new Juego[MAX];
        indice = -1;
    }

    public Juego[] getJuegos() {
        return juegos;
    }

  /*  public void setJuegos(Juego juegos[]) {
        this.juegos = juegos;
    }*/

    public boolean adicionarJuego(Juego j) {
        if (j != null && indice < MAX - 1) {
            juegos[indice++] = j;
            return true;
        }
        return false;
    }

    public Juego buscarJuego(String nombre) {
        if (nombre != null && !nombre.trim().isEmpty()) {
            for (int i = 0; i <= indice; i++) {
                if ((juegos[i].getNombre()).equals(nombre)) {
                    return juegos[i];
                }
            }
            return null;
        }
        return null;
    }

    public boolean comprarJuego(String nombre, int cantidad) {
        Juego j = buscarJuego(nombre);
        if (j != null) {
            return  j.comprar(cantidad);
        }
        return false;
    }

    public double vender(String nombre, int cantidad) {
        if (nombre != null && !nombre.trim().isEmpty() &&  cantidad > 0) {
            Juego j = buscarJuego(nombre);
            if (j != null) {
                if(j.vender(cantidad)) {
                    return j.getPrecio() * cantidad;
                }
            }
            return 0;
        }
        return 0;
    }
}
