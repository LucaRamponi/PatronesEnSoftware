package DecoratorPattern;

public class LecheDecorator implements Decorator {
    private Cafe cafeADecorar;

    public LecheDecorator(Cafe cafe) {
        this.cafeADecorar = cafe;
    }

    @Override
    public String obtenerDescripcion() {
        return cafeADecorar.obtenerDescripcion() + ", con leche";
    }

    @Override
    public double costo() {
        return cafeADecorar.costo() + 50.0;
    }
}