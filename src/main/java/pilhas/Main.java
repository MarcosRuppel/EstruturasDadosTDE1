package pilhas;

/**
 *
 * @author Marcos P Ruppel
 */
public class Main {
    public static void main(String[] args) {
        Pilha pilha = new Pilha(5);

        pilha.inserir(10);
        pilha.inserir(20);
        pilha.inserir(30);

        System.out.println("Topo da pilha: " + pilha.getTopo());
        System.out.println("Removendo elemento: " + pilha.remover());
        System.out.println("Topo da pilha após remoção: " + pilha.getTopo());
    }
}
