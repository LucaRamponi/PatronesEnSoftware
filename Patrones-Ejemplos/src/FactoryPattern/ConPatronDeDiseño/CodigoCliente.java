package FactoryPattern.ConPatronDeDiseño;

public class CodigoCliente {
    public static void main(String[] args){

        //Inicializo mis restaurantes
        Restaurante restauranteHamburguesasDePollo = new RestauranteHamburguesasDePollo();
        Restaurante restauranteDeHamburguesasClasicas = new RestauranteHamburguesasClasicas();

        //Sirviendo las hamburguesas
        HamburguesaBase hamburguesaDePollo = restauranteHamburguesasDePollo.PedirHamburguesa();
        HamburguesaBase hamburguesaClasica = restauranteDeHamburguesasClasicas.PedirHamburguesa();
    }
}
