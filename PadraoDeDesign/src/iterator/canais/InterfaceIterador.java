package iterator.canais;

public interface InterfaceIterador {
    
    //Inicia o iterador.
    void first();
    //Verifica o iterador.
    void next();
    //Verifica se já encerrou o percurso.
    boolean isDone();
    //Retorna o objeto atual
    Object currentItem();
}
