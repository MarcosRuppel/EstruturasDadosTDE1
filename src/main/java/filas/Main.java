package filas;

/**
 *
 * @author Marcos P Ruppel
 */
public class Main {
    public static void main(String[] args){
        Fila novaFila = new Fila(4);
        novaFila.insere(6);
        novaFila.insere(4);
        novaFila.insere(9);
        novaFila.insere(1);
        novaFila.imprime();
        novaFila.insere(8); // deve avisar que está cheia
        novaFila.remove();
        novaFila.remove();
        novaFila.remove();
        novaFila.imprime();
        novaFila.remove();
        novaFila.remove(); // deve avisar que está vazia
    }
}
