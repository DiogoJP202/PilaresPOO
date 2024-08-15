package equipamentos.multifuncional;

// Quando a classe está fora do mesmo pacote precisaremos importar as interfaces.
import equipamentos.copiadoras.Copiadora;
import equipamentos.digitalizadoras.Digitalizadora;
import equipamentos.impressoras.Impressora;

public class EquipamentoMultifuncional implements Copiadora, Digitalizadora, Impressora {
    @Override // Está sobre escrevendo o método, estamos herdando de algum lugar esse método.
    public void copiar() {
        System.out.println("(Equipamento Multifuncional) Copiando ...");
    }

    @Override
    public void ditalizar() {
        System.out.println("(Equipamento Multifuncional) Digitalizando...");
    }

    @Override
    public void imprimir() {
        System.out.println("(Equipamento Multifuncional) Imprimindo...");
    }
}
