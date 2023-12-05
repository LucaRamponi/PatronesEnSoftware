package DecoratorPattern;

public class ChocolateDecorator implements Decorator {
    private Cafe cafeADecorar;

    public ChocolateDecorator(Cafe cafe) {
        this.cafeADecorar = cafe;
    }

    @Override
    public String obtenerDescripcion() {
        return cafeADecorar.obtenerDescripcion() + ", con chocolate";
    }

    @Override
    public double costo() {
        return cafeADecorar.costo() + 75.0;
    }
}