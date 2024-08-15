package estabelecimento;

// Precisamos importar as classes que estão fora do pacote.
import equipamentos.impressoras.Impressora;
import equipamentos.impressoras.Deskjet;
import equipamentos.multifuncional.EquipamentoMultifuncional;

public class Fabrica {
    public static void main(String[] args) {
        EquipamentoMultifuncional equipamentoMultifuncional = new EquipamentoMultifuncional();

        equipamentoMultifuncional.copiar();
        equipamentoMultifuncional.ditalizar();
        equipamentoMultifuncional.imprimir();

    }
}
