package equipamentos.impressoras;

// Usamos o "implements" para associar a interface que queros usar.
public class Deskjet implements Impressora{
    public void imprimir(){
        System.out.println("(Deskjet) Imprimindo...");
    }
}
