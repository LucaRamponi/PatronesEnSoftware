package SingletonPattern;

public class ConfigurationManager {
    // Instancia privada y estática del ConfigurationManager
    private static ConfigurationManager instance;

    // En estos atributos guardamos la configuración del juego
    private String tituloJuego;
    private int anchoPantalla;
    private int altoPantalla;
    private boolean sonidoActivado;

    // Constructor privado para evitar que otros puedan instanciarlo, recordemos, solo puede haber una instancia!!!
    private ConfigurationManager() {
        // Configuración predeterminada
        tituloJuego = "Mi Juego";
        anchoPantalla = 800;
        altoPantalla = 600;
        sonidoActivado = true;
    }

    // Método público para obtener la instancia del ConfigurationManager, este es el método que vamos a poder llamar desde cualquier parte de nuestro juego!
    public static ConfigurationManager getInstance() {
        if (instance == null) {
            // Si no existe la instancia, es momento de crearla.
            instance = new ConfigurationManager();
        }
        // Si ya existe, la devuelvo
        return instance;
    }

    // Getters y setters
    public String getTituloJuego() {
        return tituloJuego;
    }

    public void setTituloJuego(String tituloJuego) {
        this.tituloJuego = tituloJuego;
    }

    public int getAnchoPantalla() {
        return anchoPantalla;
    }

    public void setAnchoPantalla(int anchoPantalla) {
        this.anchoPantalla = anchoPantalla;
    }

    public int getAltoPantalla() {
        return altoPantalla;
    }

    public void setAltoPantalla(int altoPantalla) {
        this.altoPantalla = altoPantalla;
    }

    public boolean isSonidoActivado() {
        return sonidoActivado;
    }

    public void setSonidoActivado(boolean sonidoActivado) {
        this.sonidoActivado = sonidoActivado;
    }
}