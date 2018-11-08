/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package iterator.canais;

public class Canal {
 
    String nome;
    int numero;
    
    public Canal(String nome, int numero){
        this.nome = nome;
        this. numero =  numero;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    @Override
    public String toString() {
        return nome + ", " + numero;
    }

   
}
