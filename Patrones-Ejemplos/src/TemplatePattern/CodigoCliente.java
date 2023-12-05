package TemplatePattern;

public class CodigoCliente {

    //Codigo Cliente, probemos que devuelve cada uno!
    public static void main(String[] args) {
        System.out.println("Preparando té:");
        RecetaTemplate recetaDeTe = new RecetaDeTe();
        recetaDeTe.prepararReceta();

        System.out.println("\nPreparando café:");
        RecetaTemplate recetaDeCafe = new RecetaDeCafe();
        recetaDeCafe.prepararReceta();
    }
}