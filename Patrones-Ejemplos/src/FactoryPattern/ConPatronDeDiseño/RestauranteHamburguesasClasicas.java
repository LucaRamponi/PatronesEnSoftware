package FactoryPattern.ConPatronDeDiseño;

public class RestauranteHamburguesasClasicas extends Restaurante{
    @Override
    public HamburguesaGenerica crearHamburguesa(){
        return new HamburguesaClasica();
    }
}
