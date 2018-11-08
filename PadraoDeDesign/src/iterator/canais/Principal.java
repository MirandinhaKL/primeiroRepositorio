package iterator.canais;

import java.util.Iterator;

/**
 * @author kmiranda
 */
public class Principal {

    public static void main(String[] args) {

        AgregadoDeCanais canaisDeEsportes = new CanaisEsporte();
        System.out.println("Canais de Esporte: ");

        for (InterfaceIterador iterador = canaisDeEsportes.createIterator();
                !iterador.isDone(); iterador.next()) {
            System.out.println(iterador.currentItem().toString());
        }

        AgregadoDeCanais canaisDeFilmes = new CanaisFilmes();
        System.out.println("\nCanais de Filmes:");
        for (InterfaceIterador iterador = canaisDeFilmes.createIterator(); 
                !iterador.isDone(); iterador.next()) {
            System.out.println(iterador.currentItem().toString());
        }
    }
}
