package FactoryPattern.ConPatronDeDiseño;

public class HamburguesaDePollo implements HamburguesaBase {
    @Override
    public void preparar(){
        System.out.println("Creo una hamburguesa de pollo");
    }
}
