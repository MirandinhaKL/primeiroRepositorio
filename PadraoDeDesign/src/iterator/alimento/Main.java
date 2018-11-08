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
public class Main {

    public static void main(String[] args) {

        System.out.println("Fornecedor Alfa");
        Agregado agreagadoAlfa = new FornecedorAlfa();
        for (Iterador iterador = agreagadoAlfa.createIterator(); !iterador.isDone(); iterador.next()) {
            System.out.println(iterador.currentItem().toString());
        }
        System.out.println("Fornecedor Beta");
        Agregado agreagadoBeta = new FornecedorBeta();
        for (Iterador iterador = agreagadoBeta.createIterator(); !iterador.isDone(); iterador.next()) {
            System.out.println(iterador.currentItem().toString());
        }
        System.out.println("Fornecedor Gama:");
        Agregado agreagadoGama = new FornecedorGama();
         for (Iterador iterador = agreagadoGama.createIterator(); !iterador.isDone(); iterador.next()) {
            System.out.println(iterador.currentItem().toString());
        }
    }
}
