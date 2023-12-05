package FactoryPattern.SinPatronDeDiseño.ConInterface;

public class Restaurante {
    public HamburguesaGenerica prepararHamburguesa(String pedido){
        HamburguesaGenerica hamburguesa = null;

        if (pedido == "Clasica"){
            hamburguesa = new HamburguesaClasica();
            hamburguesa.preparar();
        } else if (pedido == "De pollo") {
            hamburguesa = new HamburguesaDePollo();
            hamburguesa.preparar();
        }

        return hamburguesa;
    }
}
