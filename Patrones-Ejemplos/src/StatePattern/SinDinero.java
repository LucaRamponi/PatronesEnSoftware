package StatePattern;

// Clase concreta que implementa un estado específico (Sin dinero)
class SinDinero implements EstadoMaquina {
    @Override
    public void insertarMoneda() {
        System.out.println("Moneda insertada. Estado cambiado a Selección realizada.");
    }

    @Override
    public void seleccionarProducto() {
        System.out.println("No hay suficiente dinero. Inserte más monedas.");
    }

    @Override
    public void entregarProducto() {
        System.out.println("Seleccione primero un producto.");
    }
}