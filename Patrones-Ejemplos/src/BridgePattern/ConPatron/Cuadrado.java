package BridgePattern.ConPatron;

public class Cuadrado implements Forma  {

        private final DibujoAPI dibujoAPI;

        public Cuadrado(DibujoAPI dibujoAPI) {
            this.dibujoAPI = dibujoAPI;
        }

        @Override
        public void dibujar() {
            //primero llama a la API de dibujo, puede ser la de Windows o Linux,
            // cada una ejecuta el codigo necesario, antes del dibujo mísmo
            dibujoAPI.dibujarForma();
            // Codigo adicional para dibujar un cuadrado
        }
    }
