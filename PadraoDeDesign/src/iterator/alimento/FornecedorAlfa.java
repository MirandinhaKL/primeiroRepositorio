package iterator.alimento;

import java.util.ArrayList;

/**
 * @author kmiranda
 */
public class FornecedorAlfa implements Agregado {

    private ArrayList<Alimento> listaDeAlimentos;

    public FornecedorAlfa() {

        listaDeAlimentos = new ArrayList<>();
        listaDeAlimentos.add(alimento1);
        listaDeAlimentos.add(alimento2);
        listaDeAlimentos.add(alimento3);
        listaDeAlimentos.add(alimento4);

    }

    Alimento alimento1 = new Alimento("Arroz", "Tio João", 150);
    Alimento alimento2 = new Alimento("Feijão", "Tio João", 300);
    Alimento alimento3 = new Alimento("Batata", "Santa Lucia", 2000);
    Alimento alimento4 = new Alimento("Alface", "Medianeira", 150);

    @Override
    public Iterador createIterator() {
        return new IteradorDeArrayList(listaDeAlimentos);
    }
}
