package StatePattern;

// Clase que actúa como contexto y mantiene una referencia al estado actual
class MaquinaExpendedora {
    private EstadoMaquina estadoActual;

    public MaquinaExpendedora() {
        // Inicializamos la máquina en el estado Sin dinero
        this.estadoActual = new SinDinero();
    }

    public void setEstadoActual(EstadoMaquina nuevoEstado) {
        this.estadoActual = nuevoEstado;
    }

    public void insertarMoneda() {
        estadoActual.insertarMoneda();
        if (estadoActual instanceof SinDinero) {
            // Cambiamos a SeleccionRealizada si estaba en SinDinero
            setEstadoActual(new SeleccionRealizada());
        }
    }

    public void seleccionarProducto() {
        estadoActual.seleccionarProducto();
    }

    public void entregarProducto() {
        estadoActual.entregarProducto();
        if (estadoActual instanceof SeleccionRealizada) {
            // Cambiamos a SinDinero si estaba en SeleccionRealizada
            setEstadoActual(new SinDinero());
        }
    }
}