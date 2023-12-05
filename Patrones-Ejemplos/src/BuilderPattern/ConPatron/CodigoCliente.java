package BuilderPattern.ConPatron;

public class CodigoCliente {
    public static void main(String[] args) {

        //Al crear un auto nuevo, con el builder interno se veria asi:
        Auto auto = new Auto.AutoBuilderInterior()
                .modelo("Sedan")
                .marca("Toyota")
                .color("Blue")
                .chasis("123ABC")
                .rodado("Numero 26")
                .motor("V6")
                .cantidadPuertas(4)
                .build();

        //tambien puede verse asi:
        Auto auto2 = new Auto.AutoBuilderInterior()
                .color("Rojo")
                .build();

    }
}
