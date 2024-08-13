package filas;

/**
 *
 * @author Marcos P Ruppel
 */
public class Fila {
    private int[] elementos;
    private int capacidade;
    private int primeiro;
    private int ultimo;

    public Fila(int capacidade){
        this.elementos = new int[capacidade];
        this.capacidade = capacidade;
        this.primeiro = -1;
        this.ultimo = -1;
    }

    public void insere(int num){
        if(!cheia()){
            if (ultimo == -1) {
                ultimo = 0;
                primeiro = 0;
            } else {
                ultimo++;
            }
            elementos[ultimo] = num;
            System.out.println("Inserido na fila.");
        } else {
            System.out.println("A fila está cheia!");
        }
    }

    public void remove(){
        if(!vazia()){
            if (ultimo != primeiro){
                elementos[primeiro] = -1;
                primeiro++;
                System.out.println("Removido da fila.");
            } else {
                elementos[primeiro] = -1;
                primeiro = -1;
                ultimo = -1;
            }
        } else {
            System.out.println("A fila está vazia!");
        }
    }

    public boolean cheia(){
        return (ultimo == capacidade-1);
    }

    public boolean vazia(){
        return (primeiro == -1 && ultimo == -1);
    }

    public void imprime(){
        for (int i=0; i<capacidade; i++){
            if (elementos[i] != -1){
                System.out.print(elementos[i] + " ");
            }
        }
        System.out.println();
    }

}
