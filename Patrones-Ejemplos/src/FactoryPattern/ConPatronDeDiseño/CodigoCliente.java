package FactoryPattern.ConPatronDeDiseño;

public class CodigoCliente {
    public static void main(String[] args){

        //Inicializo mis restaurantes
        Restaurante restauranteHamburguesasDePollo = new RestauranteHamburguesasDePollo();
        Restaurante restauranteDeHamburguesasClasicas = new RestauranteHamburguesasClasicas();

        //Sirviendo las hamburguesas
        HamburguesaGenerica hamburguesaDePollo = restauranteHamburguesasDePollo.PedirHamburguesa();
        HamburguesaGenerica hamburguesaClasica = restauranteDeHamburguesasClasicas.PedirHamburguesa();
    }
}
