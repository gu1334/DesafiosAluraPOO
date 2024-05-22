package br.com.dezafios.primeiro.carro;

public class ModeloCarro extends Carro{

    private int qunatasPortas;
    private String qualOcombustivel;

    public int getQunatasPortas() {
        return qunatasPortas;
    }

    public void setQunatasPortas(int qunatasPortas) {
        this.qunatasPortas = qunatasPortas;
    }

    public String getQualOcombustivel() {
        return qualOcombustivel;
    }

    public void setQualOcombustivel(String qualOcombustivel) {
        this.qualOcombustivel = qualOcombustivel;
    }
}
