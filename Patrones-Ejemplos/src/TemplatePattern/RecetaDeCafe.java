package TemplatePattern;

// Clase concreta implementando otra receta específica
class RecetaDeCafe extends RecetaTemplate {
    @Override
    void hacerInfusion() {
        System.out.println("Goteando café a través del filtro");
    }

    @Override
    void agregarCondimentos() {
        System.out.println("Agregando azúcar y leche");
    }
}
