package StatePattern;

// Ejemplo de uso
public class CodigoCliente {
    public static void main(String[] args) {

        MaquinaExpendedora maquina = new MaquinaExpendedora();
        maquina.seleccionarProducto();
        maquina.insertarMoneda();
        maquina.seleccionarProducto();
        maquina.entregarProducto();
        maquina.insertarMoneda();
    }
}
