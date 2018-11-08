package iterator.alimento;

/**
 *
 * @author kmiranda
 */
public class FornecedorGama implements Agregado {
    
    private Alimento[] vetorDeAlimentos;

    public FornecedorGama(){
        vetorDeAlimentos = new Alimento[5];
        
    }
    
    Alimento alimento1 = new Alimento("Uva", "Vale do Cai", 1000);
    Alimento alimento2 = new Alimento("Laranja", "Vale do Cai", 3000);
    Alimento alimento3 = new Alimento("Kiwi", "Vale do Cai", 2000);
    Alimento alimento4 = new Alimento("Limão", "Vale do Cai", 5000);

    @Override
    public Iterador createIterator() {
        return new IteradorDeMatriz(vetorDeAlimentos);
        
    }
    
}
