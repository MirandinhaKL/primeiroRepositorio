package iterator.alimento;

import java.util.ArrayList;

public class IteradorDeArrayList implements Iterador {

    protected ArrayList<Alimento> lista;
    protected int contador;
    
    public IteradorDeArrayList(ArrayList<Alimento> lista){
        this.lista = lista;
        this.contador = 0;
    }

    @Override
    public void first() {
        this.contador = 0;
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
    public Object currentItem() {
        if (isDone()) {
            contador = lista.size() - 1;
        } else if (contador < 0) {
            contador = 0;
        }
        return lista.get(contador);
    }
}
