package DecoratorPattern;

public class CafeSimple implements Cafe {
    @Override
    public String obtenerDescripcion() {
        return "Café simple";
    }

    @Override
    public double costo() {
        return 200.0;
    }
}
