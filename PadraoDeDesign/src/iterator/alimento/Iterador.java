
package iterator.alimento;

/**
 *
 * @author kmiranda
 */
public interface Iterador {
    
    /**
     * Inicia o iterador.
     */
    public void first();
    
    /**
     * Avança o iterador.
     */
    public void next();
    
    /**
     * Verifica se já encerrou o percurso. 
     * @return true, se o agregado tiver finalizado.
     */
    public boolean isDone();
    
    /**
     * @return Retorna o objeto atual.
     */
    public Object currentItem();
            
}
