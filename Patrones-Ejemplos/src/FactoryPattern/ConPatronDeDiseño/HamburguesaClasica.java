package FactoryPattern.ConPatronDeDiseño;

public class HamburguesaClasica implements HamburguesaBase {
    @Override
    public void preparar(){
        System.out.println("Creo una hamburguesa clasica");
    }
}
