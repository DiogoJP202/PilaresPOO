package equipamentos.copiadoras;

// Usamos o "implements" para associar a interface que queros usar.
public class Xerox implements Copiadora{
    public void copiar(){
        System.out.println("(Xerox) Copiando ...");
    }
}
