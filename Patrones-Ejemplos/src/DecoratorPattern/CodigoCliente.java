package DecoratorPattern;

public class CodigoCliente {
    public static void main(String[] args) {

                // Café simple
                Cafe miCafe = new CafeSimple();
                System.out.println("Descripción: " + miCafe.obtenerDescripcion());
                System.out.println("Costo: $" + miCafe.costo()+"\n\n");

                // Decoramos el café con leche y chocolate
                miCafe = new LecheDecorator(miCafe);
                miCafe = new ChocolateDecorator(miCafe);

                // Café decorado
                System.out.println("Descripción: " + miCafe.obtenerDescripcion());
                System.out.println("Costo: $" + miCafe.costo());
            }
        }


