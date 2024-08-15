package Veiculos;

// Classe se tornando abstrata
public abstract class Veiculo {
    private String chasse;

    public String getChasse(){
        return this.chasse;
    }

    public void setChasse(String chasse){
        this.chasse = chasse;
    }

    // Dis que toda classe filha, precisará do método ligar
    public abstract void ligar();
}
