package Veiculos;

public class Autodromo {
    public static void main(String[] args) {
        Carro jeep = new Carro();
        jeep.setChasse("421321");
        jeep.ligar();

        Moto z400 = new Moto();
        z400.setChasse("581241");
        z400.ligar();

        // Polimorfismo:
        Veiculo coringa = z400;
        coringa.ligar();

        coringa = jeep;
        coringa.ligar();
    }
}
