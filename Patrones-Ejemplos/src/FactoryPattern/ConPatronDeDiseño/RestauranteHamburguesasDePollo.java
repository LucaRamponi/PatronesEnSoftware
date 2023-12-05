package FactoryPattern.ConPatronDeDiseño;

public class RestauranteHamburguesasDePollo extends Restaurante{
    @Override
    public HamburguesaGenerica crearHamburguesa(){
        return new HamburguesaDePollo();
    }
}
