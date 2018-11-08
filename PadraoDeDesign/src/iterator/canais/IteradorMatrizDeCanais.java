package iterator.canais;

import iterator.canais.Canal;
import iterator.canais.InterfaceIterador;

/**
 * @author kmiranda
 */
public class IteradorMatrizDeCanais implements InterfaceIterador{

    protected Canal[] matrizDeCanais;
    protected int contador;
    
    public IteradorMatrizDeCanais(Canal[] matriz){
        this.matrizDeCanais = matriz;
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
        return contador == matrizDeCanais.length;
    }

    @Override
    public Canal currentItem() {
        if (isDone()) {
            contador = matrizDeCanais.length - 1;
        } else if(contador < 0){
            contador = 0;
        }
        return matrizDeCanais[contador];
    }
}
