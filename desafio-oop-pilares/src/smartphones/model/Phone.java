package smartphones.model;

import smartphones.model.utils.CorSmartPhone;
import smartphones.model.utils.TipoDoTeclado;


public class Phone {
    private int fabricacaoNumero;
    private CorSmartPhone cor;
    private TipoDoTeclado tipoTeclado;

    


    public int getFabricacaoNumero() {
        return fabricacaoNumero;
    }
    public void setFabricacaoNumero(int fabricacaoNumero) {
        this.fabricacaoNumero = fabricacaoNumero;
    }
    public CorSmartPhone getCor() {
        return cor;
    }
    public void setCor(CorSmartPhone cor) {
        this.cor = cor;
    }
    public TipoDoTeclado getTipoTeclado() {
        return tipoTeclado;
    }
    public void setTipoTeclado(TipoDoTeclado tipoTeclado) {
        this.tipoTeclado = tipoTeclado;
    } 


    
}
