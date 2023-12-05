package FactoryPattern.ConPatronDeDiseño;

public class RestauranteHamburguesasDePollo extends Restaurante{
    @Override
    public HamburguesaBase crearHamburguesa(){
        return new HamburguesaDePollo();
    }
}
