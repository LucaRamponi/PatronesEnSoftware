package SingletonPattern;

public class Juego {
    public static void main(String[] args) {
        // Obtiene la instancia del ConfigurationManager
        ConfigurationManager configManager = ConfigurationManager.getInstance();

        // Accede y modifica la configuración del juego
        System.out.println("Título Actual del Juego: " + configManager.getTituloJuego());

        // Cambiando el título del juego
        configManager.setTituloJuego("Super Juego de Aventuras");

        // Accede al título del juego actualizado
        System.out.println("Título Actualizado del Juego: " + configManager.getTituloJuego());

        //Muteo el juego
        configManager.setSonidoActivado(false);
    }
}