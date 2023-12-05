package BridgePattern.ConPatron;

class Circulo implements Forma {
    private final DibujoAPI dibujoAPI;

    public Circulo(DibujoAPI dibujoAPI) {
        this.dibujoAPI = dibujoAPI;
    }

    @Override
    public void dibujar() {
        //primero llama a la API de dibujo, puede ser la de Windows o Linux, cada una ejecuta el codigo necesario, antes del dibujo mismo
        dibujoAPI.dibujarForma();
        // Codigo adicional para dibujar un circulo
    }
}