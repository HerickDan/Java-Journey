package poo;

public class POO {
    public static void main(String [] args){
        Carro meuCarro1 = new Carro("Fox");
        Carro meuCarro2 = new Carro("Gol");
        Carro.acelerando();
    }
}

class Carro {
    String modelo;
    public Carro(String modelo){
        this.modelo = modelo;
        System.out.println("Modelo do carro:" + modelo);
    }
    public static void acelerando (){
        System.out.println("Estou acelerando");
    }
}