package BuilderPattern.ConPatron;

public class Auto {
    private String modelo;
    private String marca;
    private String color;
    private String chasis;
    private String rodado;
    private String motor;
    private Integer cantidadPuertas;


    //-----Constructores--------
    //Al utilizar el Builder como parametro, forzamos que la creacion de un auto pase por el proceso del builder.
    public Auto(AutoBuilderInterior builder) {
        this.modelo = builder.modelo;
        this.marca = builder.marca;
        this.color = builder.color;
        this.chasis = builder.chasis;
        this.rodado = builder.rodado;
        this.motor = builder.motor;
        this.cantidadPuertas = builder.cantidadPuertas;
    }

    public Auto(){
    }

    //Getters y Setters
    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getChasis() {
        return chasis;
    }

    public void setChasis(String chasis) {
        this.chasis = chasis;
    }

    public String getRodado() {
        return rodado;
    }

    public void setRodado(String rodado) {
        this.rodado = rodado;
    }

    public String getMotor() {
        return motor;
    }

    public void setMotor(String motor) {
        this.motor = motor;
    }

    public Integer getCantidadPuertas() {
        return cantidadPuertas;
    }

    public void setCantidadPuertas(Integer cantidadPuertas) {
        this.cantidadPuertas = cantidadPuertas;
    }


    //Aqui crearemos lo que llamamos un "Builder interior", o "Builder integrado"
    //es la clase de builder pero hecha dentro de la clase de auto, una clase interior!
    public static class AutoBuilderInterior{
        private String modelo;
        private String marca;
        private String color;
        private String chasis;
        private String rodado;
        private String motor;
        private Integer cantidadPuertas;

        public AutoBuilderInterior modelo(String modelo) {
            this.modelo = modelo;
            return this;
        }

        public AutoBuilderInterior marca(String marca) {
            this.marca = marca;
            return this;
        }

        public AutoBuilderInterior color(String color){
            this.color = color;
            return this;
        }

        public AutoBuilderInterior chasis(String chasis){
            this.chasis = chasis;
            return this;
        }
        public AutoBuilderInterior rodado(String rodado){
            this.rodado = rodado;
            return this;
        }
        public AutoBuilderInterior motor(String motor){
            this.motor = motor;
            return this;
        }
        public AutoBuilderInterior cantidadPuertas(Integer cantidadPuertas){
            this.cantidadPuertas = cantidadPuertas;
            return this;
        }
        public Auto build(){
            return new Auto(this);
        }
    }
}
