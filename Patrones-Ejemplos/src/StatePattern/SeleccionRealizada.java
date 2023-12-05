package StatePattern;

// Clase concreta que implementa otro estado (Selección realizada)
class SeleccionRealizada implements EstadoMaquina {
    @Override
    public void insertarMoneda() {
        System.out.println("Ya ha insertado una moneda. Espere la entrega del producto.");
    }

    @Override
    public void seleccionarProducto() {
        System.out.println("Producto seleccionado. Espere la entrega del producto.");
    }

    @Override
    public void entregarProducto() {
        System.out.println("Producto entregado. Estado cambiado a Sin dinero.");
    }
}