package pilhas;

/**
 *
 * @author Marcos P Ruppel
 */
public class Pilha {
    private int[] elementos;
    private int topo;
    private int capacidade;

    public Pilha(int capacidade) {
        this.capacidade = capacidade;
        elementos = new int[capacidade];
        topo = -1; // Indicando que a pilha está vazia
    }

    public void inserir(int elemento) {
        if (cheia()) {
            System.out.println("A pilha está cheia. Não é possível adicionar mais elementos.");
            return;
        }
        elementos[++topo] = elemento;
    }

    public int remover() {
        if (vazia()) {
            System.out.println("A pilha está vazia. Não há elementos para remover.");
            return -1; // Valor de retorno para indicar que a pilha está vazia
        }
        return elementos[topo--];
    }

    public int getTopo() {
        if (vazia()) {
            System.out.println("A pilha está vazia.");
            return -1;
        }
        return elementos[topo];
    }

    public boolean vazia() {
        return topo == -1;
    }

    public boolean cheia() {
        return topo == capacidade - 1;
    }

    public int tamanho() {
        return topo + 1;
    }
}
