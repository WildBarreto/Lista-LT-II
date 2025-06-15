package exercicio5;
import exercicio5.Contato;
import java.util.HashSet;
/**
 *
 * @author imidi
 */
public class MainContato {
    public static void main(String[] args) {
        HashSet<Contato> contatos = new HashSet<>();

        Contato c1 = new Contato("Ana", "ana@email.com", "1111-1111");
        Contato c2 = new Contato("Bruno", "bruno@email.com", "2222-2222");
        Contato c3 = new Contato("Carlos", "ana@email.com", "3333-3333"); 

        contatos.add(c1);
        contatos.add(c2);
        contatos.add(c3); 

        for (Contato contato : contatos) {
            System.out.println(contato);
        }
    }
    
}
