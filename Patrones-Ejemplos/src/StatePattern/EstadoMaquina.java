package StatePattern;

// Interfaz que define los métodos comunes para los estados
interface EstadoMaquina {
    void insertarMoneda();
    void seleccionarProducto();
    void entregarProducto();
}