package iterator.alimento;

/**
 * @author kmiranda
 */
public class Alimento {
    
    private String tipo;
    private String marca;
    private int estoque;
    
    public Alimento(String tipo, String marca, int estoque){
        this.tipo = tipo;
        this.marca = marca;
        this.estoque = estoque;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public int getEstoque() {
        return estoque;
    }

    public void setEstoque(int estoque) {
        this.estoque = estoque;
    }

    @Override
    public String toString() {
        return "tipo=" + tipo + ", marca=" + marca + ", estoque=" + estoque;
    }
    
}
