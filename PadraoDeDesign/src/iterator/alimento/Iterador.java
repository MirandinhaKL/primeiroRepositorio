/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
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
