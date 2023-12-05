package BuilderPattern.SinPatron;

public class Auto {
    private String modelo;
    private String marca;
    private String color;
    private String chasis;
    private String rodado;
    private String motor;
    private Integer cantidadPuertas;
    //------------Constructores--------------

    //Constructor completo
    public Auto(String modelo, String marca, String color, String chasis, String rodado, String motor, Integer cantidadPuertas) {
        this.modelo = modelo;
        this.marca = marca;
        this.color = color;
        this.chasis = chasis;
        this.rodado = rodado;
        this.motor = motor;
        this.cantidadPuertas = cantidadPuertas;
    }

    // Para evitar esto........
    //Este constructor no tiene cantidad de puertas
    public Auto(String modelo, String marca, String color, String chasis, String rodado, String motor) {
        this.modelo = modelo;
        this.marca = marca;
        this.color = color;
        this.chasis = chasis;
        this.rodado = rodado;
        this.motor = motor;
    }

    //Este no tiene ni cantidad de puertas ni color
    public Auto(String modelo, String marca, String chasis, String rodado, String motor) {
        this.modelo = modelo;
        this.marca = marca;
        this.chasis = chasis;
        this.rodado = rodado;
        this.motor = motor;
    }
    //Y asi, escribiendo constructores casi Ad infinitum

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
}
