package iterator.alimento;

import java.util.ArrayList;

/**
 * @author kmiranda
 */
public class FornecedorBeta implements Agregado {

    private ArrayList<Alimento> listaDeAlimentos;

    public FornecedorBeta() {
        listaDeAlimentos = new ArrayList<>();
        listaDeAlimentos.add(alimento1);
        listaDeAlimentos.add(alimento2);
        listaDeAlimentos.add(alimento3);
       // listaDeAlimentos.add(alimento4);
    }

    Alimento alimento1 = new Alimento("Amendoim", "Vale do Cai", 1500);
    Alimento alimento2 = new Alimento("Feijão", "Comil", 3000);
    Alimento alimento3 = new Alimento("Lentilha", "Comil", 2000);

    @Override
    public Iterador createIterator() {
        return new IteradorDeArrayList(listaDeAlimentos);
    }
}
