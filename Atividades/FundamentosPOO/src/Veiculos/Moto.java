package Veiculos;

// Herdando informações da Classe Veiculo
public class Moto extends Veiculo{

    // O polimorfismo está presente aqui, pois é uma forma diferente de ligar a moto.
    public void ligar(){
        System.out.println("Moto ligada.");
    }
}
