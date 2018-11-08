package padraodedesign.creator;

import java.util.Date;

/**
 * @author 5220088
 */
public class Venda {
    
    private Date dataVenda;
    
    public Venda(Date data){
        this.dataVenda = data;
    }

    public Date getDataVenda() {
        return dataVenda;
    }

    public void setDataVenda(Date dataVenda) {
        this.dataVenda = dataVenda;
    }
    
    
}
