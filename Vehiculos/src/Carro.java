public class Carro extends Vehiculo {
    public Carro(String marca, int modelo, String color, String tipo,String consumo) {
        this.marca = marca;
        this.modelo = modelo;
        this.color = color;
        this.tipo = tipo;
        this.consumo = consumo;

    }


    @Override
     void Consumo(){
        System.out.println("Soy Electrico");
    }
}
