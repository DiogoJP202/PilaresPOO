package equipamentos.digitalizadoras;

// Usamos o "implements" para associar a interface que queros usar.
public class Scanner implements Digitalizadora{
    public void ditalizar() {
        System.out.println("(Scanner) Digitalizando...");
    }
}
