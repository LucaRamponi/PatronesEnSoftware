package TemplatePattern;

abstract class RecetaTemplate {
    // El método de plantilla define el esqueleto del algoritmo
    public final void prepararReceta() {
        hervirAgua();
        hacerInfusion();
        verterEnTaza();
        if (clienteQuiereCondimentos()) {
            agregarCondimentos();
        }
    }

    // Métodos abstractos a ser implementados por clases concretas

    abstract void hacerInfusion();
    abstract void agregarCondimentos();

    // Métodos concretos con implementación predeterminada

    void hervirAgua() {
        System.out.println("Hirviendo agua");
    }

    void verterEnTaza() {
        System.out.println("Vertiendo en la taza");
    }

    // Método gancho que puede ser sobrescrito por subclases
    boolean clienteQuiereCondimentos() {
        return true;
    }
}