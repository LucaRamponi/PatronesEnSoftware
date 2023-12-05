package FactoryPattern.ConPatronDeDiseño;

public class RestauranteHamburguesasClasicas extends Restaurante{
    @Override
    public HamburguesaBase crearHamburguesa(){
        return new HamburguesaClasica();
    }
}
