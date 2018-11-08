/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package iterator.canais;

import iterator.canais.AgregadoDeCanais;
import iterator.canais.Canal;
import iterator.canais.InterfaceIterador;

/**
 * @author kmiranda
 */
public class CanaisFilmes implements AgregadoDeCanais {

    protected Canal[] matrizDeCanais;

    public CanaisFilmes() {
        matrizDeCanais = new Canal[5];
        matrizDeCanais[0] = new Canal("Telecine Premium", 90);
        matrizDeCanais[1] = new Canal("Telecine Pipoca", 91);
        matrizDeCanais[2] = new Canal("Telecine Light", 92);
        matrizDeCanais[3] = new Canal("HBO", 95);
        matrizDeCanais[4] = new Canal("TNT", 96);
    }

    @Override
    public InterfaceIterador createIterator() {
        return new IteradorMatrizDeCanais(matrizDeCanais);
    }

    /*
        Código para impressão do vetor.
        Somente utilizado para comparação.
     */
    public void imprimeVetor() {
        for (int i = 0; i < matrizDeCanais.length; i++) {
            System.out.println(matrizDeCanais[i].nome);
            System.out.println(matrizDeCanais[i].numero);
        }
    }

}
