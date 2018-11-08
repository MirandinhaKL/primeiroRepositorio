/*
A implementação desses métodos será feita no iterador concreto, levando em 
consideração o tipo do conjunto de dados. Vamos mostrar primeiro a implementação
do iterador do ArrayList. Apesar de já existir o Iterador de um ArrayList nativo
do Java, vamos criar o nosso próprio Iterator.
*/

package iterator.canais;

import java.util.ArrayList;

/**
 * @author kmiranda
 */

public class IteradorListaDeCanais implements InterfaceIterador {
    
    protected ArrayList<Canal> lista;
    protected int contador;
    
    public IteradorListaDeCanais(ArrayList<Canal> lista){
        this.lista = lista;
        this.contador = 0;
    }

    @Override
    public void first() {
        contador = 0;
    }

    @Override
    public void next() {
        contador++;
    }

    @Override
    public boolean isDone() {
        return contador == lista.size();
    }

    @Override
    public Canal currentItem() {
        if (isDone()) {
            contador = lista.size() - 1;
        } else if(contador < 0){
            contador = 0;
        }
        return lista.get(contador);
    }
}
