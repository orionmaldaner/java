package venda_veiculos;

public class Veiculo {
    private String modelo;
    private String anoFabricacao;
    private String transmissao;
    private float valor;
    private CorEnum corEnum;
    
    public enum CorVeiculo {BRANCO, PRETO, PRATA}

    public Veiculo(String modelo, String anoFabricacao, String transmissao, float valor) {
        this.modelo = modelo;
        this.anoFabricacao = anoFabricacao;
        this.transmissao = transmissao;
        this.valor = valor;
    }
        public Veiculo(String modelo, String anoFabricacao, String transmissao, float valor, CorEnum corCarro) {
        this.modelo = modelo;
        this.anoFabricacao = anoFabricacao;
        this.transmissao = transmissao;
        this.valor = valor;
        this.corEnum = corCarro;
    }
    public Veiculo(String modelo, String anoFabricacao, CorEnum corEnum) {      //construtor que esta sendo usado
        this.modelo = modelo;
        this.anoFabricacao = anoFabricacao;
        this.corEnum = corEnum;
    }
    
        public Veiculo(String modelo, String anoFabricacao) {  
        this.modelo = modelo;
        this.anoFabricacao = anoFabricacao;  
    }

    public String getModelo() {
        return modelo;
    }

    public String getAnoFabricacao() {
        return anoFabricacao;
    }

    public String getTransmissao() {
        return transmissao;
    }

    public float getValor() {
        return valor;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public void setAnoFabricacao(String anoFabricacao) {
        this.anoFabricacao = anoFabricacao;
    }

    public void setTransmissao(String transmissao) {
        this.transmissao = transmissao;
    }

    public void setValor(float valor) {
        this.valor = valor;
    }

    public CorEnum getCorEnum() {
        return corEnum;
    }

    public void setCorEnum(CorEnum corEnum) {
        this.corEnum = corEnum;
    }
    
    
    
    
}
