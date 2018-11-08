package iterator.alimento;

/**
 * @author kmiranda
 */
public class IteradorDeMatriz implements Iterador{

    private Alimento[] vetorDeAlimentos;
    private int contador;
    
    public IteradorDeMatriz(Alimento[] vetor){
        this.vetorDeAlimentos = vetor;
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
        return contador == vetorDeAlimentos.length;
    }

    @Override
    public Alimento currentItem() {
        if (isDone()) {
            contador = vetorDeAlimentos.length - 1;
        } else if(contador < 0){
            contador = 0;
        }
        return vetorDeAlimentos[contador];
    }
}
