package TemplatePattern;

// Clase concreta implementando una receta específica
class RecetaDeTe extends RecetaTemplate {
    @Override
    void hacerInfusion() {
        System.out.println("Haciendo la infusión de té");
    }

    @Override
    void agregarCondimentos() {
        System.out.println("Agregando limón");
    }

    // Sobrescribiendo el método gancho
    @Override
    boolean clienteQuiereCondimentos() {
        // Las subclases pueden personalizar el comportamiento del método gancho
        return false;
    }
}