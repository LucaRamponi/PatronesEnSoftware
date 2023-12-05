package FactoryPattern.ConPatronDeDiseño;

public abstract class Restaurante {
    public HamburguesaGenerica PedirHamburguesa (){
        HamburguesaGenerica hamburguesa = crearHamburguesa();   //Este metodo es implementado de forma diferente por cada restaurante!
        hamburguesa.preparar();                                 //Cada tipo de hamburguesa tiene un tipo de preparado diferente!
        return hamburguesa;
    }
    public abstract HamburguesaGenerica crearHamburguesa();
}
