/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package iterator.canais;

import java.util.ArrayList;
import iterator.canais.AgregadoDeCanais;
import iterator.canais.Canal;
import iterator.canais.InterfaceIterador;
import iterator.canais.IteradorListaDeCanais;

/**
 * @author kmiranda
 */
public class CanaisEsporte implements AgregadoDeCanais{
    
    protected ArrayList<Canal> canais;
    
    public CanaisEsporte(){
        canais = new ArrayList<Canal>();
        canais.add(new Canal("Esporte ao Vivo", 25));
        canais.add(new Canal("Basquete 2018", 38));
        canais.add(new Canal("Campeonato Italiano", 70));
        canais.add(new Canal("Campeonato Espanhol", 89));
        canais.add(new Canal("Campeonato Português", 53));
    }
    
    @Override
    public InterfaceIterador createIterator(){
        return new IteradorListaDeCanais(canais);
    }
    
    /*
        Código para impressão do arrayList.
        Somente utilizado para comparação.
    */
    public void imprimeArrayList(){
        for (Canal canalEspecifico : canais) {
            System.out.println(canalEspecifico.nome);
            System.out.println(canalEspecifico.numero);
        }
    } 
}
           