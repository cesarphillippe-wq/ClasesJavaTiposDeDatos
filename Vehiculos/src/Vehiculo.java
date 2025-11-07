public class Vehiculo {

    String marca;
    int modelo;
    String color;
    String tipo;
    String consumo;

    public Vehiculo(String marca, int modelo, String color, String tipo,String consumo) {
        this.marca = marca;
        this.modelo = modelo;
        this.color = color;
        this.tipo = tipo;
        this.consumo = consumo;

    }

    public String getMarca() {
        return marca;
    }
    public int getModelo() {
        return modelo;
    }
    public String getColor() {
        return color;
    }
    public String getTipo() {
        return tipo;
    }
    public String getConsumo() {
        return consumo;
    }

    void Consumo(){
        System.out.println("Uso Gasolina");

    }
}
