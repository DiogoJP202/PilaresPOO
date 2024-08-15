package Veiculos;

// Herdando informações da Classe Veiculo
public class Carro extends Veiculo {
    // O polimorfismo está presente aqui, pois é uma forma diferente de ligar o carro.
    public void ligar(){
        System.out.println("Carro ligado.");
        confereCombustivel();
    }

    // Encapsulamento do método com o modificador "private"
    private void confereCombustivel(){
        confereCambio();
        System.out.println("Conferindo combustível.");
    }

    private void confereCambio(){
        System.out.println("Conferindo câmbio em P.");
    }
}
